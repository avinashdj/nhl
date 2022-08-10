package com.nhl.pages.accountactivation;

import com.nhl.driver.DriverManager;
import com.nhl.pages.accountcreation.additionaldetails.CoolingOffPeriodPage;
import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class StandingInstructionPage {

    public StandingInstructionPage(){
    }

    //Back Arrow
    private static final By BACK = By.xpath("//android.widget.Button[1]");

    private static final By PAGE_TITLE = By.xpath("(//android.view.View[@content-desc='Standing Instruction Order authorisation'])[2]");

    private static final By CONTINUE = By.xpath("//android.widget.Button[@content-desc='Continue']");


    /**
     * Step : User xxxx
     *
     * @author shiwantha
     * @update 10/8/2022
     */
    public StandingInstructionPage check_and_validate_sioTitle() {
        Assert.assertEquals(SeleniumUtils.getContentDesc(PAGE_TITLE),"Standing Instruction Order authorisation","Oops.. Standard Instruction page does not load !");
        return this;
    }

    /**
     * Step : User tik instruction order confirmation check-box and continue
     *
     * @author shiwantha
     * @update 20/7/2022
     * @return TermsConditionsPage
     */
    public StandingInstructionPage step_acceptInstructionOrderCondition(){
        DriverManager.getDriver().findElement(By.className("android.widget.CheckBox")).click();
        return this;
    }

    /**
     * Step : User xxxx
     *
     * @author shiwantha
     * @update 10/8/2022
     */
    public MortgageContractPage step_clickContinue(){
        SeleniumUtils.click(CONTINUE,"CONTINUE");
        SeleniumUtils.waitFor(2000);
        return new MortgageContractPage();
    }

}
