package stepdefs;

import com.google.common.util.concurrent.Uninterruptibles;
import com.nhl.driver.DriverManager;
import com.nhl.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class RegistrationStepDef {

    WelcomePage welcomePage = new WelcomePage();


    @Given("the user clicks on the Lets Get Started button")
    public void theUserClicksOnTheLetsGetStartedButton() {
        welcomePage.clickLetsGetStartedButton();
    }

    @When("the user enters the valid mobile number {string}")
    public void theUserEntersTheValidMobileNumber(String mobileNumber) {
        System.out.println(new RegisterYourMobilePage().getScreenTitle());
        new RegisterYourMobilePage()
                .enterPhoneNumber(mobileNumber);
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
    }

    @When("the user enter the valid mobile registration OTP")
    public void theUserEnterTheValidMobileRegistrationOTP() {
        new MobileOTPVerificationPage().enterOTP("123456").clickContinue();
    }

    @When("the user enter the valid mobile registration OTP {string}")
    public void theUserEnterTheValidMobileRegistrationOTP(String mobileOTP) {
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        new MobileOTPVerificationPage().enterOTP(mobileOTP).clickContinue();
    }

    @When("the user enters the valid email Address {string}")
    public void theUserEntersTheValidEmailAddress(String emailAddress) {
        new StayUpdatedPage().enterEmail(emailAddress).clickContinue();
    }

    @When("the user enters the valid email OTP {string}")
    public void theUserEntersTheValidEmailOTP(String emailOTP) {
        new EmailOTPVerificationPage().enterOTP(emailOTP).clickContinue();
    }

    @When("the user clicks on later for Location")
    public void theUserClicksOnLaterForLocation() {
        new LocationPage().clickLater();
    }

    @When("the user clicks on later for Biometric")
    public void theUserClicksOnLaterForBiometric() {
        new BiometricsPage().clickLater();
    }

    @When("the user enters the login pin {string}")
    public void theUserEntersTheLoginPin(String pin) {
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        new SetPinPage().setPin(pin).clickNext();
    }

    @When("the user confirms the login pin {string}")
    public void theUserConfirmsTheLoginPin(String pin) {
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        new ConfirmPinPage().confirmPin(pin).clickConfirm();
    }

    @Then("Appropriate Error message {string} should be shown")
    public void appropriateErrorMessageShouldBeShown(String errMessage) {
        String actual = new RegisterYourMobilePage().getErrorMessage();
        Assert.assertEquals(actual, errMessage,
                String.format("Actual message %s does not match expected message %s",
                        actual, errMessage ));
    }


    @Then("the user lands on the OCR screen")
    public void theUserLandsOnTheOCRScreen() {
        System.out.println("Step Defs");
    }

    @And("the user clicks on register button")
    public void theUserClicksOnRegisterButton() {
        new RegisterYourMobilePage().clickRegisterButton();
    }

}
