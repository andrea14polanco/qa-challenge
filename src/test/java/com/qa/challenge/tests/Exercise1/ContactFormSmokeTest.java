package com.qa.challenge.tests.Exercise1;

import com.qa.challenge.Pages.FeedbackPage;
import com.qa.challenge.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ContactFormSmokeTest extends BaseTest {
    public static String URL = "http://zero.webappsecurity.com/index.html";

    @Test(dataProvider = "DataProvider")
    public void fillContactFormTest(String name,String email, String subject, String comments, boolean isInputIncorrect){
        goTo(URL);

        FeedbackPage fp = new FeedbackPage();

        fp.clickFeedNavBarBtn();

        Assert.assertTrue(fp.isAtFeedbackPage());

        fp.fillContactFormInptName(name);
        fp.fillContactFormInptEmail(email);
        fp.fillContactFormInptSubject(subject);
        fp.fillContactFormInptComments(comments);

        fp.clickSendBtn();

        Assert.assertEquals(isInputIncorrect, fp.isSendMessageBtnPresent());
    }

    @DataProvider(name="DataProvider")
    public Object[][] getDataFromDataprovider(){
        return new Object[][]
                {
                        { "a", "a", "a", "a", true },
                        { "12131", "454", "455", "44", true},
                        { "@@#$", "##@#@", "#@#@", "#@##", true },
                        { "Andrea", "a15@gmail.com", "Test", "Comments", false }
                };
    }

    @Test
    public void clickBtnSendWithAllFieldsEmptyTest() throws InterruptedException {
        goTo(URL);

        FeedbackPage fp = new FeedbackPage();

        fp.clickFeedNavBarBtn();

        Assert.assertTrue(fp.isAtFeedbackPage());

        fp.clickSendBtn();

        Assert.assertTrue(fp.isSendMessageBtnPresent());
    }

    @Test
    public void clickBtnSendWithNameInptFilledTest() throws InterruptedException {
        goTo(URL);

        FeedbackPage fp = new FeedbackPage();

        fp.clickFeedNavBarBtn();

        Assert.assertTrue(fp.isAtFeedbackPage());

        fp.fillContactFormInptName("a");

        fp.clickSendBtn();

        Assert.assertTrue(fp.isSendMessageBtnPresent());
    }

}
