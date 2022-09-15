package stepdefs;

import com.nhl.pages.acccountactivation.DDAAuthorizationPage;
import com.nhl.pages.acccountactivation.SIOAuthorizationPage;
import com.nhl.pages.acccountactivation.YourBankAccountPage;
import com.nhl.pages.accountactivation.CongratsPageMortgageContract;
import com.nhl.pages.accountactivation.HomeDocumentsPage;
import com.nhl.pages.accountactivation.LoanAgreementPage;
import com.nhl.pages.accountactivation.MortgageContractPage;
import com.nhl.pages.idandv.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AccountActivationStepDef {

    @Then("continue button should be disabled")
    public void continueButtonShouldBeDisabled() {
        Assert.assertFalse(new YourBankAccountPage().isContinueButtonEnabled());
    }

    @When("the user enters the IBAN as {string}")
    public void theUserEntersTheIBANAs(final String iban) {
        new YourBankAccountPage().enterIBAN(iban);
    }

    @When("the user enters the Account number as {string}")
    public void theUserEntersTheAccountNumberAs(final String accountNumber) {
        new YourBankAccountPage().enterAccountNumber(accountNumber);
    }

    @When("the user enters the Branch name as {string}")
    public void theUserEntersTheBranchNameAs(final String branchName) {
        new YourBankAccountPage().enterBranchName(branchName);
    }

    @When("the continue button is enabled")
    public void theContinueButtonIsEnabled() {
        Assert.assertTrue(new YourBankAccountPage().isContinueButtonEnabled());
    }

    @Then("the Bank Name should not be shown")
    public void theBankNameShouldNotBeShown() {
        Assert.assertFalse(new YourBankAccountPage().isBankNameFieldPresent());
    }

    @When("the user select Other Bank option")
    public void theUserSelectOtherBankOption() {
        new YourBankAccountPage().selectOtherUAEBankOption();
    }

    @Then("the Bank Name should be shown")
    public void theBankNameShouldBeShown() {
        Assert.assertTrue(new YourBankAccountPage().isBankNameFieldPresent());
    }

    @And("the user enter the Bank name as {string}")
    public void theUserEnterTheBankNameAs(final String bankName) {
        new YourBankAccountPage().enterBankName(bankName);
    }

    @And("the FAB Bank is selected by default")
    public void theFABBankIsSelectedByDefault() {
        Assert.assertTrue(new YourBankAccountPage().isFABChecked());
    }

    @And("the user clicks on Continue button for Account creation")
    public void theUserClicksOnContinueButtonForAccountCreation() {
        new YourBankAccountPage().clickContinue();
    }

    @Then("the DDA authorization page is shown")
    public void theDDAAuthorizationPageIsShown() {
        Assert.assertTrue(new DDAAuthorizationPage().getScreenTitle().equalsIgnoreCase("DDA authorisation"));
    }

    @Then("the Continue button in the DDA is disabled")
    public void theContinueButtonInTheDDAIsDisabled() {
        Assert.assertFalse(new DDAAuthorizationPage().isContinueButtonEnabled());
    }

    @When("the user clicks on I Authorise in DDA page")
    public void theUserClicksOnIAuthoriseInDDAPage() {
        new DDAAuthorizationPage().selectConsent();
    }

    @Then("the Continue button in the DDA is enabled")
    public void theContinueButtonInTheDDAIsEnabled() {
        Assert.assertTrue(new DDAAuthorizationPage().isContinueButtonEnabled());
    }

    @When("the user clicks on Continue button in the DDA page")
    public void theUserClicksOnContinueButtonInTheDDAPage() {
        new DDAAuthorizationPage().clickContinue();
    }

    @Then("the {string} authorisation page is shown")
    public void theAuthorisationPageIsShown(String authorisation) {
        if(authorisation.equalsIgnoreCase("DDA")) {
            Assert.assertTrue(new DDAAuthorizationPage().getScreenTitle().equalsIgnoreCase("DDA authorisation"));
        } else {
            Assert.assertTrue(new SIOAuthorizationPage().getScreenTitle().equalsIgnoreCase("SIO authorisation"));
        }
    }

    @Then("the Continue button in the {string} authorisation page is disabled")
    public void theContinueButtonInTheAuthorisationPageIsDisabled(String authorisation) {
        if(authorisation.equalsIgnoreCase("DDA")) {
            Assert.assertFalse(new DDAAuthorizationPage().isContinueButtonEnabled());
        } else {
            Assert.assertFalse(new SIOAuthorizationPage().isContinueButtonEnabled());
        }
    }

    @When("the user clicks on I Authorise in {string} authorisation page")
    public void theUserClicksOnIAuthoriseInAuthorisationPage(String authorisation) {
        if(authorisation.equalsIgnoreCase("DDA")) {
            new DDAAuthorizationPage().selectConsent();
        } else {
            new SIOAuthorizationPage().selectConsent();
        }
    }

    @Then("the Continue button in the {string} authorisation page is enabled")
    public void theContinueButtonInTheAuthorisationPageIsEnabled(String authorisation) {
        if(authorisation.equalsIgnoreCase("DDA")) {
            Assert.assertTrue(new DDAAuthorizationPage().isContinueButtonEnabled());
        } else {
            Assert.assertTrue(new SIOAuthorizationPage().isContinueButtonEnabled());
        }
    }

    @When("the user clicks on Continue button in the {string} authorisation page")
    public void theUserClicksOnContinueButtonInTheAuthorisationPage(String authorisation) {
        if(authorisation.equalsIgnoreCase("DDA")) {
            new DDAAuthorizationPage().clickContinue();
        } else {
            new SIOAuthorizationPage().clickContinue();
        }
    }

    @When("user start account activation process using welcome screen")
    public void userStartAccountActivationProcessUsingWelcomeScreen() {
        new DashboardPage().step_StepWidgetAccountActivation();
    }

    @Then("user provide fab bank details for SIO approvals with {string} {string} {string}")
    public void userProvideFabBankDetailsForSIOApprovalsWith(String account, String iban, String branch) {
        // Include Your Bank Details + SIO Approved +
        new com.nhl.pages.accountactivation.YourBankAccountPage().step_clickChooseFabBank().
                step_enterFabAccountDetails(account,iban,branch).
                step_clickContinue().step_acceptInstructionOrderCondition().step_clickContinue();
    }

    @Then("user accept mortgage contract and Instruction-order and terms conditions")
    public void userAcceptMortgageContractAndInstructionOrderAndTermsConditions() {
        new MortgageContractPage().step_acceptInstructionOrderCondition().step_clickContinue().
                check_and_validate_termsConditionsTitle().step_clickContinue();
    }

    @Then("user upload requested home site plan and certificate documents")
    public void userUploadRequestedHomeSitePlanAndCertificateDocuments() {
        new HomeDocumentsPage().step_sitePlanUpload().step_certificateUpload().step_clickContinue();
    }

    @Then("user sign the loan agreement and mortgage agreement")
    public void userSignTheLoanAgreementAndMortgageAgreement() {
        // Loan Agreement & Mortgage Contract Flow Colplete
        new LoanAgreementPage().step_acceptLoanAgreement().step_clickContinue();
        }

    @Then("user verify congratulations page for account activation and landing to welcome screen")
    public void userVerifyCongratulationsPageForAccountActivationAndLandingToWelcomeScreen() {
        new CongratsPageMortgageContract().check_and_validate_mortgageContractSuccessMsg().step_clickDone().check_and_validate_welcomeTitle();
    }
}
