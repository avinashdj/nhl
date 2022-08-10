package com.nhl.pages.acccountactivation;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.*;

public class MortgageContractTandCPage2 {
    //Back Arrow
    private static final By BACK = By.xpath("//android.widget.Button[1]");

    //Screen title and Other headings
    private static final By SCREEN_TITLE = By.xpath("(//android.view.View[@content-desc='Terms and Conditions'])[1]");
    private static final By HEADING = By.xpath("(//android.view.View[@content-desc='Terms and Conditions'])[2]");
    private static final By SUB_HEADING = By.xpath("//android.view.View[contains(@content-desc,'I confirm')]");

    //Content Heading and text
    private static final By READ_OUR_T_AND_C_LINK = By.xpath("//android.widget.Button[@content-desc='Read our Terms and Conditions']");

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

    public boolean isReadTAndCLinkEnabled() {
        return isEnabled(READ_OUR_T_AND_C_LINK, "Read T and C link Enabled");
    }

    public void clickReadAndTAndCLink(){
        click(READ_OUR_T_AND_C_LINK, "Read T and C link Enabled");
    }

    public boolean isContinueButtonEnabled(){
        return isEnabled(CONTINUE, "Continue Button");
    }

    public void clickContinue(){
        click(CONTINUE, "Continue Button");
    }

}