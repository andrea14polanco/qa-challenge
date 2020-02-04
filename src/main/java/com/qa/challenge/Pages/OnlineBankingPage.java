package com.qa.challenge.Pages;

import com.qa.challenge.BasePage;
import org.openqa.selenium.By;

public class OnlineBankingPage extends BasePage {
    By onlineBankNavBarBtn = By.id("onlineBankingMenu");
    By onlineBankNavBarBtnClass = By.cssSelector("#onlineBankingMenu.active");
    By onlineBankingFeaturesDiv = By.id("online_banking_features");
    By nav = By.id("nav");


    public void clickOnlineBankNavBarBtn(){
        click(onlineBankNavBarBtn);
    }

    public boolean isAtOnlineBankingPage(){
        return     isElementVisible(onlineBankingFeaturesDiv) && onlineBankNavBarBtnClass != null;
    }

    public boolean isNavBarPresent(){
        return isElementVisible(nav);
    }
}
