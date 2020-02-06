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
    HomePage hp;
    ContactFormPage cfp;

    private static String  data = "ssssssssssssssssssssasssssssssssssssssssssssssssasssssssssssssssssssssssssssasssssssssssssssssssssssssssasssssssssssssssssssssssssssasssssssssssssssssssssssssssasssssssssssssssssssssssssssassssssssssssssssssssssssssasssssssssssssssssssssssss"  ;

    ContactFormValidationTests(){
        hp = new HomePage();
        cfp = new ContactFormPage();
    }

    @Test(priority = 1)
    public void goToContactFormPageTest(){
        goTo(URL);

        hp.clickContacUsButton();

        ContactFormPage cfp = new ContactFormPage();

        Assert.assertTrue(cfp.emailInputIsDisplayed());
        Assert.assertTrue(cfp.orderReferenceInputIsDisplayed());
        Assert.assertTrue(cfp.messageInputIsDisplayed());
        Assert.assertTrue(cfp.sendBtnIsDisplayed());
        Assert.assertTrue(cfp.subjectHeadingSelectIsDisplayed());

    }

    @Test(priority = 2)
    public void emailInputValidationTest(){

        cfp.clickSendBtn();

        Assert.assertTrue(cfp.isErrorBannerDisplayed());

        cfp.setTextOnEmailInput("#iw93i9jdjnf");

        cfp.clickSendBtn();

        Assert.assertTrue(cfp.isErrorBannerDisplayed());

        cfp.setTextOnEmailInput("andrea@andrea.andrea");

        cfp.clickSendBtn();

        Assert.assertTrue(cfp.isErrorBannerDisplayed());

    }

    @Test(priority = 3)
    public void subjectValidationTest(){

        cfp.setSubjectInput();

        Assert.assertTrue(cfp.isErrorBannerDisplayed());
    }





    @Test(priority = 4)
    public void messageInputValidationTest(){
        cfp.clickSendBtn();

        Assert.assertTrue(cfp.isErrorBannerDisplayed());

        //Validates limit
        cfp.setTextOnMessageInput(data);

        cfp.clickSendBtn();

        Assert.assertTrue(cfp.isErrorBannerDisplayed());

        cfp.setTextOnEmailInput("andrea@andrea.andrea");

        cfp.clickSendBtn();

        Assert.assertTrue(cfp.isErrorBannerDisplayed());

    }



}
