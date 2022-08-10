package com.nhl.tests;

import com.nhl.annotations.FrameworkAnnotation;
import com.nhl.listeners.TestListener;
import com.nhl.pages.accountcreation.YourHomeAddressPage;
import com.nhl.pages.accountcreation.additionaldetails.PEPPage;
import com.nhl.pages.accountcreation.mrn.MRNPage;
import com.nhl.pages.accountcreation.referencedetails.ReferenceDetailsPage;
import com.nhl.pages.accountcreation.sourceofincome.IncomeDetailsPage;
import com.nhl.pages.idandv.DashboardPage;
import com.nhl.pages.idandv.GetStaterPage;
import com.nhl.pages.verifyidentityphase.ADHAApplicationPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class ActivationAccountE2ETest extends BaseTest {

    @FrameworkAnnotation
    @Test(description = "User able to follow and complete welcome dashboard guid steps under open NHL account creation")
    public void user_able_to_see_welcome_dashboard_steps_navigation_and_its_behaviour_under_open_nhl_account_flow() {
        // 1 Out of 3 Phase - Account Activation Flow Started
        new GetStaterPage().step_getStarted().step_registeredMobileNumber("569760182").
                step_registrationSubmit().step_setContinueWithOTP("123456").
                step_SkipWithoutEmail().step_setPin("1234").step_nextToConfirm().step_setConfirmPin("1234").
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().
                check_and_validate_welcomeTitle();

        new DashboardPage().step_StepWidgetContinueForVerifyIdentity();

    }
}
