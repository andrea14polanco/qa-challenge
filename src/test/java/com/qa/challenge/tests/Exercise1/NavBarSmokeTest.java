package com.qa.challenge.tests.Exercise1;

import com.qa.challenge.Pages.FeedbackPage;
import com.qa.challenge.Pages.HomePage;
import com.qa.challenge.Pages.OnlineBankingPage;
import com.qa.challenge.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavBarSmokeTest extends BaseTest {


    @Test(priority = 1)
    public void NavBarOnHomePageTest(){
        getWebDriver().get(URL);
        HomePage hp = new HomePage();

        hp.clickHomeNavBarBtn();

        Assert.assertTrue(hp.isAtHomePage());

        Assert.assertTrue(hp.isNavBarPresent());

    }

    @Test(priority = 2)
    public void NavBarOnOnlineBankingPageTest(){
        getWebDriver().get(URL);
        OnlineBankingPage obp = new OnlineBankingPage();

        obp.clickOnlineBankNavBarBtn();

        Assert.assertTrue(obp.isAtOnlineBankingPage());

        Assert.assertTrue(obp.isNavBarPresent());

    }

    @Test(priority = 3)
    public void NavBarFeedBackPageTest(){
        getWebDriver().get(URL);
        FeedbackPage fp = new FeedbackPage();

        fp.clickFeedNavBarBtn();

        Assert.assertTrue(fp.isAtFeedbackPage());

        Assert.assertTrue(fp.isNavBarPresent()); //BUG
    }


}
