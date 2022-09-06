package com.nhl.tests;

import com.nhl.annotations.FrameworkAnnotation;
import com.nhl.listeners.TestListener;
import com.nhl.pages.accountactivation.HomeDocumentsPage;
import com.nhl.pages.accountactivation.LoanAgreementPage;
import com.nhl.pages.accountactivation.MortgageContractPage;
import com.nhl.pages.accountactivation.YourBankAccountPage;
import com.nhl.pages.idandv.DashboardPage;
import com.nhl.pages.idandv.GetStaterPage;
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

        new DashboardPage().step_StepWidgetAccountActivation();

        // Include Your Bank Details + SIO Approved +
        new YourBankAccountPage().step_clickChooseFabBank().
                step_enterFabAccountDetails("1234567890123456","12345678901234567","Al Barsha").
                step_clickContinue().step_acceptInstructionOrderCondition().step_clickContinue();

        new MortgageContractPage().step_acceptInstructionOrderCondition().step_clickContinue().
               check_and_validate_termsConditionsTitle().step_clickContinue();

        // Upload Home Documentation
        new HomeDocumentsPage().step_sitePlanUpload().step_certificateUpload().step_clickContinue();

        // Loan Agreement & Mortgage Contract Flow Colplete
        new LoanAgreementPage().step_acceptLoanAgreement().step_clickContinue().step_clickContinue().
                check_and_validate_mortgageContractSuccessMsg().step_clickDone().check_and_validate_welcomeTitle();

    }
}
