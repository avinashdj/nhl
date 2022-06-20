package com.nhl.tests;

import com.nhl.annotations.FrameworkAnnotation;
import com.nhl.listeners.TestListener;
import com.nhl.pages.WelcomePage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class WelcomePageTest extends BaseTest {



    @FrameworkAnnotation
    @Test(description = "To check whether the Lets get started button is clicked")
    public void letsGetStartedTest() {
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.clickLetsGetStartedButton();
//        LoginPage loginPage = new LoginPage();
//        String actualTitle = loginPage
//                .loginToApplication(testdata.username, testdata.password)
//                .getHomePageTitle();
//
//        Assert.assertEquals(actualTitle, testdata.expectedTitle);


        //to keep all your locators and methods in one class
    }
}
