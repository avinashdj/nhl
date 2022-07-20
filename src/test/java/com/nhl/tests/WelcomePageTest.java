package com.nhl.tests;

import com.nhl.annotations.FrameworkAnnotation;
import com.nhl.listeners.TestListener;
import com.nhl.pages.idandv.GetStaterPage;
import com.nhl.pages.idandv.SetPinPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class WelcomePageTest extends BaseTest {




    @FrameworkAnnotation
    @Test(description = "CPR Testing")
    public void XX() {
        new GetStaterPage().step_getStarted().step_registeredMobileNumber("569760182").
                step_registrationSubmit().step_setContinueWithOTP("").
                step_SkipWithoutEmail().step_setPin("1234").step_nextToConfirm().step_setConfirmPin("1234").
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().
                // 2 Out of 5 Phase - Open NHL Account Widget
                // Preconditions : OCR + NFR + Face 3D work-flows should complete via APIs
                        check_and_validate_welcomeTitle().check_and_validate_Step2OutOf5Widget();

    }
}
