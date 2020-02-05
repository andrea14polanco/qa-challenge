package com.qa.challenge.tests.Exercise1;

import com.qa.challenge.Pages.FeedbackPage;
import com.qa.challenge.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ContactFormSmokeTest extends BaseTest {

    @Test(dataProvider = "")
    public void fillContactFormTest(String name,String email, String subject, String comments, boolean isCorrect){

    }

    @Test
    public void clickBtnSendWithAllFieldsEmptyTest(){
        FeedbackPage fp = new FeedbackPage();

        fp.clickFeedNavBarBtn();

        Assert.assertTrue(fp.isAtFeedbackPage());

        fp.clickSendBtn();

        Assert.assertFalse(fp.isSubmissionTextPresent());



    }


    @DataProvider(name="ResolutionProvider")
    public Object[][] getDataFromDataprovider(){
        return new Object[][]
                {
                        { "", "", "", "", true },
                        { "", "", "", "", false},
                        { "", "", "", "", false }
                };
    }
}
