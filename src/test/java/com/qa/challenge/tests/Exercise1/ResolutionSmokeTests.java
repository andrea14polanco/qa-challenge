package com.qa.challenge.tests.Exercise1;

import com.qa.challenge.tests.BaseTest;
import org.openqa.selenium.Dimension;

public class ResolutionSmokeTests extends BaseTest {

    public ResolutionSmokeTests (){
        Dimension dimension = new Dimension(360, 640);
        getWebDriver().manage().window().setSize(dimension);
    }


}
