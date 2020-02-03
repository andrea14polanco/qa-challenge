package com.qa.challenge.tests;

import com.qa.challenge.BasePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest extends BasePage {

    @BeforeClass
    public void setUp() {
        startDrivers();
        //  LoginPage loginPage = new LoginPage();
        //loginPage.login();
    }
    @AfterClass
    public void tearDown() {

    }
}
