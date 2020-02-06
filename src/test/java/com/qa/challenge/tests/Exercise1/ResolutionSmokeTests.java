package com.qa.challenge.tests.Exercise1;

import com.qa.challenge.Pages.FeedbackPage;
import com.qa.challenge.Pages.HomePage;
import com.qa.challenge.Pages.OnlineBankingPage;
import com.qa.challenge.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.*;

public class ResolutionSmokeTests extends BaseTest {
    public static String URL = "http://zero.webappsecurity.com/index.html";

    @Test(dataProvider="ResolutionProvider")//Testing Resolution for Iphone 5/6/7/plus || Samsung Galaxy S5 and Ipad pro
    public void WebPageDeviceResolutionTest(String width, String height){
        changeResolution(width, height);

       goTo(URL);

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

    @DataProvider(name="ResolutionProvider")
    public Object[][] getDataFromDataprovider(){
        return new Object[][]
                {       //Width || Height
                        { "1024", "1366" }, //IPad Resolution
                        { "414", "736" },// IPhone 5/6/7/plus resolution
                        { "360", "640" } // Samsung galaxy s5 resolution
                };
    }

}
