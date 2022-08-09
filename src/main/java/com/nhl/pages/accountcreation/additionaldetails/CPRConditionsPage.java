package com.nhl.pages.accountcreation.additionaldetails;

import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.nhl.utils.SeleniumUtils.click;

public class CPRConditionsPage {

    private static final By BACK = By.xpath("//android.widget.Button[@content-desc='Back']");
    private static final By PAGE_TITLE = By.xpath("(//android.view.View[@content-desc='Terms and Conditions'])[2]");
    private static final By CONTINUE = By.xpath("//android.widget.Button[@content-desc='Continue']");

    public CPRConditionsPage() {
    }


    /**
     * Step : User check and validate already loaded CPR terms and condition page
     *
     * @author shiwantha
     * @update 20/7/2022
     * @return CPRConditionsPage
     */
    public CPRConditionsPage check_and_validate_CPRTermsTitle() {
        Assert.assertEquals(SeleniumUtils.getContentDesc(PAGE_TITLE),"Terms and Conditions","Oops.. Terms page does not load !");
        return this;
    }

    /**
     * Step : User tik all CPR mandatory terms
     *
     * @author shiwantha
     * @update 20/7/2022
     * @return CPRConditionsPage
     */
    public CPRConditionsPage step_selectAllMandatoryTerms(){
        SeleniumUtils.waitFor(1000);
        SeleniumUtils.click(By.className("android.widget.CheckBox"),"Terms Condition");
        return this;
    }

    /**
     * Step : User read and understand CPR terms & condition and continue
     *
     * @author shiwantha
     * @update 19/7/2022
     * @return TermsConditionsPage
     */
    public CustomerDeclarationPage step_clickContinue(){
        click(CONTINUE, "Continue");
        return new CustomerDeclarationPage();
    }
}