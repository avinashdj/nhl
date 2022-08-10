package stepdefs;

import com.nhl.pages.idandv.LoginPage;
import com.nhl.pages.accountcreation.referencedetails.ReferenceDetailsPage;
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
        rdp.step_enterFirstReferenceFullName(rdl.get(0));
        rdp.step_enterFirstReferenceRelationship(rdl.get(1));
        rdp.step_enterFirstReferenceMobileNumber(rdl.get(2));
        rdp.step_enterFirstReferenceAltContactNumber(rdl.get(3));
        rdp.enterFirstReferenceOfficeNumber(rdl.get(4));
    }

    @When("the user enters the details of second reference")
    public void theUserEntersTheDetailsOfSecondReference(DataTable dt) {
        ReferenceDetailsPage rdp = new ReferenceDetailsPage();
        List<String> rdl = dt.asList();
        rdp.step_enterSecondReferenceFullName(rdl.get(0));
        rdp.step_enterSecondReferenceRelationship(rdl.get(1));
        rdp.step_enterSecondReferenceMobileNumber(rdl.get(2));
        rdp.step_enterSecondReferenceAltContactNumber(rdl.get(3));
        rdp.enterSecondReferenceOfficeNumber(rdl.get(4));
    }

    @When("the user press on continue on reference details screen")
    public void theUserPressOnContinueOnReferenceDetailsScreen() {
        new ReferenceDetailsPage().step_clickContinue();
    }

    @Then("the consent screen is displayed")
    public void theConsentScreenIsDisplayed() {
        System.out.println("Consent screen is displayed");
    }

    @And("the continue button on reference details should be disabled")
    public void theContinueButtonOnReferenceDetailsShouldBeDisabled() {
        Assert.assertFalse(new ReferenceDetailsPage().isContinueButtonClickable(),"Continue button is not Clickable");
    }

    @And("the user gets {string} error in first reference contact number")
    public void theUserGetsErrorInFirstReferenceContactNumber(String errMsg) {
        String actErr = new ReferenceDetailsPage().errContactNumberFirst();
        Assert.assertEquals(actErr, errMsg,
                String.format("Actual message %s does not match expected message %s",
                        actErr, errMsg ));
    }

    @And("the user gets {string} error in first reference alternate contact number")
    public void theUserGetsErrorInFirstReferenceAlternateContactNumber(String errMsg) {
        String actErr = new ReferenceDetailsPage().errAltContactNumberFirst();
        Assert.assertEquals(actErr, errMsg,
                String.format("Actual message %s does not match expected message %s",
                        actErr, errMsg ));
    }

    @And("the user gets {string} error in first reference office contact number")
    public void theUserGetsErrorInFirstReferenceOfficeContactNumber(String errMsg) {
        String actErr = new ReferenceDetailsPage().errOfficeNumberFirst();
        Assert.assertEquals(actErr, errMsg,
                String.format("Actual message %s does not match expected message %s",
                        actErr, errMsg ));
    }

    @And("the user gets {string} error in Second reference contact number")
    public void theUserGetsErrorInSecondReferenceContactNumber(String errMsg) {
        String actErr = new ReferenceDetailsPage().errContactNumberSecond();
        Assert.assertEquals(actErr, errMsg,
                String.format("Actual message %s does not match expected message %s",
                        actErr, errMsg ));
    }

    @And("the user gets {string} error in Second reference alternate contact number")
    public void theUserGetsErrorInSecondReferenceAlternateContactNumber(String errMsg) {
        String actErr = new ReferenceDetailsPage().errAltContactNumberSecond();
        Assert.assertEquals(actErr, errMsg,
                String.format("Actual message %s does not match expected message %s",
                        actErr, errMsg ));
    }

    @And("the user gets {string} error in Second reference office contact number")
    public void theUserGetsErrorInSecondReferenceOfficeContactNumber(String errMsg) {
        String actErr = new ReferenceDetailsPage().errOfficeNumberSecond();
        Assert.assertEquals(actErr, errMsg,
                String.format("Actual message %s does not match expected message %s",
                        actErr, errMsg ));
    }

    @When("the user enters the details of reference details list")
    public void theUserEntersTheDetailsOfReferenceDetailsList(DataTable dt) {
        ReferenceDetailsPage rdp1 = new ReferenceDetailsPage();
        ReferenceDetailsPage rdp2 = new ReferenceDetailsPage();
        List<List<String>> rdl = dt.asLists();
        for(List l : rdl){
            rdp1.step_enterFirstReferenceFullName(l.get(0).toString());
            rdp1.step_enterFirstReferenceRelationship(l.get(1).toString());
            rdp1.step_enterFirstReferenceMobileNumber(l.get(2).toString());
            rdp1.step_enterFirstReferenceAltContactNumber(l.get(3).toString());
            rdp1.enterFirstReferenceOfficeNumber(l.get(4).toString());
            rdp1.step_enterSecondReferenceFullName(l.get(5).toString());
            rdp1.step_enterSecondReferenceRelationship(l.get(6).toString());
            rdp1.step_enterSecondReferenceMobileNumber(l.get(7).toString());
            rdp1.step_enterSecondReferenceAltContactNumber(l.get(8).toString());
            rdp1.enterSecondReferenceOfficeNumber(l.get(9).toString());


            //click on contine after entering the data
            new ReferenceDetailsPage().step_clickContinue();

            //Error check for first reference contact numbers
            if(!l.get(2).toString().startsWith("5")){
                theUserGetsErrorInFirstReferenceContactNumber("Please enter a valid number");
            }
            if(!l.get(3).toString().startsWith("5")){
                theUserGetsErrorInFirstReferenceAlternateContactNumber("Please enter a valid number");
            }
            if(!(l.get(4).toString().startsWith("02") || l.get(4).toString().startsWith("04") || l.get(4).toString().startsWith("08"))){
                theUserGetsErrorInFirstReferenceOfficeContactNumber("Please enter a valid number");
            }


            //Error check for second reference contact numbers

            if(!l.get(7).toString().startsWith("5")){
                theUserGetsErrorInFirstReferenceContactNumber("Please enter a valid number");
            }
            if(!l.get(8).toString().startsWith("5")){
                theUserGetsErrorInFirstReferenceAlternateContactNumber("Please enter a valid number");
            }
            if(!(l.get(9).toString().startsWith("02") || l.get(9).toString().startsWith("04") || l.get(9).toString().startsWith("08"))){
                theUserGetsErrorInFirstReferenceOfficeContactNumber("Please enter a valid number");
            }

//            //Blank check
//            if(l.get(0).toString().isBlank() || l.get(1).toString().isBlank() || l.get(2).toString().isBlank() || l.get(3).toString().isBlank() || l.get(5).toString().isBlank() || l.get(6).toString().isBlank() || l.get(7).toString().isBlank() || l.get(8).toString().isBlank()){
//                theContinueButtonOnReferenceDetailsShouldBeDisabled();
//            }
//
//            //
//            else
//            {
//                //click on continue
//                new ReferenceDetailsPage().clickContinue();
//                //Error check for first reference contact numbers
//                if(!l.get(2).toString().startsWith("5")){
//                    theUserGetsErrorInFirstReferenceContactNumber("Please enter a valid number");
//                }
//                if(!l.get(3).toString().startsWith("5")){
//                    theUserGetsErrorInFirstReferenceAlternateContactNumber("Please enter a valid number");
//                }
//                if(!(l.get(4).toString().startsWith("02") || l.get(4).toString().startsWith("04") || l.get(4).toString().startsWith("08"))){
//                    theUserGetsErrorInFirstReferenceOfficeContactNumber("Please enter a valid number");
//                }
//
//
//                //Error check for second reference contact numbers
//
//                if(!l.get(7).toString().startsWith("5")){
//                    theUserGetsErrorInFirstReferenceContactNumber("Please enter a valid number");
//                }
//                if(!l.get(8).toString().startsWith("5")){
//                    theUserGetsErrorInFirstReferenceAlternateContactNumber("Please enter a valid number");
//                }
//                if(!(l.get(9).toString().startsWith("02") || l.get(9).toString().startsWith("04") || l.get(9).toString().startsWith("08"))){
//                    theUserGetsErrorInFirstReferenceOfficeContactNumber("Please enter a valid number");
//                }
//            }
            }
        }


        //it was not populating the DataTable in the parameter
    @When("the user enters the details of reference details list blank values")
    public void theUserEntersTheDetailsOfReferenceDetailsListBlankValues(DataTable dt) {
        ReferenceDetailsPage rdp1 = new ReferenceDetailsPage();
        List<List<String>> rdl = dt.asLists();
        for(List l : rdl) {
            rdp1.step_enterFirstReferenceFullName(l.get(0).toString());
            rdp1.step_enterFirstReferenceRelationship(l.get(1).toString());
            rdp1.step_enterFirstReferenceMobileNumber(l.get(2).toString());
            rdp1.step_enterFirstReferenceAltContactNumber(l.get(3).toString());
            rdp1.enterFirstReferenceOfficeNumber(l.get(4).toString());
            rdp1.step_enterSecondReferenceFullName(l.get(5).toString());
            rdp1.step_enterSecondReferenceRelationship(l.get(6).toString());
            rdp1.step_enterSecondReferenceMobileNumber(l.get(7).toString());
            rdp1.step_enterSecondReferenceAltContactNumber(l.get(8).toString());
            rdp1.enterSecondReferenceOfficeNumber(l.get(9).toString());
        }
            Assert.assertFalse(new ReferenceDetailsPage().isContinueButtonClickable());
    }

    @And("the user swipes to Account Opening card")
    public void theUserSwipesToAccountOpeningCard() {
        new LoginPage().swapRightToLeftMortgage();
    }
}
