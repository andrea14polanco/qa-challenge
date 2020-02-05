package com.qa.challenge.tests;

import com.qa.challenge.BasePage;
import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest extends BasePage {

    private static String URL = "http://zero.webappsecurity.com/index.html";

    @BeforeClass
    public void setUp() {
        //Start Chrome driver
        startDrivers();

        //Navigate to zero.webappsecurity
        getWebDriver().get(URL);

    }

    public void changeResolution(String width, String height){
        Dimension dimension = new Dimension(Integer.parseInt(width), Integer.parseInt(height));
        getWebDriver().manage().window().setSize(dimension);
    }

    @AfterClass
    public void tearDown() {

    }
}
