package com.qa.challenge.tests;

import com.qa.challenge.BasePage;
import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest extends BasePage {

    private static String URL = "http://zero.webappsecurity.com/index.html";

    @BeforeClass
    public void setUp() {
        startDrivers();
        //  LoginPage loginPage = new LoginPage();
        //loginPage.login();
        getWebDriver().get(URL);

    }

    public void changeResolution(int width, int height){
        Dimension dimension = new Dimension(width, height);
        getWebDriver().manage().window().setSize(dimension);
    }

    @AfterClass
    public void tearDown() {

    }
}
