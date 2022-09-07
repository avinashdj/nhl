package stepdefs;

import com.google.common.util.concurrent.Uninterruptibles;
import com.nhl.pages.idandv.*;
import com.nhl.pages.menunavigations.MenuMainPage;
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

    @When("the user enters the mobile number {string}")
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

    @When("the user enter the mobile registration OTP {string}")
    public void theUserEnterTheValidMobileRegistrationOTP(String mobileOTP) {
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        new MobileOTPVerificationPage().enterOTP(mobileOTP).clickContinue();
    }

    @When("the user enters the email Address {string}")
    public void theUserEntersTheValidEmailAddress(String emailAddress) {
        new StayUpdatedPage().enterEmail(emailAddress);
    }

    @When("the user enters the email OTP {string}")
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

    @Then("the user lands on the OCR screen")
    public void theUserLandsOnTheOCRScreen() {
        System.out.println("Step Defs");
    }

    @And("the user clicks on register button")
    public void theUserClicksOnRegisterButton() {
        new RegisterYourMobilePage().clickRegisterButton();
    }

    @Then("Appropriate Error message {string} should be shown")
    public void appropriateErrorMessageShouldBeShown(String errMessage) {
        String actual = new RegisterYourMobilePage().getErrorMessage();
        Assert.assertEquals(actual, errMessage,
                String.format("Actual message %s does not match expected message %s",
                        actual, errMessage ));
    }

    @Then("continue button in email page should be {string}")
    public void continueButtonShouldBe(String isDisabled) {
        //if(isDisabled.equalsIgnoreCase("true"))
        if(isDisabled.equalsIgnoreCase("Disabled")){
            //Assert.assertFalse(new StayUpdatedPage().checkIfContinueButtonIsEnabled());
        } else {
            //Assert.assertTrue(new StayUpdatedPage().checkIfContinueButtonIsEnabled());
        }
        //System.out.println(new StayUpdatedPage().checkIfContinueButtonIsEnabled());
    }


    @And("the user clicks on Continue for email button")
    public void theUserClicksOnContinueForEmailButton() {
        new StayUpdatedPage().clickContinue();
    }

    @And("the user clicks on allow for Location")
    public void theUserClicksOnAllowForLocation() {
        new LocationPage().allowLocation();
    }

    @And("the user clicks on skip link for email address")
    public void theUserClicksOnSkipLinkForEmailAddress() {
        //new StayUpdatedPage().clickSkip();
    }

    @Given("user complete customer verification flow and landing welcome screen with {string} {string} {string}")
    public void userCompleteCustomerVerificationFlowAndLandingWelcomeScreenWith(String mobile, String otp, String pin) {
        // 1 Out of 3 Phase - Workflow Started
        new GetStaterPage().step_getStarted().step_registeredMobileNumber(mobile).
                step_registrationSubmit().step_setContinueWithOTP(otp).
                step_SkipWithoutEmail().step_setPin(pin).step_nextToConfirm().step_setConfirmPin(pin).
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().
                check_and_validate_welcomeTitle();
    }

    @When("User landing to nhl menu screen through welcome screen")
    public void userLandingToNhlMenuScreenThroughWelcomeScreen() {
        new DashboardPage().switchTOMenu();
    }

    @Then("User landing faq's screen and validate its functionalities")
    public void userLandingFaqSScreenAndValidateItsFunctionalities() {
        new MenuMainPage().step_faqsClickAndNavigate().check_and_validate_faqsNHLTitle().
                check_and_validate_faqQuestionsBody().step_goBack();
    }

    @Then("User landing about screen and validate its functionalities")
    public void userLandingAboutScreenAndValidateItsFunctionalities() {
        new MenuMainPage().step_aboutClickAndNavigate().check_and_validate_aboutNHLTitle().
                check_and_validate_aboutNHLBody().step_goBack();
    }

    @Then("User landing personalize screen and validate its functionalities with {string} {string}")
    public void userLandingPersonalizeScreenAndValidateItsFunctionalitiesWith(String name, String mobile) {
        new MenuMainPage().step_identityVerifyClickAndNavigate().check_and_validate_personalInfoTitle().
                check_and_validate_customerName(name).check_and_validate_customerEmail("Stay updated about your application").
                check_and_validate_customerMobile(mobile).step_goBack();
    }

    @Then("User landing islamic screen and validate its functionalities")
    public void userLandingIslamicScreenAndValidateItsFunctionalities() {
        new MenuMainPage().step_islamicProductClickAndNavigate().check_and_validate_islamicProductsTitle().step_goBack().step_logoutNHL();
    }
}
