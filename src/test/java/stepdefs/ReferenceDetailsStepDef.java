package stepdefs;

import com.google.common.util.concurrent.Uninterruptibles;
import com.nhl.pages.*;
import com.nhl.pages.referencedetails.ReferenceDetailsPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ReferenceDetailsStepDef {

    @Given("the user confirms Source of income")
    public void the_user_confirms_source_of_income() {
        System.out.println("The source of income screen is displayed");
    }

    @When("the user enters the details of first reference")
    public void the_user_enters_the_details_of_first_reference(DataTable dt) {
        ReferenceDetailsPage rdp = new ReferenceDetailsPage();
        List<String> rdl = dt.asList();
        rdp.enterFirstReferenceFullName(rdl.get(0));
        rdp.enterFirstReferenceRelationship(rdl.get(1));
        rdp.enterFirstReferenceMobileNumber(rdl.get(2));
        rdp.enterFirstReferenceAltContactNumber(rdl.get(3));
        rdp.enterFirstReferenceOfficeNumber(rdl.get(4));
    }

    @When("the user enters the details of second reference")
    public void the_user_enters_the_details_of_second_reference(DataTable dt) {
        ReferenceDetailsPage rdp = new ReferenceDetailsPage();
        List<String> rdl = dt.asList();
        rdp.enterSecondReferenceFullName(rdl.get(0));
        rdp.enterSecondReferenceRelationship(rdl.get(1));
        rdp.enterSecondReferenceMobileNumber(rdl.get(2));
        rdp.enterSecondReferenceAltContactNumber(rdl.get(3));
        rdp.enterSecondReferenceOfficeNumber(rdl.get(4));
    }

    @When("the user press on continue on reference details screen")
    public void the_user_press_on_continue_on_reference_details_screen() {
        new ReferenceDetailsPage().clickContinue();
    }

    @Then("the consent screen is displayed")
    public void the_consent_screen_is_displayed() {
        System.out.println("Consent screen is displayed");
    }

}
