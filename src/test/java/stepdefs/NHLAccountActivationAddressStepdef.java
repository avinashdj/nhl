package stepdefs;

import com.nhl.pages.accountcreation.YourHomeAddressPage;
import com.nhl.pages.idandv.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.nhl.utils.SeleniumUtils.*;

import java.util.Map;

import static java.time.Duration.ofSeconds;

public class NHLAccountActivationAddressStepdef {

    YourHomeAddressPage yourHomeAddressPage = new YourHomeAddressPage();

    @When("the user clicks on the update button")
    public void theUserClicksOnTheUpdateButton() {
        yourHomeAddressPage.clickUpdate();

    }
    @When("the user enters villa number {string}")
    public void theUserEntersVillaNumber(String value) {
        yourHomeAddressPage.enterVillaNumber(value);
    }
    @When("the user enters building name {string}")
    public void theUserEntersBuildingName(String value) {
        yourHomeAddressPage.enterBuildingName(value);
    }
    @When("the user enters Street name {string}")
    public void theUserEntersStreetName(String value) {
        yourHomeAddressPage.enterStreetName(value);
    }
    @When("the user enters Area {string}")
    public void theUserEntersArea(String value) {
        yourHomeAddressPage.enterArea(value);
        hideKeyboard();
    }
    @When("the user selects Emirate {string}")
    public void theUserSelectsEmirate(String value) {
        yourHomeAddressPage.selectEmirate(value);
    }
    @When("the user enters POBox {string}")
    public void theUserEntersPOBox(String value) {
        yourHomeAddressPage.enterPOBox(value);
    }
    @When("the user clicks on done")
    public void theUserClicksOnDone() {
        yourHomeAddressPage.clickDone();
    }
    @When("the user clicks on the confirm button")
    public void theUserClicksOnTheConfirmButton() {
        yourHomeAddressPage.clickConfirm();
    }

    @Then("the income source screen is shown")
    public void theIncomeSourceScreenIsShown() {

    }

    //Validation Scenario

    @Then("the user validates villa number {string}")
    public void theUserValidatesVillaNumber(String expectedValue) {
        System.out.println(yourHomeAddressPage.getVillaNumber());
        Assert.assertEquals(expectedValue, yourHomeAddressPage.getVillaNumber(),
                String.format("%s is not matching the expected villa number %s",
                        yourHomeAddressPage.getVillaNumber(), expectedValue));
    }

    @Then("the user validates building name {string}")
    public void theUserValidatesBuildingName(String expectedValue) {
        System.out.println(yourHomeAddressPage.getBuildingName());
        Assert.assertEquals(expectedValue, yourHomeAddressPage.getBuildingName(),
                String.format("%s is not matching the expected villa number %s",
                        yourHomeAddressPage.getBuildingName(), expectedValue));
    }
    @Then("the user validates Street name {string}")
    public void theUserValidatesStreetName(String expectedValue) {
        System.out.println(yourHomeAddressPage.getStreetName());
        Assert.assertEquals(expectedValue, yourHomeAddressPage.getStreetName(),
                String.format("%s is not matching the expected Street number %s",
                        yourHomeAddressPage.getStreetName(), expectedValue));
    }
    @Then("the user validates Area {string}")
    public void theUserValidatesArea(String expectedValue) {
        System.out.println(yourHomeAddressPage.getArea());
        Assert.assertEquals(expectedValue, yourHomeAddressPage.getArea(),
                String.format("%s is not matching the expected Area %s",
                        yourHomeAddressPage.getArea(), expectedValue));
    }
    @Then("the user validates Emirate {string}")
    public void theUserValidatesEmirate(String expectedValue) {
        System.out.println(yourHomeAddressPage.getEmirate());
        Assert.assertEquals(expectedValue, yourHomeAddressPage.getEmirate(),
                String.format("%s is not matching the expected Emirate %s",
                        yourHomeAddressPage.getEmirate(), expectedValue));
    }
    @Then("the user validates POBox {string}")
    public void theUserValidatesPOBox(String expectedValue) {
        System.out.println(yourHomeAddressPage.getPOBox());
        Assert.assertEquals(expectedValue, yourHomeAddressPage.getPOBox(),
                String.format("%s is not matching the expected PO Box number %s",
                        yourHomeAddressPage.getPOBox(), expectedValue));
    }

    @Then("the user clicks on Continue button")
    public void theUserClicksOnContinueButton() {
        yourHomeAddressPage.clickContinue();
    }

    @Given("the user enters the correct pin {string}")
    public void theUserEntersTheCorrectPin(String pin) {
        new LoginPage().login(pin);
    }
    @When("the user lands on the Welcome page Step2")
    public void theUserLandsOnTheWelcomePageStep2() {
        System.out.println("user lands on the welcome page");
    }
    @When("the user clicks on Lets get started button to open NHL account")
    public void theUserClicksOnLetsGetStartedButtonToOpenNHLAccount() {
        System.out.println("user clicks step 2 of 3");
    }
    @Then("user lands on the Address screen")
    public void userLandsOnTheAddressScreen() {
        System.out.println("user lands on the address page");
    }

    @Then("Please fill your address details should be shown")
    public void pleaseFillYourAddressDetailsShouldBeShown() {
        Assert.assertTrue(yourHomeAddressPage.isRequiredFieldErrorMessageShown(), "Error message is not shown");
    }

    @Given("the user misses to enter the required fields error message is shown")
    public void theUserMissesToEnterTheRequiredFieldsErrorMessageIsShown(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        //Write the code to handle Data Table
        for (Map<String, String> data : dataTable.asMaps(String.class, String.class)) {
            yourHomeAddressPage.enterVillaNumber(data.get("villaNumber"));
            yourHomeAddressPage.enterBuildingName(data.get("buildingName"));
            yourHomeAddressPage.enterStreetName(data.get("streetName"));
            yourHomeAddressPage.enterArea(data.get("area"));
            yourHomeAddressPage.enterPOBox(data.get("poBox"));
            yourHomeAddressPage.clickDone();
            Assert.assertTrue(yourHomeAddressPage.isRequiredFieldErrorMessageShown(), "Error message - Please enter the required field is not shown");
        }
    }

}

