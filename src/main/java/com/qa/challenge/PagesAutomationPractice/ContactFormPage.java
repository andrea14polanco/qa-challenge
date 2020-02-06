package com.qa.challenge.PagesAutomationPractice;

import com.qa.challenge.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactFormPage extends BasePage {

    By subjectHeadingSelectSpan =  By.id("#uniform-id_contact > span");
    By emailInput =  By.id("email");
    By orderReferenceInput =  By.id("id_order");
    By messageInput =  By.id("message");
    By sendBtn = By.id("submitMessage");
    By errorBanner = By.cssSelector("div.alert.alert-danger");

    public boolean subjectHeadingSelectIsDisplayed(){
        getWebDriverWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("id_contact")));
        return getWebDriver().findElement(By.id("id_contact")).isDisplayed();
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

    public void clickSendBtn(){
        click(sendBtn);
    }

    public void clickSubjectHeadingSelectSpan(){
        click(subjectHeadingSelectSpan);
    }

    public void setTextOnEmailInput(String text){
            writeText(emailInput, text);
    }


}
