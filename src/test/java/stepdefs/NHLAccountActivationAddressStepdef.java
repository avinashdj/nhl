package stepdefs;

import com.google.common.util.concurrent.Uninterruptibles;
import com.nhl.driver.DriverManager;
import com.nhl.pages.*;
import com.nhl.pages.accountactivation.YourHomeAddressPage;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;

import static com.nhl.utils.SeleniumUtils.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

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
    @When("the user enters Stree name {string}")
    public void theUserEntersStreeName(String value) {
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
//        Dimension size = DriverManager.getDriver().manage().window().getSize();
//        //Starting x location set to 5% of the width (near left)
//        int startx = (int) (size.width * 0.05);
//        //Ending x location set to 95% of the width (near right)
//        int endx = (int) (size.width * 0.05);
//        //y position set to mid-screen vertically
//        int starty = (int) (size.width * 0.05);
//        int endy = (int) (size.width * 0.95);
//        ((AndroidDriver) DriverManager.getDriver()).hideKeyboard();
//        //new TouchAction((AndroidDriver) DriverManager.getDriver()).press(startx, starty).waitAction(Duration.ofMillis(500)).moveTo(endx, endy).release().perform();
//        TouchAction touchAction = new TouchAction((PerformsTouchActions) DriverManager.getDriver());
//
//        touchAction.longPress(PointOption.point(startx, starty))
//                .waitAction(WaitOptions.waitOptions(ofSeconds(1)))
//                .moveTo(PointOption.point(endx, endy))
//                .release()
//                .perform();
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
    public void theUserValidatesVillaNumber(String string) {
        System.out.println(yourHomeAddressPage.getVillaNumber());
    }
    @Then("the user validates building name {string}")
    public void theUserValidatesBuildingName(String string) {
        System.out.println(yourHomeAddressPage.getBuildingName());
    }
    @Then("the user validates Street name {string}")
    public void theUserValidatesStreetName(String string) {
        System.out.println(yourHomeAddressPage.getStreetName());
    }
    @Then("the user validates Area {string}")
    public void theUserValidatesArea(String string) {
        System.out.println(yourHomeAddressPage.getArea());
    }
    @Then("the user validates Emirate {string}")
    public void theUserValidatesEmirate(String string) {
        System.out.println("Emirate");
        System.out.println(yourHomeAddressPage.getEmirate());
    }
    @Then("the user validates POBox {string}")
    public void theUserValidatesPOBox(String string) {
        System.out.println(yourHomeAddressPage.getPOBox());
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

}
