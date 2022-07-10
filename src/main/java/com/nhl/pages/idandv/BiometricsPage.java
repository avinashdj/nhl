package com.nhl.pages.idandv;

import org.openqa.selenium.By;

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
    public WelcomePage step_biometricsPermissionLater(){
        click(LATER, "Later link");
        return new WelcomePage();
    }
}
