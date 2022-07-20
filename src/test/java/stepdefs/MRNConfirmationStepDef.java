package stepdefs;

import com.nhl.pages.accountcreation.mrn.MRNPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MRNConfirmationStepDef {

    @When("the user lands on MRN page {string}")
    public void theUserLandsOnMrnPage(String title) {
        MRNPage mrn = new MRNPage();
        Assert.assertTrue(title.equalsIgnoreCase(mrn.getScreenTitle()));
    }

    @When("the continue button on MRN should be disabled")
    public void theContinueButtonOnMRNShouldBeDisabled() {
        Assert.assertFalse(new MRNPage().isContinueButtonClickable());
    }

    @When("the user enters MRN {string}")
    public void theUserEntersMrn(String mortgageNumber) {
        MRNPage mrn = new MRNPage();
        mrn.step_enterRegistrationNumber(mortgageNumber);
    }

    @When("the user re enters MRN {string}")
    public void theUserReEntersMrn(String reEnterMRN) {
        new MRNPage().step_enterConfirmRegistrationNumber(reEnterMRN);
    }

    @When("the continue button for MRN should be enabled")
    public void theContinueButtonForMrnShouldBeEnabled() {
        Assert.assertTrue(new MRNPage().isContinueButtonClickable());
    }

    @When("the user clicks on continue on MRN")
    public void theUserClicksOnContinueOnMrn() {
        new MRNPage().step_clickContinue();
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
        MRNPage mrn = new MRNPage();
        mrn.clickMRNHelpLink();
        String text = mrn.getMRNHelpText();
        //mrn.theUserClicksOnDone();
        Assert.assertEquals(mrn.getMRNHelpText(),linkText,"The MRN help text doesn't match");
    }
}
