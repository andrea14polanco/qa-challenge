package com.qa.challenge.tests;

import com.qa.challenge.BasePage;
import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest extends BasePage {



    @BeforeTest
    public void setUp() {
        //Start Chrome driver
        startDrivers();

    }

    @AfterTest
    public void tearDow(){
        killDriver();
    }



    public void changeResolution(String width, String height){
        Dimension dimension = new Dimension(Integer.parseInt(width), Integer.parseInt(height));
        getWebDriver().manage().window().setSize(dimension);
    }

    @AfterClass
    public void tearDown() {

    }
}
