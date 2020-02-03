package com.qa.challenge.Pages;

import com.qa.challenge.BasePage;

public class HomePage extends BasePage {
    private static String URL = "http://zero.webappsecurity.com/index.html";


    public HomePage() {
        goTo(URL);
    }

}
