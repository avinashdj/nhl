package com.nhl.pages.accountcreation.referencedetails;

import com.nhl.pages.accountcreation.additionaldetails.PEPPage;
import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.*;

public class ReferenceDetailsPage {

    public ReferenceDetailsPage(){
    }


    //Back Button
    private static final By BACK = By.xpath("//android.widget.Button[@content-desc='Back']");

    //Screen title and Other headings
    private static final By SCREEN_TITLE = By.xpath("//android.view.View[@content-desc='Reference details']");
    private static final By HEADING = By.xpath("//android.view.View[contains(@content-desc,'Share a contact')]");
    private static final By SUB_HEADING = By.xpath("//android.view.View[contains(@content-desc,'two people')]");


    //First Reference
    private static final By FIRST_REF_FULL_NAME = By.xpath("//android.view.View[@content-desc='FIRST REFERENCE']/following-sibling::android.widget.EditText[1]");
    private static final By FIRST_REF_RELATIONSHIP = By.xpath("//android.view.View[@content-desc='FIRST REFERENCE']/following-sibling::android.widget.EditText[2]");
    private static final By FIRST_REF_MOBILE_NUMBER = By.xpath("//android.view.View[@content-desc='FIRST REFERENCE']/following-sibling::android.widget.EditText[3]");
    private static final By ERROR_MESSAGE_REF_NO1 = By.xpath("//android.widget.EditText[contains(@text,'Mobile number')][1]/following-sibling::android.view.View[1]");
    private static final By FIRST_REF_ALT_CONTACT_NUMBER = By.xpath("//android.view.View[@content-desc='FIRST REFERENCE']/following-sibling::android.widget.EditText[4]");
    private static final By ERROR_MESSAGE_ALT_NO1 = By.xpath("//android.widget.EditText[contains(@text,'Alternate contact number')][1]/following-sibling::android.view.View[1]");
    private static final By FIRST_REF_OFFICE_NUMBER = By.xpath("//android.widget.EditText[contains(@text,'Office number')][1]");
    private static final By ERROR_MESSAGE_OFF_NO1 = By.xpath("//android.widget.EditText[contains(@text,'Office number')][1]/following-sibling::android.view.View[1]");

    //Second Reference
    private static final By SECOND_REF_FULL_NAME = By.xpath("//android.widget.EditText[contains(@text,'Full name')][2]");
    private static final By SECOND_REF_RELATIONSHIP = By.xpath("//android.widget.EditText[contains(@text,'Relationship')][2]");
    private static final By SECOND_REF_MOBILE_NUMBER = By.xpath("//android.widget.EditText[contains(@text,'Mobile number')][2]");
    private static final By ERROR_MESSAGE_REF_NO2 = By.xpath("//android.widget.EditText[contains(@text,'Mobile number')][2]/following-sibling::android.view.View[1]");
    private static final By SECOND_REF_ALT_CONTACT_NUMBER = By.xpath("//android.widget.EditText[contains(@text,'Alternate contact number')][2]");
    private static final By ERROR_MESSAGE_ALT_NO2 = By.xpath("//android.widget.EditText[contains(@text,'Alternate contact number')][2]/following-sibling::android.view.View[1]");
    private static final By SECOND_REF_OFFICE_NUMBER = By.xpath("//android.widget.EditText[contains(@text,'Office number')][2]");
    private static final By ERROR_MESSAGE_OFF_NO2 = By.xpath("//android.widget.EditText[contains(@text,'Office number')][2]/following-sibling::android.view.View[1]");

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


    /**
     * Step :  User enter 1st reference contact person - full name
     *
     * @author avinsh
     * @update 20/7/2022 - shiwantha (reason : cleanup)
     * @return ReferenceDetailsPage
     */
    public ReferenceDetailsPage step_enterFirstReferenceFullName(final String value){
        click(FIRST_REF_FULL_NAME, "Full name");
        sendKeys(FIRST_REF_FULL_NAME, value, "Full name");
//=======
//    public ReferenceDetailsPage enterFirstReferenceFullName(final String value){
//        click(getXpath("Full name", "1"), "First Reference Full name");
//        sendKeys(getXpath("Full name", "1"), value, "First Reference Full name");
//>>>>>>> 03739cfdeff7dec0a45df37f79636d3503bc41f5:src/main/java/com/nhl/pages/referencedetails/ReferenceDetailsPage.java
        hideKeyboard();
        return this;
    }


    /**
     * Step :  User enter 1st reference contact person - relationship
     *
     * @author avinsh
     * @update 20/7/2022 - shiwantha (reason : cleanup)
     * @return ReferenceDetailsPage
     */
    public ReferenceDetailsPage step_enterFirstReferenceRelationship(final String value){
        click(FIRST_REF_RELATIONSHIP, "Relationship");
        sendKeys(FIRST_REF_RELATIONSHIP, value, "Relationship");
//=======
//    public ReferenceDetailsPage enterFirstReferenceRelationship(final String value){
//        click(getXpath("Relationship", "1"), "First Reference Relationship");
//        sendKeys(getXpath("Relationship", "1"), value, "First Reference Relationship");
//>>>>>>> 03739cfdeff7dec0a45df37f79636d3503bc41f5:src/main/java/com/nhl/pages/referencedetails/ReferenceDetailsPage.java
        hideKeyboard();
        return this;
    }


    /**
     * Step :  User enter 1st reference contact person - primary mobile
     *
     * @author avinsh
     * @update 20/7/2022 - shiwantha (reason : cleanup)
     * @return ReferenceDetailsPage
     */
    public ReferenceDetailsPage step_enterFirstReferenceMobileNumber(final String value){
        click(FIRST_REF_MOBILE_NUMBER, "Mobile Number");
        sendKeys(FIRST_REF_MOBILE_NUMBER, value, "Mobile Number");
//=======
//    public ReferenceDetailsPage enterFirstReferenceMobileNumber(final String value){
//        click(getXpath("Mobile number", "1"), "First Reference Mobile Number");
//        sendKeys(getXpath("Mobile number", "1"), value, "First Reference Mobile Number");
//>>>>>>> 03739cfdeff7dec0a45df37f79636d3503bc41f5:src/main/java/com/nhl/pages/referencedetails/ReferenceDetailsPage.java
        hideKeyboard();
        return this;
    }


    /**
     * Step :  User enter 1st reference contact person - secondary mobile
     *
     * @author avinsh
     * @update 20/7/2022 - shiwantha (reason : cleanup)
     * @return ReferenceDetailsPage
     */
    public ReferenceDetailsPage step_enterFirstReferenceAltContactNumber(final String value){
        click(FIRST_REF_ALT_CONTACT_NUMBER, "Alt. Reference Number");
        sendKeys(FIRST_REF_ALT_CONTACT_NUMBER, value, "Alt. Reference Number");
//=======
//    public ReferenceDetailsPage enterFirstReferenceAltContactNumber(final String value){
//        click(getXpath("Alternate contact number", "1"), "First Reference Alt contact Number");
//        sendKeys(getXpath("Alternate contact number", "1"), value, "First Reference Alt contact Number");
//>>>>>>> 03739cfdeff7dec0a45df37f79636d3503bc41f5:src/main/java/com/nhl/pages/referencedetails/ReferenceDetailsPage.java
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



    public ReferenceDetailsPage step_enterSecondReferenceFullName(final String value){
        click(SECOND_REF_FULL_NAME, "Full name");
        sendKeys(SECOND_REF_FULL_NAME, value, "Full name");
//=======
//    public ReferenceDetailsPage enterSecondReferenceFullName(final String value){
//        click(getXpath("Full name", "2"), "Second Reference Full name");
//        sendKeys(getXpath("Full name", "2"), value, "Second Reference Full name");
//>>>>>>> 03739cfdeff7dec0a45df37f79636d3503bc41f5:src/main/java/com/nhl/pages/referencedetails/ReferenceDetailsPage.java
        hideKeyboard();
        return this;
    }


    public ReferenceDetailsPage step_enterSecondReferenceRelationship(final String value){
        click(SECOND_REF_RELATIONSHIP, "Relationship");
        sendKeys(SECOND_REF_RELATIONSHIP, value, "Relationship");
//=======
//    public ReferenceDetailsPage enterSecondReferenceRelationship(final String value){
//        click(getXpath("Relationship", "2"), "Second Reference Relationship");
//        sendKeys(getXpath("Relationship", "2"), value, "Second Reference Relationship");
//>>>>>>> 03739cfdeff7dec0a45df37f79636d3503bc41f5:src/main/java/com/nhl/pages/referencedetails/ReferenceDetailsPage.java
        hideKeyboard();
        return this;
    }


    public ReferenceDetailsPage step_enterSecondReferenceMobileNumber(final String value){
        click(SECOND_REF_MOBILE_NUMBER, "Mobile Number");
        sendKeys(SECOND_REF_MOBILE_NUMBER, value, "Mobile Number");
//=======
//    public ReferenceDetailsPage enterSecondReferenceMobileNumber(final String value){
//        click(getXpath("Mobile number", "2"), "Second Reference Mobile Number");
//        sendKeys(getXpath("Mobile number", "2"), value, "Second Reference Mobile Number");
//>>>>>>> 03739cfdeff7dec0a45df37f79636d3503bc41f5:src/main/java/com/nhl/pages/referencedetails/ReferenceDetailsPage.java
        hideKeyboard();
        return this;
    }


    public ReferenceDetailsPage step_enterSecondReferenceAltContactNumber(final String value){
        click(SECOND_REF_ALT_CONTACT_NUMBER, "Alt Mobile Number");
        sendKeys(SECOND_REF_ALT_CONTACT_NUMBER, value, "Alt Mobile Number");
//=======
//    public ReferenceDetailsPage enterSecondReferenceAltContactNumber(final String value){
//        click(getXpath("Alternate contact number", "2"), "Second Reference Alt contact Number");
//        sendKeys(getXpath("Alternate contact number", "2"), value, "Second Reference Alt contact Number");
//>>>>>>> 03739cfdeff7dec0a45df37f79636d3503bc41f5:src/main/java/com/nhl/pages/referencedetails/ReferenceDetailsPage.java
        hideKeyboard();
        return this;
    }

    public ReferenceDetailsPage enterSecondReferenceOfficeNumber(final String value){
        click(getXpath("Office number", "2"), "Second Reference Office Number");
        sendKeys(getXpath("Office number", "2"), value, "Second Reference Office Number");
        hideKeyboard();
        return this;
    }

    /**
     * Step :  User completed 3rd party reference details and continue
     *
     * @author shiwnatha
     * @update 20/7/2022
     * @return PEPPage
     */
    public PEPPage step_clickContinue(){
        click(CONTINUE, "Continue Button");
        SeleniumUtils.waitFor(3000);
        return new PEPPage();
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

