package stepdefs;

import com.nhl.pages.accountcreation.YourHomeAddressPage;
import com.nhl.pages.accountcreation.additionaldetails.PEPPage;
import com.nhl.pages.accountcreation.mrn.MRNPage;
import com.nhl.pages.accountcreation.referencedetails.ReferenceDetailsPage;
import com.nhl.pages.accountcreation.sourceofincome.IncomeDetailsPage;
import com.nhl.pages.idandv.DashboardPage;
import com.nhl.pages.verifyidentityphase.ADHAApplicationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenAccountStepDef {

    @When("user start identity verification process using welcome screen")
    public void userStartIdentityVerificationProcessUsingWelcomeScreen() {
        new DashboardPage().step_StepWidgetContinueForVerifyIdentity();
    }

    @Then("user validates ADHA application details with {string} {string} {string} {string}")
    public void userValidatesADHAApplicationDetailsWith(String appno, String grantedamount, String servicetype, String cusmobile ) {
        // 3 Out of 3 Phase - Verify Your Identity ====================================================================
        new ADHAApplicationPage().check_and_validate_personalInfoTitle().check_and_validate_applicationNo(appno).
                check_and_validate_applicationType("appType").
                check_and_validate_grantedAmount(grantedamount).
                check_and_validate_serviceType(servicetype).
                check_and_validate_mobileNumber(cusmobile).
                check_and_validate_addressInfo("1427, Al Oud", "Abu Dhabi", "Abu Dhabi", "1427, Al Oud").
                check_and_validate_signaturePics().step_confirmedADHAApplication().step_confirmedKeyStatement().step_clickDone();
    }

    @Then("user start open account process using welcome screen")
    public void userStartOpenAccountProcessUsingWelcomeScreen() {
        new DashboardPage().step_StepWidgetContinueForOpenNHLAccount1Out5();
    }

    @Then("user confirm address details given ADHA application")
    public void userConfirmAddressDetailsGivenADHAApplication() {
        // 1 Out of 5 Phase - Open NHL Account Widget =================================================================
        new YourHomeAddressPage().step_confirmAddress();
    }

    @Then("user provide income source details and upload required documents")
    public void userProvideIncomeSourceDetailsAndUploadRequiredDocuments() {
        // 2 Out of 5 Phase - Open NHL Account Widget =================================================================
        new IncomeDetailsPage().check_and_validate_incomeSourceTitle().step_navigateToMonthlySalaryIncome().
                step_enterTotalMonthlySalary("1500000").
                step_uploadSalaryCertificate().step_uploadBankStatement().
                step_clickAdd().step_clickContinue();
    }

    @Then("user provide non-relations reference contact details")
    public void userProvideNonRelationsReferenceContactDetails() {
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
    }


    @Then("user confirm political expose and relations status as {string}")
    public void userConfirmPoliticalExposeAndRelationsStatusAs(String status) {
        // 4 Out of 5 Phase - Open NHL Account Widget =================================================================
        // Preconditions : OCR + NFR + Face 3D work-flows should complete via APIs + Income Source + Reference Details completion required
        boolean expose = false;
        if(status.equals("YES")){
            expose = true;
        }
        new PEPPage().setPoliticallyExposed(expose).step_clickContinue().
                check_and_validate_CPRTermsTitle().
                step_selectAllMandatoryTerms().step_clickContinue().
                step_acceptDeclarationCondition().step_clickContinue().
                step_acceptOffPeriodCondition().step_clickContinue();
    }

    @Then("user provide and confirm mortgage registration details")
    public void userProvideAndConfirmMortgageRegistrationDetails() {
        // 5 Out of 5 Phase - Open NHL Account Widget =================================================================
        // Preconditions : OCR + NFR + Face 3D work-flows should complete via APIs + Income Source + Reference + CPR Terms Details completion required
        new MRNPage().step_enterRegistrationNumber("1111111111111").
                step_enterConfirmRegistrationNumber("1111111111111").
                step_clickDone().step_clickDone();
    }

    @Then("user verify congratulations page for open nhl bank account creation and landing to welcome screen")
    public void userVerifyCongratulationsPageForOpenNhlBankAccountCreationAndLandingToWelcomeScreen() {
        // =============================== OPEN ACCOUNT FLOW COMPLETED - SUCCESSFULLY ================================
        new DashboardPage().check_and_validate_welcomeTitle();
    }
}
