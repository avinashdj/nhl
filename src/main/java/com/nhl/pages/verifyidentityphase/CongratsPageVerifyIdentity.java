package com.nhl.pages.verifyidentityphase;

import com.google.common.util.concurrent.Uninterruptibles;
import com.nhl.pages.accountcreation.YourHomeAddressPage;
import com.nhl.pages.idandv.DashboardPage;
import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static com.nhl.utils.SeleniumUtils.click;

public class CongratsPageVerifyIdentity {

    public CongratsPageVerifyIdentity() {
    }

    private static final By PAGE_TITLE = By.xpath("//android.view.View[@content-desc='ADHA application']");
    private static final By DONE = By.className("android.widget.Button");
    private static final By FAB_REGISTER_MSG = By.xpath("//android.view.View[@content-desc='Congratulations! You're registered to the FAB NHL app.']");

    /**
     * Step : User check and validate already loaded adha-application registration completion page
     *
     * @author shiwantha
     * @update 7/8/2022
     */
    public CongratsPageVerifyIdentity check_and_validate_CongratsPageTitle() {
        Assert.assertEquals(SeleniumUtils.getContentDesc(PAGE_TITLE),"ADHA application","Oops.. ADHA congrats page does not load !");
        return this;
    }
//android.view.View[@content-desc="Congratulations! You're registered to the FAB NHL app."]
//Congratulations! You're registered to the FAB NHL app.
    /**
     * Step : User complete registration flow
     *
     * @author shiwantha
     * @update 8/8/2022
     */
    public YourHomeAddressPage step_clickDone(){
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        SeleniumUtils.waitUntilElementToBeClickable(DONE).click();
        //click(DONE, "Let's Go");

        return new YourHomeAddressPage();
    }
}
