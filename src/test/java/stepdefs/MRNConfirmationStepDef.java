package stepdefs;


import com.nhl.pages.accountcreation.mrn.MRNPage;

import com.nhl.pages.CongratsPageAccountOpening;
import com.nhl.pages.idandv.WelcomePage;
import com.nhl.pages.WelcomeScreenAccountActivation;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.nhl.utils.SeleniumUtils.hideKeyboard;

public class MRNConfirmationStepDef {

    @When("the user lands on MRN page {string}")
    public void theUserLandsOnMrnPage(final String title) {
        MRNPage mrn = new MRNPage();
        Assert.assertTrue(title.equalsIgnoreCase(mrn.getScreenTitle()));
    }

    @When("the continue button on MRN should be disabled")
    public void theContinueButtonOnMRNShouldBeDisabled() {
        hideKeyboard();
        Assert.assertFalse(new MRNPage().isContinueButtonClickable());
    }

    @When("the user enters MRN {string}")
    public void theUserEntersMrn(String mortgageNumber) {
        MRNPage mrn = new MRNPage();
        mrn.step_enterRegistrationNumber(mortgageNumber);
    }

    @When("the user re enters MRN {string}")
    public void theUserReEntersMrn(String reEnterMRN) {
        new MRNPage().enterConfirmMRN(reEnterMRN);
    }

    @When("the continue button for MRN should be enabled")
    public void theContinueButtonForMrnShouldBeEnabled() {
        hideKeyboard();
        Assert.assertTrue(new MRNPage().isContinueButtonClickable());
    }

    @When("the user clicks on continue on MRN")
    public void theUserClicksOnContinueOnMrn() {
        new MRNPage().step_clickDone();
    }


    @When("the user clicks on continue on congratulations page")
    public void theUserClicksOnContinueOnCongratulationsPage() {
        CongratsPageAccountOpening cong = new CongratsPageAccountOpening();
        cong.clickDone();
        System.out.println("Continue clicked");
    }


    @And("the hypertext what is MRN should be enabled {string}")
    public void theHypertextWhatIsMRNShouldBeEnabled(final String linkText) {
        MRNPage mrn = new MRNPage();
        mrn.clickMRNHelpLink();
        String text = mrn.getMRNHelpText();
        //mrn.theUserClicksOnDone();
        //Assert.assertEquals(mrn.getMRNHelpText(),linkText,"The MRN help text doesn't match");
        mrn.swipeDownToCollapseMRNHelp();
    }

    @When("the user lands on welcome screen and clicks continue")
    public void theUserLandsOnWelcomeScreenAndClicksContinue() {
        new WelcomePage().clickContinue();
    }

    @And("the user lands on the congratulations page {string}")
    public void theUserLandsOnTheCongratulationsPage(final String txt) {
        CongratsPageAccountOpening cong = new CongratsPageAccountOpening();
        Assert.assertEquals(cong.getTitle(),txt,"Title doesn't match");
        Assert.assertEquals(cong.getCongratulationsMessage(),"You've opened your FAB NHL Account!","Congrats message doesn't match");
//        System.out.println("Landed on congrats page");
    }

    @Then("the user lands on Account activation dashboard {string} {string}")
    public void theUserLandsOnAccountActivationDashboard(final String actTxt,final String btnTxt) {
        WelcomeScreenAccountActivation accActivation = new WelcomeScreenAccountActivation();
        Assert.assertEquals(accActivation.getAccActivationtxt(),actTxt,"Text doesn't match");
        Assert.assertEquals(accActivation.getPrepButtontxt(),btnTxt,"Button Text doesn't match");
        System.out.println("On account activation dashboard");
    }

    @And("the user gets MRN error {string}")
    public void theUserGetsMRNError(String err) {
        MRNPage mrn = new MRNPage();
        Assert.assertEquals(mrn.getErrorMessageForMRNConfirmMRNMismatch(),err,"Error message mismatch");
    }
}
