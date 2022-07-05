package com.nhl.pages.sourceofincome;

import com.nhl.driver.DriverManager;
import com.nhl.pages.ConfirmPinPage;
import org.bouncycastle.jcajce.provider.symmetric.DES;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static com.nhl.utils.SeleniumUtils.*;

public class IncomeDetailsPage {

    //Back Button
    private static final By BACK = By.xpath("//android.widget.Button[@content-desc='Back']");

    //Title, Screen title and Subtitle
    private static final By SCREEN_NAME = By.xpath("//android.view.View[@content-desc='Source of income']");
    private static final By TITLE= By.xpath("//android.view.View[@content-desc='Income details']");
    private static final By SUB_TITLE = By.xpath("//android.view.View[contains(@content-desc, 'source of income')]");

    //cards
    private static final By SALARY_DETAILS = By.xpath("//android.view.View[contains(@content-desc,'SALARY DETAILS')]");
    private static final By OWN_BUSINESS = By.xpath("//android.view.View[contains(@content-desc,'OWN BUSINESS')]");
    private static final By ADDITIONAL_INCOME = By.xpath("//android.view.View[contains(@content-desc,'ADDITIONAL INCOME')]");

    //Continue button
    private static final By CONTINUE = By.xpath("//*[@content-desc='Continue']");

    public IncomeDetailsPage(){
    }

    public String getScreenName(){
        return getContentDesc(SCREEN_NAME);
    }

    public String getTitle(){
        return getContentDesc(TITLE);
    }

    public String getSubTitle() {
        return getContentDesc(SUB_TITLE);
    }

    public void clickBackButton(){
        click(BACK, "BACK Button");
    }

    public String getSalaryDetailsText(){
        return getContentDesc(SALARY_DETAILS);
    }

    public void clickSalaryDetails(){
        click(SALARY_DETAILS, "Salary Details card");
    }

    public String getOwnBusinessText(){
        return getContentDesc(OWN_BUSINESS);
    }

    public void clickOwnBusiness(){
        click(OWN_BUSINESS, "Own Business card");
    }

    public String getAdditionalIncomeText() {
        return getContentDesc(ADDITIONAL_INCOME);
    }

    public void clickAdditionalIncome(){
        click(ADDITIONAL_INCOME, "Additional income card");
    }

    public boolean checkIfContinueButtonIsEnabled(){
        return isEnabled(CONTINUE, "Continue Button");
    }

    public void clickContinue(){
        click(CONTINUE, "Continue Button");
    }

    //Text to validate
    // Total monthly salary Salary certificate, Bank statement
    // OWN BUSINESS Total monthly income Trade licence, Bank statement
    // ADDITIONAL INCOME Total monthly income Pension certificate/Rental agreement, Bank statement
}
