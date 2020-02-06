package com.qa.challenge.tests.Exercise2;

import com.qa.challenge.PagesAutomationPractice.ContactFormPage;
import com.qa.challenge.PagesAutomationPractice.HomePage;
import com.qa.challenge.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContactFormValidationTests extends BaseTest {
    public static String URL = "http://automationpractice.com/";

    @Test(priority = 1)
    public void goToContactFormPageTest(){
        goTo(URL);

        HomePage hp = new HomePage();

        hp.clickContacUsButton();

        ContactFormPage cfp = new ContactFormPage();



        Assert.assertTrue(cfp.emailInputIsDisplayed());
        Assert.assertTrue(cfp.orderReferenceInputIsDisplayed());
        Assert.assertTrue(cfp.messageInputIsDisplayed());
        WebElement selDay = getWebDriver().findElement(By.id("id_contact"));
        selDay.click();
      //  Assert.assertTrue(getWebDriver().findElement(By.name("id_contact")).isDisplayed());
        Assert.assertTrue(cfp.sendBtnIsDisplayed());

        JavascriptExecutor js = (JavascriptExecutor )getWebDriver();
        js.executeScript("document.getElementById(\"id_contact\").options.selectedIndex = 2");
        //cfp.clickSubjectHeadingSelectSpan();


    }

    @Test(priority = 2)
    public void emailInputValidationTest(){
        ContactFormPage cfp = new ContactFormPage();

        cfp.clickSendBtn();

        Assert.assertTrue(cfp.isErrorBannerDisplayed());

        cfp.setTextOnEmailInput("#iw93i9jdjnf");

        cfp.clickSendBtn();

        Assert.assertTrue(cfp.isErrorBannerDisplayed());








    }



}
