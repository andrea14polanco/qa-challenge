package com.qa.challenge.Pages;

import com.qa.challenge.BasePage;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class FeedbackPage extends BasePage {
    By feedNavBarBtn = By.id("feedback");
    By feedNavBarBtnClass = By.cssSelector("#feedback > div > strong");
    By feedBackTitle = By.id("feedback-title");

    //Form elements
    By contactFormInptName = By.id("name");
    By contactFormInptEmail = By.id("email");
    By contactFormInptSubject= By.id("subject");
    By contactFormInptComments= By.id("comment");
    By contactFormBtnSend = By.cssSelector("input.btn-signin.btn.btn-primary"); //Doesnt have ID  so used cssSelector

    By nav = By.id("nav");

    public void clickFeedNavBarBtn(){
        click(feedNavBarBtnClass);
    }
    public boolean isAtFeedbackPage(){
        return  isElementVisible(feedBackTitle);
    }
    public boolean isNavBarPresent(){
        return isElementPresentOnPage(nav);
    }
    public void fillContactFormInptName(String text){
        writeText(contactFormInptName,  text);
    }
    public void fillContactFormInptEmail(String text){
        writeText(contactFormInptEmail,  text);
    }
    public void fillContactFormInptSubject(String text){
        writeText(contactFormInptSubject,  text);
    }
    public void fillContactFormInptComments(String text){
        writeText(contactFormInptComments,  text);
    }
    public void clickSendBtn() {
        click(contactFormBtnSend);
    }

    public boolean isSendMessageBtnPresent() {
        return isElementPresentOnPage(contactFormBtnSend);
    }
}
