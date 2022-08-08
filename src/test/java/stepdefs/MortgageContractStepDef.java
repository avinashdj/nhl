package stepdefs;

import com.nhl.pages.acccountactivation.YourBankAccountPage;
import com.nhl.pages.additionaldetails.MCPage1;
import com.nhl.pages.additionaldetails.MCPage2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MortgageContractStepDef {

    @When("the user lands on first MC page")
    public void theUserLandsOnFirstMCPage() {
        Assert.assertEquals(new MCPage1().getScreenTitle(),"Mortgage Contract","Title doesn't match");
    }

    @And("the continue button for first MC should be disabled")
    public void theContinueButtonForFirstMCShouldBeDisabled() {
        Assert.assertFalse(new MCPage1().isContinueButtonEnabled(),"Continue button is enabled");
    }

    @And("the consent for first MC should be empty")
    public void theConsentForFirstMCShouldBeEmpty() {
        Assert.assertFalse(new MCPage1().isConsentPrivoded(),"Consent button is not empty");
    }

    @And("the continue button for first MC should be enabled")
    public void theContinueButtonForFirstMCShouldBeEnabled() {
        Assert.assertTrue(new MCPage1().isContinueButtonEnabled());
    }

    @And("the user clicks on continue on first MC page")
    public void theUserClicksOnContinueOnFirstMCPage() {
        new MCPage1().clickContinueButton();
    }

    @And("the user lands on second MC page")
    public void theUserLandsOnSecondMCPage() {
        Assert.assertEquals(new MCPage2().getScreenTitle(),new MCPage1().getScreenTitle(),"The screen title doesn't match");
    }

    @And("the continue button for second MC should be disabled")
    public void theContinueButtonForSecondMCShouldBeDisabled() {
        Assert.assertFalse(new MCPage2().isContinueButtonEnabled(),"Continue button is enabled");
    }

    @And("the consent for second MC should be empty")
    public void theConsentForSecondMCShouldBeEmpty() {
        Assert.assertFalse(new MCPage2().isConsentPrivoded(),"Consent button is not empty");
    }

    @And("the user provides consent on second MC page")
    public void theUserProvidesConsentOnSecondMCPage() {
        new MCPage2().agreeTandC();
    }

    @And("the continue button for second MC should be enabled")
    public void theContinueButtonForSecondMCShouldBeEnabled() {
        Assert.assertTrue(new MCPage2().isContinueButtonEnabled());
    }

    @And("the user clicks on continue on second MC page")
    public void theUserClicksOnContinueOnSecondMCPage() {
        new MCPage2().clickContinueButton();
    }

    @And("the user provides consent on first MC page")
    public void theUserProvidesConsentOnFirstMCPage() {
        new MCPage1().agreeTandC();
    }


    @And("the user clicks on read our MC terms and conditions")
    public void theUserClicksOnReadOurMCTermsAndConditions() {
        new MCPage2().clickReadOurTandC();
    }

    @And("the user consent check box should be disabled for first MC screen")
    public void theUserConsentCheckBoxShouldBeDisabledForFirstMCScreen() {
        Assert.assertFalse(new MCPage1().isAgreeTAndCEnabled(),"Consent button is enabled");
    }
}
