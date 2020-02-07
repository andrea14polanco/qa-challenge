package com.qa.challenge.PagesAutomationPractice;

import com.qa.challenge.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactFormPage extends BasePage {

    By subjectHeadingSelectSpan =  By.id("#uniform-id_contact > span");
    By emailInput =  By.id("email");
    By orderReferenceInput =  By.id("id_order");
    By messageInput =  By.id("message");
    By sendBtn = By.id("submitMessage");
    By errorBanner = By.cssSelector("div.alert.alert-danger");
    By successBanner = By.cssSelector("#center_column > p");


    public boolean subjectHeadingSelectIsDisplayed(){
        JavascriptExecutor js = (JavascriptExecutor )getWebDriver();
        return  js.executeScript("return document.getElementById(\"id_contact\").options.length").toString() != "0";
    }

    public boolean emailInputIsDisplayed(){
        return isElementVisible(emailInput);
    }

    public boolean orderReferenceInputIsDisplayed(){
        return isElementVisible(orderReferenceInput);
    }

    public boolean messageInputIsDisplayed(){
        return isElementVisible(messageInput);
    }

    public boolean sendBtnIsDisplayed(){
        return isElementVisible(sendBtn);
    }

    public boolean isErrorBannerDisplayed(){
        return isElementVisible(errorBanner);
    }
    public boolean isSuccessBannerDisplayed(){
        JavascriptExecutor js = (JavascriptExecutor )getWebDriver();
        return  js.executeScript("return document.getElementsByClassName(\"alert\").length").toString() != "0";
    }


    public void clickSendBtn(){
        click(sendBtn);
    }

    public void setTextOnEmailInput(String text){
            writeText(emailInput, text);
    }


    public void setTextOnMessageInput(String text){
            writeText(messageInput, text);
    }

    public void setSubjectInput(){
        JavascriptExecutor js = (JavascriptExecutor )getWebDriver();
        js.executeScript("document.getElementById(\"id_contact\").options.selectedIndex = 2");
    }

}
