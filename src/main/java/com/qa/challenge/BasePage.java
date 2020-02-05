package com.qa.challenge;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ResourceBundle;

public class BasePage {
    private static WebDriver webDriver;
    private static WebDriverWait wait;
    public static ResourceBundle resourceBundle;

    public BasePage() {
        resourceBundle = ResourceBundle.getBundle("config");
    }

    public void startDrivers() {
        System.setProperty(resourceBundle.getString("driver-key"), resourceBundle.getString("driver-path"));

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);

        webDriver = new ChromeDriver(options);
        webDriver.manage().window().maximize();

        wait = new WebDriverWait(webDriver, 20,2);
    }

    public void killDriver() {
        webDriver.close();
        webDriver.quit();
    }

    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void waitInvisibility(By elementBy){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(elementBy));
    }

    public void click(By elementBy) {
        waitVisibility(elementBy);
        webDriver.findElement(elementBy).click();
    }

    public void writeText(By elementBy, String text) {

        waitVisibility(elementBy);
        clearInput(elementBy);
        webDriver.findElement(elementBy).sendKeys(text);
    }
    public void clearInput(By elementBy) {
        webDriver.findElement(elementBy).clear();
    }

    public String readText(By elementBy) {

        waitVisibility(elementBy);
        return webDriver.findElement(elementBy).getText();
    }

    public void goTo(String url) {
        webDriver.get(url);
    }

    public boolean isAt(String title) {
        return title.equals(webDriver.getTitle());
    }

    public boolean isElementVisible(By elementBy){
        return  webDriver.findElement(elementBy).isDisplayed();
    }

    public boolean isElementPresentOnPage(By elementBy){
        return  webDriver.findElements(elementBy).size() !=0;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public WebDriverWait getWebDriverWait() {
        return wait;
    }

    public boolean isAnExistingElement(By elementBy){
        if (webDriver.findElements(elementBy).size()!=0)
            return true;
        return false;
    }
}
