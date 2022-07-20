package com.nhl.pages.accountcreation.sourceofincome;

import com.nhl.pages.accountcreation.referencedetails.ReferenceDetailsPage;
import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.nhl.utils.SeleniumUtils.*;

public class IncomeDetailsPage {

    //Back Button
    private static final By BACK = By.xpath("//android.view.View[@content-desc='Source of income']/preceding-sibling::android.widget.ImageView");

    //Title, Screen title and Subtitle
    private static final By SCREEN_NAME = By.xpath("//android.view.View[@content-desc='Source of income']");
    private static final By PAGE_TITLE = By.xpath("//android.view.View[@content-desc='Income details']");
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
        return getContentDesc(PAGE_TITLE);
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

    //Text to validate
    // Total monthly salary Salary certificate, Bank statement
    // OWN BUSINESS Total monthly income Trade licence, Bank statement
    // ADDITIONAL INCOME Total monthly income Pension certificate/Rental agreement, Bank statement

    /**
     * Step : User check and validate already loaded income-source page
     *
     * @author shiwantha
     * @update 20/7/2022
     */
    public IncomeDetailsPage check_and_validate_incomeSourceTitle() {
        Assert.assertEquals(SeleniumUtils.getContentDesc(PAGE_TITLE),"Income details","Oops.. Income source page does not load !");
        return this;
    }

    /**
     * Step :  User going to provide fixed salary details by choosing 'Total Monthly Salary' option
     *
     * @author shiwnatha
     * @update 20/7/2022
     * @return SalaryDetailsPage
     */
    public SalaryDetailsPage step_navigateToMonthlySalaryIncome(){
        SeleniumUtils.click(SALARY_DETAILS,"Salary Monthly Income");
        return new SalaryDetailsPage();
    }

    /**
     * Step :  User going to provide business income details by choosing 'Own Business' option
     *
     * @author shiwnatha
     * @update 20/7/2022
     * @return OwnBusinessPage
     */
    public OwnBusinessPage step_navigateToOwnBusinessIncome(){
        SeleniumUtils.click(OWN_BUSINESS,"Own Business Income");
        return new OwnBusinessPage();
    }

    /**
     * Step :  User going to provide additional income details by choosing 'Total Monthly Salary' option
     *
     * @author shiwnatha
     * @update 20/7/2022
     * @return AdditionalIncomePage
     */
    public AdditionalIncomePage step_navigateToAdditionalIncome(){
        SeleniumUtils.click(ADDITIONAL_INCOME,"Additional Income");
        return new AdditionalIncomePage();
    }

    /**
     * Step :  User completed income-source details submission and continue
     *
     * @author shiwnatha
     * @update 20/7/2022
     * @return AdditionalIncomePage
     */
    public ReferenceDetailsPage step_clickContinue(){
        click(CONTINUE, "Continue Button");
        return new ReferenceDetailsPage();
    }
}
