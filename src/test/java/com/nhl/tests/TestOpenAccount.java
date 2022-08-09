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
public class TestOpenAccount extends BaseTest {

    @FrameworkAnnotation
    @Test(description = "User able to follow and complete welcome dashboard guid steps under open NHL account creation")
    public void user_able_to_see_welcome_dashboard_steps_navigation_and_its_behaviour_under_open_nhl_account_flow() {
        // 1 Out of 3 Phase - Workflow Started
        new GetStaterPage().step_getStarted().step_registeredMobileNumber("569760182").
                step_registrationSubmit().step_setContinueWithOTP("123456").
                step_SkipWithoutEmail().step_setPin("1234").step_nextToConfirm().step_setConfirmPin("1234").
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().
                check_and_validate_welcomeTitle();

        new DashboardPage().step_StepWidgetContinueForVerifyIdentity();

        // Preconditions : OCR + NFR + Face 3D work-flows should complete via APIs
        // 3 Out of 3 Phase - Verify Your Identity ====================================================================
        new ADHAApplicationPage().check_and_validate_personalInfoTitle().check_and_validate_applicationNo("SL823022").
                check_and_validate_applicationType("appType").
                check_and_validate_grantedAmount("AED 800,000.00").
                check_and_validate_serviceType("250000").
                check_and_validate_mobileNumber("+971 56 976 0182").
                check_and_validate_addressInfo("1427, Al Oud", "Abu Dhabi", "Abu Dhabi", "1427, Al Oud").
                check_and_validate_signaturePics().step_confirmedADHAApplication().step_confirmedKeyStatement().step_clickDone();

        new DashboardPage().step_StepWidgetContinueForOpenNHLAccount1Out5();

        // 1 Out of 5 Phase - Open NHL Account Widget =================================================================
        new YourHomeAddressPage().step_confirmAddress();

        //new DashboardPage().step_StepWidgetContinueForOpenNHLAccount2Out5();

        // 2 Out of 5 Phase - Open NHL Account Widget =================================================================
        new IncomeDetailsPage().check_and_validate_incomeSourceTitle().step_navigateToMonthlySalaryIncome().
                step_enterTotalMonthlySalary("1500000").
                step_uploadSalaryCertificate().step_uploadBankStatement().
                step_clickAdd().step_clickContinue();

        //new DashboardPage().step_StepWidgetContinueForOpenNHLAccount3Out5();

        // 3 Out of 5 Phase - Open NHL Account Widget =================================================================
        // Preconditions : OCR + NFR + Face 3D work-flows should complete via APIs + Income Source completion required
        new ReferenceDetailsPage().step_enterFirstReferenceFullName("Jonny Rome").
                step_enterFirstReferenceRelationship("Wife").
                step_enterFirstReferenceMobileNumber("569760183").
                step_enterFirstReferenceAltContactNumber("569760184").
                step_enterSecondReferenceFullName("Joson Jo").
                step_enterSecondReferenceRelationship("Brother").
                step_enterSecondReferenceMobileNumber("569760185").
                step_enterSecondReferenceAltContactNumber("569760186").step_clickContinue();

        //new DashboardPage().step_StepWidgetContinueForOpenNHLAccount4Out5();

        // 4 Out of 5 Phase - Open NHL Account Widget =================================================================
        // Preconditions : OCR + NFR + Face 3D work-flows should complete via APIs + Income Source + Reference Details completion required
        new PEPPage().setPoliticallyExposed(false).step_clickContinue().
                check_and_validate_CPRTermsTitle().
                step_selectAllMandatoryTerms().step_clickContinue().
                step_acceptDeclarationCondition().step_clickContinue().
                step_acceptOffPeriodCondition().step_clickContinue();

        //new DashboardPage().step_StepWidgetContinueForOpenNHLAccount5Out5();

        // 5 Out of 5 Phase - Open NHL Account Widget =================================================================
        // Preconditions : OCR + NFR + Face 3D work-flows should complete via APIs + Income Source + Reference + CPR Terms Details completion required
        new MRNPage().step_enterRegistrationNumber("1111111111111").
                step_enterConfirmRegistrationNumber("1111111111111").
                step_clickDone().step_clickDone();
    }
}
