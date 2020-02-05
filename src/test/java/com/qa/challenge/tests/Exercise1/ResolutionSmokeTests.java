package com.qa.challenge.tests.Exercise1;

import com.qa.challenge.Pages.FeedbackPage;
import com.qa.challenge.Pages.HomePage;
import com.qa.challenge.Pages.OnlineBankingPage;
import com.qa.challenge.tests.BaseTest;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ResolutionSmokeTests extends BaseTest {


    @Test
    @Parameters({"width","height"})
    public void WebPageIPadResolutionTest(String width, String height){//IPad pro
        changeResolution(width, height);

        HomePage hp = new HomePage();

        Assert.assertTrue(hp.isAtHomePage());

        Assert.assertTrue(hp.isNavBarPresent());

        OnlineBankingPage obp = new OnlineBankingPage();

        obp.clickOnlineBankNavBarBtn();

        Assert.assertTrue(obp.isAtOnlineBankingPage());

        Assert.assertTrue(obp.isNavBarPresent());

        FeedbackPage fp = new FeedbackPage();

        fp.clickFeedNavBarBtn();

        Assert.assertTrue(fp.isAtFeedbackPage());

    }

    @Test
    @Parameters({"width","height"})
    public void WebPageIPhoneResolutionTest(String width, String height){//IPhone 5/6/7/Plus
        

    }

    @Test
    @Parameters({"width","height"})
    public void WebPageSamSungResolutionTest(String width, String height){//Samsung Galaxy s5


    }


}
