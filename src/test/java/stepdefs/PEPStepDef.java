package stepdefs;

import com.nhl.pages.accountcreation.additionaldetails.PEPPage;
import com.nhl.pages.accountcreation.additionaldetails.TandCPEPPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class PEPStepDef {

    @When("the user lands on PEP page {string}")
    public void theUserLandsOnPEPPage(final String title) {
        PEPPage pep = new PEPPage();
        //if(title.equalsIgnoreCase(pep.getScreenTitle()) && title.equalsIgnoreCase(pep.getConsentContentHeading()));
        Assert.assertTrue(title.equalsIgnoreCase(pep.getScreenTitle()) && title.equalsIgnoreCase(pep.getConsentContentHeading()));
    }

    @When("the user clicks on yes on PEP page")
    public void theUserClicksOnYesOnPEPPage() {
        new PEPPage().setPoliticallyExposed(true);
    }

    @When("the continue button on PEP should be disabled")
    public void theContinueButtonOnPEPShouldBeDisabled() {
        Assert.assertFalse(new PEPPage().isContinueButtonEnabled());
    }

    @When("the user clicks on Inside UAE")
    public void theUserClicksOnInsideUAE() {
        new PEPPage().setPositionHeld(true);
    }

    @When("the user clicks on continue on PEP")
    public void theUserClicksOnContinueOnPEP() {
        new PEPPage().clickContinue();

    }



    @And("the user clicks on no on PEP page")
    public void theUserClicksOnNoOnPEPPage() {
        new PEPPage().setPoliticallyExposed(false);
    }

    @And("check if the PEP options are displayed")
    public void checkIfThePEPOptionsAreDisplayed() {
        Assert.assertFalse(new PEPPage().isPEPOptionDisplayed());
    }

    @And("the user clicks on Outside UAE")
    public void theUserClicksOnOutsideUAE() {
        new PEPPage().setPositionHeld(false);
    }

    @Then("the user lands on TnC page {string}")
    public void theUserLandsOnTnCPage(final String title) {
        Assert.assertEquals(new TandCPEPPage().getScreenTitle(),title,"Title page doesn't match");
    }
}
