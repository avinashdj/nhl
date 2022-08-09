package com.nhl.pages.accountcreation.additionaldetails;

import com.nhl.driver.DriverManager;
import com.nhl.pages.accountcreation.mrn.MRNPage;
import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.nhl.utils.SeleniumUtils.click;

public class CoolingOffPeriodPage {

    private static final By BACK = By.xpath("//android.widget.Button[@content-desc='Back']");
    private static final By PAGE_TITLE = By.xpath("(//android.view.View[@content-desc='Terms and Conditions'])[2]");
    private static final By CONTINUE = By.xpath("//android.widget.Button[@content-desc='Continue']");

    public CoolingOffPeriodPage() {
    }


    /**
     * Step : User check and validate already loaded CPR terms and condition page
     *
     * @author shiwantha
     * @update 20/7/2022
     * @return CPRConditionsPage
     */
    public CoolingOffPeriodPage check_and_validate_CustomerDeclarationTitle() {
        //TODO need to fix assertion
        Assert.assertEquals(SeleniumUtils.getContentDesc(PAGE_TITLE),"Terms and Conditions","Oops.. Terms page does not load !");
        return this;
    }

    /**
     * Step : User tik CPR Terms confirmation check-box and continue
     *
     * @author shiwantha
     * @update 20/7/2022
     * @return TermsConditionsPage
     */
    public CoolingOffPeriodPage step_acceptOffPeriodCondition(){
        List<WebElement> selectionList = DriverManager.getDriver().findElements(By.className("android.widget.CheckBox"));
        selectionList.get(0).click();
        selectionList.get(1).click();
        return this;
    }

    /**
     * Step : User confirmed CPR terms and continue
     *
     * @author shiwantha
     * @update 19/7/2022
     * @return MRNPage
     */
    public MRNPage step_clickContinue(){
        click(CONTINUE, "Continue");
        return new MRNPage();
    }
}
