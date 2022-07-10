package com.nhl.pages.acccountactivation;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.*;

public class LoanAgreementPage {
    //Back Arrow
    private static final By BACK = By.xpath("//android.widget.Button[1]");

    //Screen title and Other headings
    private static final By SCREEN_TITLE = By.xpath("(//android.view.View[@content-desc='Loan agreement'])[1]");
    private static final By HEADING = By.xpath("(//android.view.View[@content-desc='Loan agreement'])[2]");
    private static final By SUB_HEADING = By.xpath("//android.view.View[@content-desc='Please read your loan agreement.']");

    //Content Heading and text
    private static final By LOAN_AGREEMENT_CONTENT_HEADING = By.xpath("//android.view.View[@content-desc='LOAN AGREEMENT']");
    private static final By LOAN_AGREEMENT_CONTENT = By.xpath("//android.view.View[@content-desc='LOAN AGREEMENT']/following-sibling::android.view.View");

    //I agree
    private static final By I_AUTHORIZE_TEXT= By.xpath("//android.view.View[contains(@content-desc,'I hereby authorize the Bank')]");
    private static final By I_AUTHORIZE = By.xpath("//android.view.View[contains(@content-desc,'I hereby authorize the Bank')]/android.widget.CheckBox");

    //Button
    private static final By CONTINUE = By.xpath("//android.widget.Button[@content-desc='Continue']");

    //Actions
    public void clickBackButton(){
        click(BACK, "BACK Button");
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

    public String getLoanAgreementContentHeading(){
        return getContentDesc(LOAN_AGREEMENT_CONTENT_HEADING);
    }

    public String getLoanAgreementContent(){
        return getContentDesc(LOAN_AGREEMENT_CONTENT);
    }

    public String getIAuthorizeText(){
        return getContentDesc(I_AUTHORIZE_TEXT);
    }

    public void clickIAuthorize(){
        click(I_AUTHORIZE, "I Authorize Checkbox");
    }

    public boolean isIAuthorizeCheckBoxEnabled() {
        return isEnabled(I_AUTHORIZE, "I Authorize Checkbox");
    }

    public boolean isContinueButtonEnabled(){
        return isEnabled(CONTINUE, "Continue Button");
    }

    public void clickContinue(){
        click(CONTINUE, "Continue Button");
    }

}

//T and C content
/*
To be populated
 */
// I Authorize text
/*
I hereby authorize the Bank to rely on the image of my signature on my Emirates ID
card for the purposes of comparing any signed instructions it receives in future.
 */