package com.nhl.tests;

import com.nhl.annotations.FrameworkAnnotation;
import com.nhl.listeners.TestListener;
import com.nhl.pages.GetStaterPage;
import com.nhl.pages.SetPinPage;
import com.nhl.pages.WelcomePage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class WelcomePageTest extends BaseTest {



    @FrameworkAnnotation
    @Test(description = "To check whether the Lets get started button is clicked")
    public void letsGetStartedTest() {
        //new GetStaterPage().step_getStarted().step_registeredMobileNumber("569760182").step_registrationSubmit().step_setContinueWithOTP("").step_SkipWithoutEmail();

        new SetPinPage().step_setPin("1234").step_SignIn().switchTOMenu();

    }
}
