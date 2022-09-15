package com.nhl.pages.accountactivation;

import com.nhl.driver.DriverManager;
import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoanAgreementPage {

    public LoanAgreementPage(){
    }

    //Back Arrow
    private static final By BACK = By.xpath("//android.widget.Button[1]");

    private static final By PAGE_TITLE = By.xpath("(//android.view.View[@content-desc='Loan agreement'])[2]");

    private static final By CONTINUE = By.xpath("//android.widget.Button[@content-desc='Continue']");


    /**
     * Step : User xxxx
     *
     * @author shiwantha
     * @update 10/8/2022
     */
    public LoanAgreementPage check_and_validate_mortgageContractTitle() {
        Assert.assertEquals(SeleniumUtils.getContentDesc(PAGE_TITLE),"Loan agreement","Oops.. Loan agreement page does not load !");
        return this;
    }

    /**
     * Step : User tik loan agreement confirmation check-box and continue
     *
     * @author shiwantha
     * @update 20/7/2022
     * @return MortgageContractPage
     */
    public LoanAgreementPage step_acceptLoanAgreement(){
        DriverManager.getDriver().findElement(By.className("android.widget.CheckBox")).click();
        return this;
    }

    /**
     * Step : User xxxx
     *
     * @author shiwantha
     * @update 10/8/2022
     */
    public CongratsPageMortgageContract step_clickContinue(){
        SeleniumUtils.click(CONTINUE,"CONTINUE");
        SeleniumUtils.waitFor(2000);
        return new CongratsPageMortgageContract();
    }

}
