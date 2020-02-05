package com.qa.challenge.Pages;

import com.qa.challenge.BasePage;
import org.openqa.selenium.By;


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

    //After Form
    String submissionText = By.xpath("/html/body/div[1]/div[2]/div/div/div/text()").toString();


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

    public void clickSendBtn(){
        click(contactFormBtnSend);
    }

    public boolean isSubmissionTextPresent()
    {
        if(!submissionText.isEmpty() || submissionText!= null ){
            return  true;
        }
        return false;
    }



}
