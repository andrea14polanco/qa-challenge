package com.qa.challenge.PagesAutomationPractice;

import com.qa.challenge.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    By contactUsBtn = By.id("contact-link");



    public void clickContacUsButton(){
        click(contactUsBtn);
    }


}
