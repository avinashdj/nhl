package com.nhl.pages.referencedetails;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.*;

public class ReferenceDetailsPage {

    //Back Button
    private static final By BACK = By.xpath("//android.widget.Button[@content-desc='Back']");

    //Screen title and Other headings
    private static final By SCREEN_TITLE = By.xpath("//android.view.View[@content-desc='Reference details']");
    private static final By HEADING = By.xpath("//android.view.View[contains(@content-desc,'Share a contact')]");
    private static final By SUB_HEADING = By.xpath("//android.view.View[contains(@content-desc,'two people')]");

    //Button
    private static final By CONTINUE = By.xpath("//android.widget.Button[@content-desc='Continue']");

    //create generic xpath
    private static String genericEditXpath = "//android.widget.EditText[contains(@text,'%s')][%s]";

    public By getXpath(final String identifier, final String index){
        return By.xpath(String.format(genericEditXpath, identifier, index));
    }

    //create error xpath
    private static String genericErrorEditXpath = "//android.widget.EditText[contains(@text,'%s')][%s]/following-sibling::android.view.View[1]";

    public By getErrorXpath(final String identifier, final String index){
        return By.xpath(String.format(genericErrorEditXpath, identifier, index));
    }


    public ReferenceDetailsPage(){
    }

    public ReferenceDetailsPage enterFirstReferenceFullName(final String value){
        click(getXpath("Full name", "1"), "First Reference Full name");
        sendKeys(getXpath("Full name", "1"), value, "First Reference Full name");
        hideKeyboard();
        return this;
    }

    public ReferenceDetailsPage enterFirstReferenceRelationship(final String value){
        click(getXpath("Relationship", "1"), "First Reference Relationship");
        sendKeys(getXpath("Relationship", "1"), value, "First Reference Relationship");
        hideKeyboard();
        return this;
    }

    public ReferenceDetailsPage enterFirstReferenceMobileNumber(final String value){
        click(getXpath("Mobile number", "1"), "First Reference Mobile Number");
        sendKeys(getXpath("Mobile number", "1"), value, "First Reference Mobile Number");
        hideKeyboard();
        return this;
    }

    public ReferenceDetailsPage enterFirstReferenceAltContactNumber(final String value){
        click(getXpath("Alternate contact number", "1"), "First Reference Alt contact Number");
        sendKeys(getXpath("Alternate contact number", "1"), value, "First Reference Alt contact Number");
        hideKeyboard();
        return this;
    }

    public ReferenceDetailsPage enterFirstReferenceOfficeNumber(final String value){
        click(getXpath("Office number", "1"), "First Reference Office Number");
        sendKeys(getXpath("Office number", "1"), value, "First Reference Office Number");
        hideKeyboard();
        return this;
    }

    //Second Reference


    public ReferenceDetailsPage enterSecondReferenceFullName(final String value){
        click(getXpath("Full name", "2"), "Second Reference Full name");
        sendKeys(getXpath("Full name", "2"), value, "Second Reference Full name");
        hideKeyboard();
        return this;
    }

    public ReferenceDetailsPage enterSecondReferenceRelationship(final String value){
        click(getXpath("Relationship", "2"), "Second Reference Relationship");
        sendKeys(getXpath("Relationship", "2"), value, "Second Reference Relationship");
        hideKeyboard();
        return this;
    }

    public ReferenceDetailsPage enterSecondReferenceMobileNumber(final String value){
        click(getXpath("Mobile number", "2"), "Second Reference Mobile Number");
        sendKeys(getXpath("Mobile number", "2"), value, "Second Reference Mobile Number");
        hideKeyboard();
        return this;
    }

    public ReferenceDetailsPage enterSecondReferenceAltContactNumber(final String value){
        click(getXpath("Alternate contact number", "2"), "Second Reference Alt contact Number");
        sendKeys(getXpath("Alternate contact number", "2"), value, "Second Reference Alt contact Number");
        hideKeyboard();
        return this;
    }

    public ReferenceDetailsPage enterSecondReferenceOfficeNumber(final String value){
        click(getXpath("Office number", "2"), "Second Reference Office Number");
        sendKeys(getXpath("Office number", "2"), value, "Second Reference Office Number");
        hideKeyboard();
        return this;
    }

    public void clickContinue(){
        click(CONTINUE, "Continue Button");
    }

    public void clickBackButton(){
        click(BACK, "BACK Button");
    }

    public boolean isContinueButtonClickable() {return isClickable(CONTINUE,"Continue Button");}

    public String errContactNumberFirst(){return getContentDesc(getErrorXpath("Mobile number", "1"));}

    public String errContactNumberSecond(){return getContentDesc(getErrorXpath("Mobile number", "2"));}

    public String errAltContactNumberFirst(){return getContentDesc(getErrorXpath("Alternate contact number", "1"));}

    public String errAltContactNumberSecond(){return getContentDesc(getErrorXpath("Alternate contact number", "2"));}

    public String errOfficeNumberFirst(){return getContentDesc(getErrorXpath("Office number", "1"));}

    public String errOfficeNumberSecond(){return getContentDesc(getErrorXpath("Office number", "2"));}

    public String getScreenTitle(){
        return getContentDesc(SCREEN_TITLE);
    }

    public String getHeading(){
        return getContentDesc(HEADING);
    }

    public String getSubHeading(){
        return getContentDesc(SUB_HEADING);
    }

    public boolean VerifyNumberError(final String num,final String id){
        if(getContentDesc(getErrorXpath(num,id)).equals("Please enter a valid number")){
            return true;
        }
        return false;
    }

}

