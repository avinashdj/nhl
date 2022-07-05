package stepdefs;

import com.nhl.pages.acccountactivation.DDAAuthorizationPage;
import com.nhl.pages.acccountactivation.YourBankAccountPage;
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

    
}
