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


    private static final By SCREEN_NAME = By.xpath("//android.view.View[@content-desc='Source of income']");
    private static final By TITLE= By.xpath("//android.view.View[@content-desc='Income details']");
    private static final By DESCRIPTION = By.xpath("//android.view.View[contains(@content-desc, 'source of income')]");

    private static final By CONTINUE = By.xpath("//*[@content-desc='Continue']");

    private static final By SALARY_DETAILS = By.xpath("//android.view.View[contains(@content-desc,'SALARY DETAILS')]");
    private static final By OWN_BUSINESS = By.xpath("//android.view.View[contains(@content-desc,'OWN BUSINESS')]");
    private static final By ADDITIONAL_INCOME = By.xpath("//android.view.View[contains(@content-desc,'ADDITIONAL INCOME')]");

    public IncomeDetailsPage(){
    }

    public String getScreenName(){
        return getContentDesc(SCREEN_NAME);
    }

    public String getTitle(){
        return getContentDesc(TITLE);
    }

    public String getAddtionalIncomeText(){
        return getContentDesc(ADDITIONAL_INCOME);
    }

    public void clickContinue(){
        click(CONTINUE, "Continue Button");
    }

    public void clickSalaryDetails(){
        click(SALARY_DETAILS, "Salary Details card");
    }

    public void clickOwnBusiness(){
        click(OWN_BUSINESS, "Own Business card");
    }

    public void clickAdditionalIncome(){
        click(ADDITIONAL_INCOME, "Additional income card");
    }

    public String getSalaryDetailsText(){
        return getContentDesc(SALARY_DETAILS);
    }

    public String getOwnBusinessText(){
        return getContentDesc(TITLE);
    }

    public String getDescription(){
        return getContentDesc(DESCRIPTION);
    }

    public boolean checkIfContinueButtonIsEnabled(){
        return isEnabled(CONTINUE, "Continue Button");
    }

    public void clickBackButton(){
        click(BACK, "BACK Button");
    }

    //Text to validate
    // Total monthly salary Salary certificate, Bank statement
    // OWN BUSINESS Total monthly income Trade licence, Bank statement
    // ADDITIONAL INCOME Total monthly income Pension certificate/Rental agreement, Bank statement
}
