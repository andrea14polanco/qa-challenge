package com.qa.challenge.Pages;

import com.qa.challenge.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    private static String URL = "http://zero.webappsecurity.com/index.html";
    By homeNavBarBtn = By.id("homeMenu");
    By homeNavBarBtnClass = By.cssSelector("#homeMenu.active");
    By carousel = By.id("carousel");
    By nav = By.id("nav");


    public HomePage() {
        goTo(URL);
    }

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
