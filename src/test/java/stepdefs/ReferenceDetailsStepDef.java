package stepdefs;

import com.nhl.pages.LoginPage;
import com.nhl.pages.referencedetails.ReferenceDetailsPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class ReferenceDetailsStepDef {

    @Given("the user confirms Source of income")
    public void theUserConfirmsSourceOfIncome() {
        System.out.println("The source of income screen is displayed");
    }

    @When("the user enters the details of first reference")
    public void theUserEntersTheDetailsOfFirstReference(DataTable dt) {
        ReferenceDetailsPage rdp = new ReferenceDetailsPage();
        List<String> rdl = dt.asList();
        rdp.enterFirstReferenceFullName(rdl.get(0));
        rdp.enterFirstReferenceRelationship(rdl.get(1));
        rdp.enterFirstReferenceMobileNumber(rdl.get(2));
        rdp.enterFirstReferenceAltContactNumber(rdl.get(3));
        rdp.enterFirstReferenceOfficeNumber(rdl.get(4));
    }

    @When("the user enters the details of second reference")
    public void theUserEntersTheDetailsOfSecondReference(DataTable dt) {
        ReferenceDetailsPage rdp = new ReferenceDetailsPage();
        List<String> rdl = dt.asList();
        rdp.enterSecondReferenceFullName(rdl.get(0));
        rdp.enterSecondReferenceRelationship(rdl.get(1));
        rdp.enterSecondReferenceMobileNumber(rdl.get(2));
        rdp.enterSecondReferenceAltContactNumber(rdl.get(3));
        rdp.enterSecondReferenceOfficeNumber(rdl.get(4));
    }

    @When("the user press on continue on reference details screen")
    public void theUserPressOnContinueOnReferenceDetailsScreen() {
        new ReferenceDetailsPage().clickContinue();
    }

    @Then("the consent screen is displayed")
    public void theConsentScreenIsDisplayed() {
        System.out.println("Consent screen is displayed");
    }

    @And("the continue button on reference details should be disabled")
    public void theContinueButtonOnReferenceDetailsShouldBeDisabled() {
        Assert.assertFalse(new ReferenceDetailsPage().isContinueButtonClickable(),"Continue button is not Clickable");
    }


    @When("the user enters the details of invalid reference details list")
    public void theUserEntersTheDetailsOfReferenceDetailsList(DataTable dt) {
        ReferenceDetailsPage rdp1 = new ReferenceDetailsPage();
        List<List<String>> rdl = dt.asLists();
        for(List l : rdl){
            rdp1.enterFirstReferenceFullName(l.get(0).toString());
            rdp1.enterFirstReferenceRelationship(l.get(1).toString());
            rdp1.enterFirstReferenceMobileNumber(l.get(2).toString());
            rdp1.enterFirstReferenceAltContactNumber(l.get(3).toString());
            rdp1.enterFirstReferenceOfficeNumber(l.get(4).toString());
            rdp1.enterSecondReferenceFullName(l.get(5).toString());
            rdp1.enterSecondReferenceRelationship(l.get(6).toString());
            rdp1.enterSecondReferenceMobileNumber(l.get(7).toString());
            rdp1.enterSecondReferenceAltContactNumber(l.get(8).toString());
            rdp1.enterSecondReferenceOfficeNumber(l.get(9).toString());

            rdp1.clickContinue();
            Assert.assertFalse(rdp1.isContinueButtonClickable(),"Continue button is clickable");

            //Error check for first reference contact numbers
            if(!l.get(2).toString().startsWith("5")){
                Assert.assertTrue(rdp1.VerifyNumberError("Mobile number","1"),"Error message mismatch");

            }
            if(!(l.get(3).toString().startsWith("5") || l.get(3).toString().startsWith("02") || l.get(3).toString().startsWith("04") || l.get(3).toString().startsWith("06") || l.get(3).toString().startsWith("08"))){
                Assert.assertTrue(rdp1.VerifyNumberError("Alternate contact number", "1"),"Error message mismatch");
            }
            if(!(l.get(4).toString().startsWith("02") || l.get(4).toString().startsWith("04") || l.get(4).toString().startsWith("06") || l.get(4).toString().startsWith("08"))){
                Assert.assertTrue(rdp1.VerifyNumberError("Office number", "1"),"Error message mismatch");
            }

            //Error check for second reference contact numbers

            if(!l.get(7).toString().startsWith("5")){
                Assert.assertTrue(rdp1.VerifyNumberError("Mobile number","2"),"Error message mismatch");

            }
            if(!(l.get(8).toString().startsWith("5") || l.get(8).toString().startsWith("02") || l.get(8).toString().startsWith("04") || l.get(8).toString().startsWith("06") || l.get(8).toString().startsWith("08"))){
                Assert.assertTrue(rdp1.VerifyNumberError("Alternate contact number", "2"),"Error message mismatch");
            }
            if(!(l.get(9).toString().startsWith("02") || l.get(9).toString().startsWith("04") || l.get(9).toString().startsWith("06") || l.get(9).toString().startsWith("08"))){
                Assert.assertTrue(rdp1.VerifyNumberError("Office number", "2"),"Error message mismatch");
            }

            }
        }


        //it was not populating the DataTable in the parameter
    @When("the user enters the details of reference details list blank values")
    public void theUserEntersTheDetailsOfReferenceDetailsListBlankValues(DataTable dt) {
        ReferenceDetailsPage rdp1 = new ReferenceDetailsPage();
        List<List<String>> rdl = dt.asLists();
        for(List l : rdl) {
            rdp1.enterFirstReferenceFullName(l.get(0).toString());
            rdp1.enterFirstReferenceRelationship(l.get(1).toString());
            rdp1.enterFirstReferenceMobileNumber(l.get(2).toString());
            rdp1.enterFirstReferenceAltContactNumber(l.get(3).toString());
            rdp1.enterFirstReferenceOfficeNumber(l.get(4).toString());
            rdp1.enterSecondReferenceFullName(l.get(5).toString());
            rdp1.enterSecondReferenceRelationship(l.get(6).toString());
            rdp1.enterSecondReferenceMobileNumber(l.get(7).toString());
            rdp1.enterSecondReferenceAltContactNumber(l.get(8).toString());
            rdp1.enterSecondReferenceOfficeNumber(l.get(9).toString());
        }
            Assert.assertFalse(new ReferenceDetailsPage().isContinueButtonClickable(),"Continue button is clickable");
    }

    @And("the user swipes to Account Opening card")
    public void theUserSwipesToAccountOpeningCard() {
        new LoginPage().swapRightToLeftMortgage();
    }

    @When("the user enters the details valid of reference details list")
    public void theUserEntersTheDetailsValidOfReferenceDetailsList(DataTable dt) {
        ReferenceDetailsPage rdp1 = new ReferenceDetailsPage();
        List<List<String>> rdl = dt.asLists();
        for(List l : rdl) {
            rdp1.enterFirstReferenceFullName(l.get(0).toString());
            rdp1.enterFirstReferenceRelationship(l.get(1).toString());
            rdp1.enterFirstReferenceMobileNumber(l.get(2).toString());
            rdp1.enterFirstReferenceAltContactNumber(l.get(3).toString());
            rdp1.enterFirstReferenceOfficeNumber(l.get(4).toString());
            rdp1.enterSecondReferenceFullName(l.get(5).toString());
            rdp1.enterSecondReferenceRelationship(l.get(6).toString());
            rdp1.enterSecondReferenceMobileNumber(l.get(7).toString());
            rdp1.enterSecondReferenceAltContactNumber(l.get(8).toString());
            rdp1.enterSecondReferenceOfficeNumber(l.get(9).toString());
        }
        Assert.assertTrue(new ReferenceDetailsPage().isContinueButtonClickable(),"Continue button is not enabled");
    }

}
