package com.nhl.pages.idandv;

import com.nhl.driver.DriverManager;
import com.nhl.pages.accountcreation.YourHomeAddressPage;
import com.nhl.pages.accountcreation.sourceofincome.IncomeDetailsPage;
import com.nhl.pages.menunavigations.MenuMainPage;
import com.nhl.pages.verifyidentityphase.ADHAApplicationPage;
import com.nhl.utils.SeleniumUtils;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.Assert;

import java.time.Duration;

import static com.nhl.utils.SeleniumUtils.click;

public class DashboardPage {

    private static final By LETS_GET_STARTED = By.xpath("//*[@content-desc=\"Let’s get started\"]");
    private static final By WELCOME_TITLE = By.xpath("//android.view.View[@content-desc='Welcome!']");
    private static final By MENU_ICON = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.ImageView[2]");
    public DashboardPage(){
    }

    public void clickLetsGetStartedButton(){
        click(LETS_GET_STARTED, "Lets Get Started Button");
    }

    public void swapRightToLeftMortgage(){
        Dimension size = DriverManager.getDriver().manage().window().getSize();
        int anchor = (int) (size.height * 0.5);
        int startPoint = (int) (size.width * 0.70);
        int endPoint = (int) (size.width * 0.30);
        new TouchAction((PerformsTouchActions) DriverManager.getDriver())
                .press(PointOption.point(startPoint, anchor))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(endPoint, anchor))
                .release().perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Step : User check and validate already loaded menu main page
     *
     * @author shiwantha
     * @update 4/7/2022
     */
    public DashboardPage check_and_validate_welcomeTitle() {
        SeleniumUtils.waitUntilElementPresent(WELCOME_TITLE);
        Assert.assertEquals(SeleniumUtils.getContentDesc(WELCOME_TITLE),"Welcome!","Oops.. Welcome page does not load !");
        return this;
    }

    /**
     * Step : perform top right-corner menu icon
     * @author shiwantha
     * @update 5/7/2022
     * @return
     */
    public MenuMainPage switchTOMenu(){
        SeleniumUtils.click(MENU_ICON,"Menu Icon");
        return new MenuMainPage();
    }

    //====================================== Step 2 of 5 Widget ========================================================

    /**
     * Step : Validate 3 out of 5 widget content availability
     *
     * @author shiwantha
     * @update 19/7/2022
     */
    public DashboardPage check_and_validate_Step2OutOf5Widget(){
        By stepValue = By.xpath("//android.view.View[@content-desc='Step 3 of 5']");
        By widgetTitle = By.xpath("//android.view.View[@content-desc='Open your NHL account']");
        Assert.assertEquals(SeleniumUtils.getContentDesc(stepValue),"Step 3 of 5");
        Assert.assertEquals(SeleniumUtils.getContentDesc(widgetTitle),"Open your NHL account");
        return this;
    }

    /**
     * Step : Validate 1 out of 5 widget continue event perform
     *
     * @author shiwantha
     * @update 19/7/2022
     */
    public YourHomeAddressPage step_StepWidgetContinueForOpenNHLAccount1Out5(){
        By btnContinue = By.xpath("//android.widget.Button[@content-desc=\"Let’s get started\"]");
        click(btnContinue,"Continue");
        return new YourHomeAddressPage();
    }

    /**
     * Step : Validate 1 out of 5 widget continue event perform
     *
     * @author shiwantha
     * @update 19/7/2022
     */
    public YourHomeAddressPage step_StepWidgetContinueForOpenNHLAccount2Out5(){
        By btnContinue = By.xpath("//android.widget.Button[@content-desc='Continue']");
        click(btnContinue,"Continue");
        return new YourHomeAddressPage();
    }

    /**
     * Step : Validate 1 out of 5 widget continue event perform
     *
     * @author shiwantha
     * @update 19/7/2022
     */
    public YourHomeAddressPage step_StepWidgetContinueForOpenNHLAccount3Out5(){
        By btnContinue = By.xpath("//android.widget.Button[@content-desc='Continue']");
        click(btnContinue,"Continue");
        return new YourHomeAddressPage();
    }

    /**
     * Step : Validate 1 out of 5 widget continue event perform
     *
     * @author shiwantha
     * @update 19/7/2022
     */
    public YourHomeAddressPage step_StepWidgetContinueForOpenNHLAccount4Out5(){
        By btnContinue = By.xpath("//android.widget.Button[@content-desc='Continue']");
        SeleniumUtils.waitUntilElementToBeClickable(btnContinue).click();
        return new YourHomeAddressPage();
    }

    /**
     * Step : Validate 1 out of 5 widget continue event perform
     *
     * @author shiwantha
     * @update 19/7/2022
     */
    public YourHomeAddressPage step_StepWidgetContinueForOpenNHLAccount5Out5(){
        By btnContinue = By.xpath("//android.widget.Button[@content-desc='Continue']");
        click(btnContinue,"Continue");
        return new YourHomeAddressPage();
    }

    /**
     * Step : Validate 1 out of 3 widget continue event perform
     *
     * @author shiwantha
     * @update 19/7/2022
     */
    public ADHAApplicationPage step_StepWidgetContinueForVerifyIdentity(){
        By btnContinue = By.xpath("//android.widget.Button[@content-desc='Continue']");
        click(btnContinue,"Continue");
        return new ADHAApplicationPage();
    }
}

