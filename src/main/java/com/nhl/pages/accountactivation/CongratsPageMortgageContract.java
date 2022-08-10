package com.nhl.pages.accountactivation;

import com.nhl.pages.idandv.DashboardPage;
import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.nhl.utils.SeleniumUtils.click;
import static com.nhl.utils.SeleniumUtils.getContentDesc;

public class CongratsPageMortgageContract {

    private static final By DONE = By.xpath("//android.widget.Button[@content-desc='Done']");
    private static final By BACK = By.xpath("//android.view.View[@content-desc='You\'ve opened your FAB NHL Account!']");
    private static final By MORTGAGE_COMMENT = By.xpath("//android.view.View[@content-desc='Congratulations! Your NHL loan journey is complete.']");
    private static String LIST_PARENT = "//android.view.View[@content-desc='To activate your account, please visit a FAB NHL branch with these documents.']/following-sibling::android.view.View[%s]";

    public CongratsPageMortgageContract(){
    }

    /**
     * Step : User xxxx
     *
     * @author shiwantha
     * @update 10/8/2022
     */
    public CongratsPageMortgageContract check_and_validate_mortgageContractSuccessMsg() {
        Assert.assertEquals(SeleniumUtils.getContentDesc(MORTGAGE_COMMENT),"Congratulations! Your NHL loan journey is complete.","Oops.. Success Message page does not load !");
        return this;
    }


    public DashboardPage step_clickDone(){
        click(DONE, "DONE");
        return new DashboardPage();
    }
}
