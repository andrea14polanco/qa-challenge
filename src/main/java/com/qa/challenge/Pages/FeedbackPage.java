package com.qa.challenge.Pages;

import com.qa.challenge.BasePage;
import org.openqa.selenium.By;

public class FeedbackPage extends BasePage {
    By feedNavBarBtn = By.id("feedback");
    By feedNavBarBtnClass = By.cssSelector("#feedback > div > strong");
    By feedBackTitle = By.id("feedback-title");

    By nav = By.id("nav");

    public void clickFeedNavBarBtn(){
        click(feedNavBarBtnClass);
    }

    public boolean isAtFeedbackPage(){
        return  isElementVisible(feedBackTitle);
    }

    public boolean isNavBarPresent(){
        return isElementVisible(nav);
    }
}
