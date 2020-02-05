package com.qa.challenge.Pages;

import com.qa.challenge.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    By homeNavBarBtn = By.id("homeMenu");
    By homeNavBarBtnClass = By.cssSelector("#homeMenu.active");
    By carousel = By.id("carousel");
    By nav = By.id("nav");


    public void clickHomeNavBarBtn(){
        click(homeNavBarBtn);
    }

    public boolean isAtHomePage(){
        return     isElementVisible(carousel) && homeNavBarBtnClass != null;
    }

    public boolean isNavBarPresent(){
            return isElementVisible(nav);
    }


}
