package com.nhl.pages.accountactivation;

import org.openqa.selenium.By;

import static com.nhl.utils.SeleniumUtils.*;

public class YourHomeAddressPage {

    //Links
    private static final By UPDATE = By.xpath("//android.widget.Button[@content-desc='Update']");
    private static final By DONE = By.xpath("//android.widget.Button[@content-desc='Done']");

    //Back Arrow
    private static final By BACK = By.xpath("//android.widget.Button[@content-desc='Back']");

    //Screen title and Other headings
    private static final By SCREEN_TITLE = By.xpath("//android.view.View[@content-desc='NHL account']");
    private static final By HEADING = By.xpath("//android.view.View[contains(@content-desc,'Your home address')]");
    private static final By SUB_HEADING = By.xpath("//android.view.View[contains(@content-desc,'Please review')]");

    //Editable Fields in the page
    private static final By VILLA_NUMBER = By.xpath("//android.widget.EditText[1]");
    private static final By BUILDING_NAME = By.xpath("//android.widget.EditText[2]");
    private static final By STREET_NAME = By.xpath("//android.widget.EditText[3]");
    private static final By AREA = By.xpath("//android.widget.EditText[4]");
    private static final By EMIRATE = By.xpath("//android.view.View[@content-desc='Emirate']/following-sibling::android.widget.ImageView");
    private static final By PO_BOX = By.xpath("//android.widget.EditText[5]");

    //Values after edit
    private static final By VILLA_NUMBER_VALUE = By.xpath("//android.view.View[contains(@content-desc,'Villa')]/following-sibling::android.view.View[1]");
    private static final By BUILDING_NAME_VALUE= By.xpath("//android.view.View[contains(@content-desc,'Building')]/following-sibling::android.view.View[1]");
    private static final By STREET_NAME_VALUE = By.xpath("//android.view.View[contains(@content-desc,'Street')]/following-sibling::android.view.View[1]");
    private static final By AREA_VALUE = By.xpath("//android.view.View[contains(@content-desc,'Area')]/following-sibling::android.view.View[1]");
    private static final By EMIRATE_VALUE = By.xpath("//android.view.View[@content-desc='Emirate']/following-sibling::android.view.View[1]");
    private static final By PO_BOX_VALUE = By.xpath("//android.view.View[contains(@content-desc,'P.O.Box')]/following-sibling::android.view.View[1]");


    //Button
    private static final By CONTINUE = By.xpath("//*[@content-desc='Continue']");
    private static final By CONFIRM = By.xpath("//*[@content-desc='Confirm']");

    public YourHomeAddressPage(){
    }

    public YourHomeAddressPage enterVillaNumber(final String value){
        click(VILLA_NUMBER, "Villa Number");
        sendKeys(VILLA_NUMBER, value, "Villa Number ");
        return this;
    }

    public YourHomeAddressPage enterBuildingName(final String value){
        click(BUILDING_NAME, "Building Name");
        sendKeys(BUILDING_NAME, value, "Building Name");
        return this;
    }

    public YourHomeAddressPage enterStreetName(final String value){
        click(STREET_NAME, "Street Name");
        sendKeys(STREET_NAME, value, "Street Name");
        return this;
    }

    public YourHomeAddressPage enterArea(final String value){
        click(AREA, "Area");
        sendKeys(AREA, value, "Area");
        return this;
    }

    public YourHomeAddressPage enterPOBox(final String value){
        click(PO_BOX, "P.O Box");
        sendKeys(PO_BOX, value, "P.O Box");
        return this;
    }

    public YourHomeAddressPage selectEmirate(final String value){
        click(EMIRATE, "Emirate");
        String path = String.format("//android.view.View[@content-desc='%s']", value);
        click(By.xpath(path), value);
        return this;
    }

    public String getVillaNumber(){
        return getContentDesc(VILLA_NUMBER_VALUE);
    }

    public String getBuildingName(){
        return getContentDesc(BUILDING_NAME_VALUE);
    }

    public String getStreetName(){
        return getContentDesc(STREET_NAME_VALUE);
    }

    public String getArea(){
        return getContentDesc(AREA_VALUE);
    }

    public String getEmirate(){
        return getContentDesc(EMIRATE_VALUE);
    }

    public String getPOBox(){
        return getContentDesc(PO_BOX_VALUE);
    }

    public void clickUpdate(){
        click(UPDATE, "Update Link");
    }

    public void clickConfirm(){
        click(CONFIRM, "Confirm button");
    }

    public void clickDone(){
        click(DONE, "Done Link");
    }

    public void clickContinue(){
        click(CONTINUE, "Continue button");
    }

}
