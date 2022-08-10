package com.nhl.pages.acccountactivation;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.*;

public class SIOAuthorizationPage {

    //Back Arrow
    private static final By BACK = By.xpath("//android.widget.Button[1]");

    //Screen title and Other headings
    private static final By SCREEN_TITLE = By.xpath("//android.view.View[@content-desc='SIO authorisation'][1]");
    private static final By HEADING = By.xpath("(//android.view.View[@content-desc='SIO authorisation'][2]");
    private static final By SUB_HEADING = By.xpath("//android.view.View[contains(@content-desc,'Please review your details')]");

    //Personal Details
    private static final By ACCOUNT_TITLE = By.xpath("//android.view.View[contains(@content-desc,'Account title')]");
    private static final By EMIRATES_ID = By.xpath("//android.view.View[contains(@content-desc,'Emirates ID number')]");
    private static final By PHONE_NUMBER = By.xpath("//android.view.View[contains(@content-desc,'Phone Number')]");

    //Bank details
    private static final By BANK_NAME = By.xpath("//android.view.View[contains(@content-desc,'Bank name')]");
    private static final By BRANCH_NAME = By.xpath("//android.view.View[contains(@content-desc,'Branch name')]");
    private static final By IBAN = By.xpath("//android.view.View[contains(@content-desc,'IBAN')]");
    private static final By ACCOUNT_NUMBER = By.xpath("//android.view.View[contains(@content-desc,'Account number')]");

    //Application details
    private static final By COMMENCE_DATE = By.xpath("//android.view.View[contains(@content-desc,'Commence date')]");
    private static final By INSTANCES_ALLOWED = By.xpath("//android.view.View[contains(@content-desc,'Instances allowed')]");
    private static final By FIXED_AMOUNT_MIN = By.xpath("//android.view.View[contains(@content-desc,'Fixed amount (min)')]");
    private static final By FIXED_AMOUNT_MAX = By.xpath("//android.view.View[contains(@content-desc,'Fixed amount (max)')]");
    private static final By FREQUENCY = By.xpath("//android.view.View[contains(@content-desc,'Frequency Monthly')]");
    private static final By EMI = By.xpath("//android.view.View[contains(@content-desc,'EMI')]");
    private static final By SIGNATURE = By.xpath("//android.view.View[contains(@content-desc,'Signature')]");

    //I Authorize
    private static final By I_AUTHORIZE_CHECKBOX = By.xpath("//android.widget.CheckBox");
    private static final By I_AUTHORIZE_CONTENT = By.xpath("//android.view.View[contains(@content-desc,'I hereby authorize the Bank')]");

    //I hereby authorize the Bank to rely on the image of my signature on my Emirates ID card for the purposes
    // of comparing any signed instructions it receives in future.

    //Button
    private static final By CONTINUE = By.xpath("//android.widget.Button[@content-desc='Continue']");

    public SIOAuthorizationPage(){
    }

    public String getScreenTitle(){
        return getContentDesc(SCREEN_TITLE);
    }

    public String getHeading(){
        return getContentDesc(HEADING);
    }

    public String getSubHeading(){
        return getContentDesc(SUB_HEADING);
    }

    public boolean isContinueButtonEnabled(){
        return isEnabled(CONTINUE, "Continue Button");
    }

    public void clickContinue(){
        click(CONTINUE, "Continue Button");
    }

    public void clickBackButton(){
        click(BACK, "BACK Button");
    }

    public boolean isContinueButtonClickable() {
        return isClickable(CONTINUE,"Continue Button");
    }

    public String getAccountTitle(){
        return getContentDesc(ACCOUNT_TITLE);
    }

    public String getEmirateID(){
        return getContentDesc(EMIRATES_ID);
    }

    public String getPhoneNumber(){
        return getContentDesc(PHONE_NUMBER);
    }

    public String getBankName(){
        return getContentDesc(BANK_NAME);
    }

    public String getBranchName(){
        return getContentDesc(BRANCH_NAME);
    }

    public String getIBAN(){
        return getContentDesc(IBAN);
    }

    public String getAccountNumber(){
        return getContentDesc(ACCOUNT_NUMBER);
    }

    public String getCommenceDate() {
        return getContentDesc(COMMENCE_DATE);
    }

    public String getInstancesAllowed(){
        return getContentDesc(INSTANCES_ALLOWED);
    }

    public String getFixedAmountMin(){
        return getContentDesc(FIXED_AMOUNT_MIN);
    }

    public String getFixedAmountMax(){
        return getContentDesc(FIXED_AMOUNT_MAX);
    }

    public String getFrequency(){
        return getContentDesc(FREQUENCY);
    }

    public String getEMI(){
        return getContentDesc(EMI);
    }

    public void selectConsent(){
        click(I_AUTHORIZE_CHECKBOX, "Consent");
    }

    public String getConsentText() {
        return getContentDesc(I_AUTHORIZE_CONTENT);
    }
}
