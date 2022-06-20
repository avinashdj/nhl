package com.nhl.pages.referencedetails;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.*;

public class ReferenceDetailsPage {

    //Back Arrow
    private static final By BACK = By.xpath("//android.widget.Button[@content-desc='Back']");

    //Screen title and Other headings
    private static final By SCREEN_TITLE = By.xpath("//android.view.View[@content-desc='Reference details']");
    private static final By HEADING = By.xpath("//android.view.View[contains(@content-desc,'Share a contact')]");
    private static final By SUB_HEADING = By.xpath("//android.view.View[contains(@content-desc,'two people')]");

    //First Reference
    private static final By FIRST_REF_FULLNAME = By.xpath("//android.widget.EditText[contains(@text,'Full name')][1]");
    private static final By FIRST_REF_RELATIONSHIP = By.xpath("//android.widget.EditText[contains(@text,'Relationship')][1]");
    private static final By FIRST_REF_MOBILE_NUMBER = By.xpath("//android.widget.EditText[contains(@text,'Mobile number')][1]");
    private static final By FIRST_REF_ALT_CONTACT_NUMBER = By.xpath("//android.widget.EditText[contains(@text,'Alternate contact number')][1]");
    private static final By FIRST_REF_OFFICE_NUMBER = By.xpath("//android.widget.EditText[contains(@text,'Office number')][1]");

    //Second Reference
    private static final By SECOND_REF_FULLNAME = By.xpath("//android.widget.EditText[contains(@text,'Full name')][2]");
    private static final By SECOND_REF_RELATIONSHIP = By.xpath("//android.widget.EditText[contains(@text,'Relationship')][2]");
    private static final By SECOND_REF_MOBILE_NUMBER = By.xpath("//android.widget.EditText[contains(@text,'Mobile number')][2]");
    private static final By SECOND_REF_ALT_CONTACT_NUMBER = By.xpath("//android.widget.EditText[contains(@text,'Alternate contact number')][2]");
    private static final By SECOND_REF_OFFICE_NUMBER = By.xpath("//android.widget.EditText[contains(@text,'Office number')][2]");

    //Button
    private static final By CONTINUE = By.xpath("//android.widget.Button[@content-desc='Continue']");


    public ReferenceDetailsPage(){
    }

    public ReferenceDetailsPage enterFirstReferenceFullName(final String value){
        click(FIRST_REF_FULLNAME, "First Reference Full name");
        sendKeys(FIRST_REF_FULLNAME, value, "First Reference Full name");
        hideKeyboard();
        return this;
    }

    public ReferenceDetailsPage enterFirstReferenceRelationship(final String value){
        click(FIRST_REF_RELATIONSHIP, "First Reference Relationship");
        sendKeys(FIRST_REF_RELATIONSHIP, value, "First Reference Relationship");
        hideKeyboard();
        return this;
    }

    public ReferenceDetailsPage enterFirstReferenceMobileNumber(final String value){
        click(FIRST_REF_MOBILE_NUMBER, "First Reference Mobile Number");
        sendKeys(FIRST_REF_MOBILE_NUMBER, value, "First Reference Mobile Number");
        hideKeyboard();
        return this;
    }

    public ReferenceDetailsPage enterFirstReferenceAltContactNumber(final String value){
        click(FIRST_REF_ALT_CONTACT_NUMBER, "First Reference Alt contact Number");
        sendKeys(FIRST_REF_ALT_CONTACT_NUMBER, value, "First Reference Alt contact Number");
        hideKeyboard();
        return this;
    }

    public ReferenceDetailsPage enterFirstReferenceOfficeNumber(final String value){
        click(FIRST_REF_OFFICE_NUMBER, "First Reference Office Number");
        sendKeys(FIRST_REF_OFFICE_NUMBER, value, "First Reference Office Number");
        hideKeyboard();
        return this;
    }

    //Second Reference


    public ReferenceDetailsPage enterSecondReferenceFullName(final String value){
        click(SECOND_REF_FULLNAME, "Second Reference Full name");
        sendKeys(SECOND_REF_FULLNAME, value, "Second Reference Full name");
        hideKeyboard();
        return this;
    }

    public ReferenceDetailsPage enterSecondReferenceRelationship(final String value){
        click(SECOND_REF_RELATIONSHIP, "Second Reference Relationship");
        sendKeys(SECOND_REF_RELATIONSHIP, value, "Second Reference Relationship");
        hideKeyboard();
        return this;
    }

    public ReferenceDetailsPage enterSecondReferenceMobileNumber(final String value){
        click(SECOND_REF_MOBILE_NUMBER, "Second Reference Mobile Number");
        sendKeys(SECOND_REF_MOBILE_NUMBER, value, "Second Reference Mobile Number");
        hideKeyboard();
        return this;
    }

    public ReferenceDetailsPage enterSecondReferenceAltContactNumber(final String value){
        click(SECOND_REF_ALT_CONTACT_NUMBER, "Second Reference Alt contact Number");
        sendKeys(SECOND_REF_ALT_CONTACT_NUMBER, value, "Second Reference Alt contact Number");
        hideKeyboard();
        return this;
    }

    public ReferenceDetailsPage enterSecondReferenceOfficeNumber(final String value){
        click(SECOND_REF_OFFICE_NUMBER, "Second Reference Office Number");
        sendKeys(SECOND_REF_OFFICE_NUMBER, value, "Second Reference Office Number");
        hideKeyboard();
        return this;
    }

    public void clickContinue(){
        click(CONTINUE, "Continue Button");
    }


}
