package com.nhl.tests;

import com.nhl.annotations.FrameworkAnnotation;
import com.nhl.listeners.TestListener;
import com.nhl.pages.accountactivation.HomeDocumentsPage;
import com.nhl.pages.accountactivation.LoanAgreementPage;
import com.nhl.pages.accountactivation.MortgageContractPage;
import com.nhl.pages.accountactivation.YourBankAccountPage;
import com.nhl.pages.accountcreation.YourHomeAddressPage;
import com.nhl.pages.accountcreation.additionaldetails.PEPPage;
import com.nhl.pages.accountcreation.mrn.MRNPage;
import com.nhl.pages.accountcreation.referencedetails.ReferenceDetailsPage;
import com.nhl.pages.accountcreation.sourceofincome.IncomeDetailsPage;
import com.nhl.pages.idandv.DashboardPage;
import com.nhl.pages.idandv.GetStaterPage;
import com.nhl.pages.idandv.LoginPage;
import com.nhl.utils.SeleniumUtils;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class WholeE2ETest extends BaseTest {

    @FrameworkAnnotation
    @Test(description = "User able to follow and complete welcome dashboard guid steps under open NHL account creation")
    public void user_able_to_see_welcome_dashboard_steps_navigation_and_its_behaviour_under_open_nhl_account_flow() {
        // 1 Out of 3 Phase - Account Activation Flow Started
        new GetStaterPage().step_getStarted().step_registeredMobileNumber("567069024").
                step_registrationSubmit().step_setContinueWithOTP("123456").
                step_SkipWithoutEmail().step_setPin("1234").step_nextToConfirm().step_setConfirmPin("1234").
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().
                check_and_validate_welcomeTitle();


//        -------Main Menu, Profile and Logout--------

        // Preconditions : User Authentication Should Fulfill
        // Mein Menu Behaviours =======================================================================================
        new DashboardPage().switchTOMenu().

                // FAQ's Section Validation
                        step_faqsClickAndNavigate().check_and_validate_faqsNHLTitle().
                check_and_validate_faqQuestionsBody().step_goBack().

                // About FAB NHL Section Validation
                        step_aboutClickAndNavigate().check_and_validate_aboutNHLTitle().
                check_and_validate_aboutNHLBody().step_goBack().

                // Personalize  Details Section Validation
                        step_identityVerifyClickAndNavigate().check_and_validate_personalInfoTitle().
                check_and_validate_customerName("Yashraj Sahu").check_and_validate_customerEmail("yashraj.sahu@bankfab.com").
                check_and_validate_customerMobile("+971 56 706 9024").step_goBack().

                // Islamic Product Section Validation and Logout
                        step_islamicProductClickAndNavigate().check_and_validate_islamicProductsTitle().step_goBack().step_logoutNHL();


        // Login Page
        new LoginPage().login("1234");



//        --------Account Opening--------
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
                step_clickDone().step_clickDone().

                // ===========================================================================================================
                // =============================== OPEN ACCOUNT FLOW COMPLETED - SUCCESSFULLY ================================
                        check_and_validate_welcomeTitle();

        //       -------Document Verification-------

        System.out.println("Please wait while document is being verified");
//        SeleniumUtils.waitFor(30000);






        //        ------Account Activation-------

        new DashboardPage().step_StepWidgetAccountActivation();

        // Include Your Bank Details + SIO Approved +
        new YourBankAccountPage().step_clickChooseFabBank().
                step_enterFabAccountDetails("1234567890123456","123456789012345672131","Al Barsha").
                step_clickContinue().step_acceptInstructionOrderCondition().step_clickContinue();

        new MortgageContractPage().step_acceptInstructionOrderCondition().step_clickContinue().
               check_and_validate_termsConditionsTitle().step_clickContinue();

        // Upload Home Documentation
        new HomeDocumentsPage().step_sitePlanUpload().step_certificateUpload().step_clickContinue();

        // Loan Agreement & Mortgage Contract Flow Complete
        new LoanAgreementPage().step_acceptLoanAgreement().step_clickContinue().
                check_and_validate_mortgageContractSuccessMsg().step_clickDone().check_and_validate_welcomeTitle();


//        new LoanAgreementPage().step_acceptLoanAgreement().step_clickContinue().step_clickContinue().
//                check_and_validate_mortgageContractSuccessMsg().step_clickDone().check_and_validate_welcomeTitle();





    }
}
