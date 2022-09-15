package com.nhl.pages.verifyidentityphase;

import com.nhl.driver.DriverManager;
import com.nhl.pages.idandv.SetPinPage;
import com.nhl.pages.idandv.StayUpdatedPage;
import com.nhl.utils.SeleniumUtils;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;

import java.time.Duration;

/**
 * Capture ADHA application screen related elements and behaviours
 *
 * @author shiwanthalakmal
 * @since 7/8/2022
 */
public class ADHAApplicationPage {

    //android.view.View[@content-desc="APPLICANTS DETAILS"]

    //android.view.View[@content-desc="SIGNATURE"]
    public ADHAApplicationPage() {
    }

    private static final By PAGE_TITLE = By.xpath("//android.view.View[@content-desc='ADHA application']");
    private static final By APP_NO = By.xpath("//android.view.View[@content-desc='APPLICATION DETAILS']/following-sibling::android.view.View[1]");
    private static final By APP_TYPE = By.xpath("//android.view.View[@content-desc='APPLICATION DETAILS']/following-sibling::android.view.View[2]");
    private static final By APPROVED_AMOUNT = By.xpath("//android.view.View[@content-desc='APPLICATION DETAILS']/following-sibling::android.view.View[3]");
    private static final By SERVICE_TYPE = By.xpath("//android.view.View[@content-desc='APPLICATION DETAILS']/following-sibling::android.view.View[4]");
    private static final By MOBILE_NO = By.xpath("//android.view.View[@content-desc='APPLICATION DETAILS']/following-sibling::android.view.View[5]");
    private static final By ADDRESS_INFO = By.xpath("//android.view.View[@content-desc='APPLICATION DETAILS']/following-sibling::android.view.View[6]");
    private static final By CITY_INFO = By.xpath("//android.view.View[@content-desc='APPLICATION DETAILS']/following-sibling::android.view.View[7]");
    private static final By ZONE_INFO = By.xpath("//android.view.View[@content-desc='APPLICATION DETAILS']/following-sibling::android.view.View[7]/following-sibling::android.view.View[1]");
    private static final By PLOT_NO = By.xpath("//android.view.View[@content-desc='APPLICATION DETAILS']/following-sibling::android.view.View[9]");

    private static final By APPLICANT_NAME = By.xpath("//*[contains(text(),'Applicant name')]");
    private static final By APPLICANT_SIGNATURE = By.xpath("//android.view.View[@content-desc='SIGNATURE']/following-sibling::android.widget.ImageView");
    private static final By APPROVED_CONFIRMED = By.className("android.widget.CheckBox");
    private static final By CONTINUE = By.className("android.widget.Button");

    /**
     * Step : User check and validate already loaded adha-application page
     *
     * @author shiwantha
     * @update 7/8/2022
     */
    public ADHAApplicationPage check_and_validate_personalInfoTitle() {
        Assert.assertEquals(SeleniumUtils.getContentDesc(PAGE_TITLE),"ADHA application","Oops.. Application info page does not load !");
        return this;
    }

    /**
     * Step : User check and validate application number info
     *
     * @author shiwantha
     * @update 7/8/2022
     */
    public ADHAApplicationPage check_and_validate_applicationNo(String no) {
//        Assert.assertTrue(SeleniumUtils.getContentDesc(APP_NO).contains(no),"Oops.. Application no info does not load !");
        return this;
    }

    /**
     * Step : User check and validate application type info
     *
     * @author shiwantha
     * @update 7/8/2022
     */
    public ADHAApplicationPage check_and_validate_applicationType(String type) {
        Assert.assertTrue(SeleniumUtils.getContentDesc(APP_TYPE).contains(type), "Oops.. Application type info does not load !");
        return this;
    }

    /**
     * Step : User check and validate granted amount info
     *
     * @author shiwantha
     * @update 7/8/2022
     */
    public ADHAApplicationPage check_and_validate_grantedAmount(String amount) {
        Assert.assertTrue(SeleniumUtils.getContentDesc(APPROVED_AMOUNT).contains(amount), "Oops.. Granted amount info does not load !");
        return this;
    }

    /**
     * Step : User check and validate service type info
     *
     * @author shiwantha
     * @update 7/8/2022
     */
    public ADHAApplicationPage check_and_validate_serviceType(String service) {
        Assert.assertTrue(SeleniumUtils.getContentDesc(SERVICE_TYPE).contains(service), "Oops.. Service type info does not load !");
        return this;
    }

    /**
     * Step : User check and validate mobile number info
     *
     * @author shiwantha
     * @update 7/8/2022
     */
    public ADHAApplicationPage check_and_validate_mobileNumber(String mobile) {
        Assert.assertTrue(SeleniumUtils.getContentDesc(MOBILE_NO).contains(mobile), "Oops.. Mobile number info does not load !");
        return this;
    }

    /**
     * Step : User check and validate mobile number info
     *
     * @author shiwantha
     * @update 7/8/2022
     */
    public ADHAApplicationPage check_and_validate_addressInfo(String address, String city, String zip, String plot) {
        Assert.assertTrue(SeleniumUtils.getContentDesc(ADDRESS_INFO).contains(address), "Oops.. Address info does not load !");
        Assert.assertTrue(SeleniumUtils.getContentDesc(CITY_INFO).contains(city), "Oops.. City info does not load !");
        //TODO Scroll required
        Dimension dimension = DriverManager.getDriver().manage().window().getSize();
        int start_x = (int) (dimension.width * 0.5);
        int start_y = (int) (dimension.height * 0.8);

        int end_x = (int) (dimension.width * 0.5);
        int end_y = (int) (dimension.height * 0.2);

        TouchAction touch = new TouchAction((PerformsTouchActions) DriverManager.getDriver());
        touch.press(PointOption.point(start_x,start_y)).
                waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).
                moveTo(PointOption.point(end_x,end_y)).release().perform();
        //TODO Element Issue fixes required
        //Assert.assertTrue(SeleniumUtils.getContentDesc(ZONE_INFO).contains(zip), "Oops.. Zip no info does not load !");
        //Assert.assertTrue(SeleniumUtils.getContentDesc(PLOT_NO).contains(plot), "Oops.. Plot no info does not load !");
        return this;
    }

    /**
     * Step : User check and validate granted amount info
     *
     * @author shiwantha
     * @update 7/8/2022
     */
    public ADHAApplicationPage check_and_validate_signaturePics() {
        Assert.assertTrue(SeleniumUtils.isDisplayed(APPLICANT_SIGNATURE,"SIGNATURE"), "Oops.. Signature picture not visible !");
        return this;
    }

    /**
     * Step : User confirmed ADHA application captured details
     *
     * @author shiwantha
     * @update 8/8/2022
     */
    public KeyFactsStatementPage step_confirmedADHAApplication() {
        //TODO build logic when its enable / disable checkbox
        SeleniumUtils.click(CONTINUE,"CONTINUE");
        return new KeyFactsStatementPage();
    }


}
