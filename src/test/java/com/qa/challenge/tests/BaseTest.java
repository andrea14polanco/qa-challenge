package com.qa.challenge.tests;

import com.qa.challenge.BasePage;
import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest extends BasePage {

    public static String URL = "http://zero.webappsecurity.com/index.html";

    @BeforeTest
    public void setUp() {
        //Start Chrome driver
        startDrivers();

        //Navigate to zero.webappsecurity
        getWebDriver().get(URL);

    }

    @AfterTest
    public void tearDow(){
        //killDriver();
    }


    public void changeResolution(String width, String height){
        Dimension dimension = new Dimension(Integer.parseInt(width), Integer.parseInt(height));
        getWebDriver().manage().window().setSize(dimension);
    }

    @AfterClass
    public void tearDown() {

    }
}
