package com.nhl.tests;

import com.nhl.annotations.FrameworkAnnotation;
import com.nhl.listeners.TestListener;
import com.nhl.pages.GetStaterPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Scenario : Menu Profile and Settings Of NHL Application
 *
 * @author shiwanthalakmal
 * @update 7/7/2022
 */
@Listeners(TestListener.class)
public class MenuProfileTest extends BaseTest {

    @FrameworkAnnotation
    @Test(description = "User reach upto menu section and verify menu-panel loading and back to welcome page")
    public void letsGetStartedTest() {
        new GetStaterPage().step_getStarted().step_registeredMobileNumber("569760182").
                step_registrationSubmit().step_setContinueWithOTP("").
                step_SkipWithoutEmail().step_setPin("1234").step_moveNext().step_setConfirmPin("1234").
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().
                switchTOMenu().check_and_validate_menuTitle().step_navigateBack();
    }

    @FrameworkAnnotation
    @Test(description = "User make application sign-out though the menu profile access")
    public void test_user_able_to_logout_through_the_menu_profile() {
        new GetStaterPage().step_getStarted().step_registeredMobileNumber("569760182").
                step_registrationSubmit().step_setContinueWithOTP("").
                step_SkipWithoutEmail().step_setPin("1234").step_moveNext().step_setConfirmPin("1234").
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().
                switchTOMenu().check_and_validate_menuTitle().step_logoutNHL();
    }

    @FrameworkAnnotation
    @Test(description = "User getting awareness about application build version and nhl info")
    public void test_user_able_to_see_about_nhl_though_the_menu_profile() {
        new GetStaterPage().step_getStarted().step_registeredMobileNumber("569760182").
                step_registrationSubmit().step_setContinueWithOTP("").
                step_SkipWithoutEmail().step_setPin("1234").step_moveNext().step_setConfirmPin("1234").
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().
                switchTOMenu().check_and_validate_menuTitle().step_aboutClickAndNavigate(); //TODO (Next Page Content Validation)
    }

    @FrameworkAnnotation
    @Test(description = "User refer frequently asked questions though the menu profile access")
    public void test_user_able_to_see_faq_answers_though_the_menu_profile() {
        new GetStaterPage().step_getStarted().step_registeredMobileNumber("569760182").
                step_registrationSubmit().step_setContinueWithOTP("").
                step_SkipWithoutEmail().step_setPin("1234").step_moveNext().step_setConfirmPin("1234").
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().
                switchTOMenu().check_and_validate_menuTitle().step_faqsClickAndNavigate(); //TODO (Next Page Content Validation)
    }

    @FrameworkAnnotation
    @Test(description = "User able to see available branch locations though the menu profile access")
    public void test_user_able_to_see_branch_locations_though_the_menu_profile() {
        new GetStaterPage().step_getStarted().step_registeredMobileNumber("569760182").
                step_registrationSubmit().step_setContinueWithOTP("").
                step_SkipWithoutEmail().step_setPin("1234").step_moveNext().step_setConfirmPin("1234").
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().
                switchTOMenu().check_and_validate_menuTitle().step_nhlBranchClickAndNavigate(); //TODO (Next Page Content Validation)
    }

    @FrameworkAnnotation
    @Test(description = "User refer eligible islamic products packages though the menu profile access")
    public void test_user_able_to_see_islamic_products_though_the_menu_profile() {
        new GetStaterPage().step_getStarted().step_registeredMobileNumber("569760182").
                step_registrationSubmit().step_setContinueWithOTP("").
                step_SkipWithoutEmail().step_setPin("1234").step_moveNext().step_setConfirmPin("1234").
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().
                switchTOMenu().check_and_validate_menuTitle().step_islamicProductClickAndNavigate(); //TODO (Next Page Content Validation)
    }

    @FrameworkAnnotation
    @Test(description = "User access own profile after user registration though the menu profile access")
    public void test_user_able_to_access_own_profile_though_the_menu_profile() {
        new GetStaterPage().step_getStarted().step_registeredMobileNumber("569760182").
                step_registrationSubmit().step_setContinueWithOTP("").
                step_SkipWithoutEmail().step_setPin("1234").step_moveNext().step_setConfirmPin("1234").
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().
                switchTOMenu().check_and_validate_menuTitle().step_identityVerifyClickAndNavigate(); //TODO (Next Page Content Validation)
    }

    //====================================== MENU 1st VIEW COVERAGE DONE ==============================================
}
