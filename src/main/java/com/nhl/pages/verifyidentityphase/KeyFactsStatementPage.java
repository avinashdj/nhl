package com.nhl.pages.verifyidentityphase;

import com.google.common.util.concurrent.Uninterruptibles;
import com.nhl.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/**
 * Capture ke-facts statements screen related elements and behaviours
 *
 * @author shiwanthalakmal
 * @since 8/8/2022
 */
public class KeyFactsStatementPage {

    public KeyFactsStatementPage() {
    }

    private static final By PAGE_TITLE = By.xpath("//android.view.View[@content-desc='Key facts statement']");
    private static final By APPROVED_CONFIRMED = By.className("android.widget.CheckBox");
    private static final By CONTINUE = By.className("android.widget.Button");

    /**
     * Step : User check and validate already loaded adha-application page
     *
     * @author shiwantha
     * @update 7/8/2022
     */
    public KeyFactsStatementPage check_and_validate_personalInfoTitle() {
        Assert.assertEquals(SeleniumUtils.getContentDesc(PAGE_TITLE),"ADHA application","Oops.. Application info page does not load !");
        return this;
    }

    /**
     * Step : User confirmed key-fact statement captured details
     *
     * @author shiwantha
     * @update 8/8/2022
     */
    public CongratsPageVerifyIdentity step_confirmedKeyStatement() {
        SeleniumUtils.click(APPROVED_CONFIRMED,"APPROVED");
        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
        SeleniumUtils.click(CONTINUE,"CONTINUE");
        Uninterruptibles.sleepUninterruptibly(10, TimeUnit.SECONDS);
        return new CongratsPageVerifyIdentity();
    }


}
