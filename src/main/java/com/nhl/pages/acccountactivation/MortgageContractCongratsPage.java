package com.nhl.pages.acccountactivation;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.*;

public class MortgageContractCongratsPage {

    //Screen title
    private static final By SCREEN_TITLE = By.xpath("(//android.view.View[@content-desc='Mortgage contract");

    private static final By CONTENT_HEADING = By.xpath("(//android.view.View[@content-desc='Congratulations! Your NHL loan journey is complete.");

    private static final By CONTENT_1 = By.xpath("//android.view.View[contains(@content-desc,'Congratulations')]/" +
                    "following-sibling::android.view.View[1]");

    private static final By CONTENT_2 = By.xpath("//android.view.View[contains(@content-desc,'Congratulations')]/" +
            "following-sibling::android.view.View[2]");


    //Button
    private static final By DONE = By.xpath("//android.widget.Button[@content-desc='Done']");

    //Actions

    public String getScreenTitle(){
        return getContentDesc(SCREEN_TITLE);
    }

    public String getContentHeading() {
        return getContentDesc(CONTENT_HEADING);
    }

    public String getContentLine1() {
        return getContentDesc(CONTENT_1);
    }

    public String getContentLine2() {
        return getContentDesc(CONTENT_2);
    }

    public boolean isDoneButtonEnabled(){
        return isEnabled(DONE, "Continue Button");
    }

    public void clickDone(){
        click(DONE, "Continue Button");
    }

}

//Content Heading
//Congratulations! Your NHL loan journey is complete.

/*
Content1 = Our courier will reach you soon to collect your security cheques. Please sign and keep them ready.
Content2 = We've sent the contract copy to your registered email.
 */