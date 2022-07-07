package stepdefs;

import com.nhl.pages.registeredmortgage.RegisteredMortgagePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MRNConfirmationStepDef {

    @When("the user lands on MRN page {string}")
    public void theUserLandsOnMrnPage(String title) {
        RegisteredMortgagePage mrn = new RegisteredMortgagePage();
        Assert.assertTrue(title.equalsIgnoreCase(mrn.getScreenTitle()));
    }

    @When("the continue button on MRN should be disabled")
    public void theContinueButtonOnMRNShouldBeDisabled() {
        Assert.assertFalse(new RegisteredMortgagePage().isContinueButtonClickable());
    }

    @When("the user enters MRN {string}")
    public void theUserEntersMrn(String mortgageNumber) {
        RegisteredMortgagePage mrn = new RegisteredMortgagePage();
        mrn.enterMRN(mortgageNumber);
    }

    @When("the user re enters MRN {string}")
    public void theUserReEntersMrn(String reEnterMRN) {
        new RegisteredMortgagePage().enterConfirmMRN(reEnterMRN);
    }

    @When("the continue button for MRN should be enabled")
    public void theContinueButtonForMrnShouldBeEnabled() {
        Assert.assertTrue(new RegisteredMortgagePage().isContinueButtonClickable());
    }

    @When("the user clicks on continue on MRN")
    public void theUserClicksOnContinueOnMrn() {
        new RegisteredMortgagePage().clickContinue();
    }

    @When("the user lands on the congratulations page")
    public void theUserLandsOnTheCongratulationsPage() {
        System.out.println("Landed on congrats page");
    }

    @When("the user clicks on continue on congratulations page")
    public void theUserClicksOnContinueOnCongratulationsPage() {
        System.out.println("Continue clicked");
    }

    @Then("the user lands on Account activation dashboard")
    public void theUserLandsOnAccountActivationDashboard() {
        System.out.println("On account activation dashboard");
    }


    @And("the hypertext what is MRN should be enabled {string}")
    public void theHypertextWhatIsMRNShouldBeEnabled(String linkText) {
        RegisteredMortgagePage mrn = new RegisteredMortgagePage();
        mrn.clickMRNHelpLink();
        String text = mrn.getMRNHelpText();
        //mrn.theUserClicksOnDone();
        Assert.assertEquals(mrn.getMRNHelpText(),linkText,"The MRN help text doesn't match");
    }
}
