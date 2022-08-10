package com.nhl.pages.idandv;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static com.nhl.utils.SeleniumUtils.click;

/**
 * Capture customer's current biometrics permission request screen
 *
 * @author avinash
 * @since 6/7/2022
 */
public class BiometricsPage {

    private static final By LATER = By.xpath("//*[@content-desc='Later']");

    public BiometricsPage(){
    }

    public void clickLater(){
        click(LATER, "Later link clicked");
    }


    /**
     * Step : User not allow and biometrics permission section skipping for later
     *
     * @author shiwantha
     * @update 6/7/2022
     */
    public DashboardPage step_biometricsPermissionLater(){
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        click(LATER, "Later link");
        return new DashboardPage();
    }
}
