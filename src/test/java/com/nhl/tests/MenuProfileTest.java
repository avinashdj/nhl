package com.nhl.tests;

import com.nhl.annotations.FrameworkAnnotation;
import com.nhl.listeners.TestListener;
import com.nhl.pages.accountcreation.additionaldetails.CPRConditionsPage;
import com.nhl.pages.accountcreation.additionaldetails.PEPPage;
import com.nhl.pages.accountcreation.mrn.MRNPage;
import com.nhl.pages.accountcreation.referencedetails.ReferenceDetailsPage;
import com.nhl.pages.accountcreation.sourceofincome.IncomeDetailsPage;
import com.nhl.pages.idandv.GetStaterPage;
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
                step_SkipWithoutEmail().step_setPin("1234").step_nextToConfirm().step_setConfirmPin("1234").
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().
                switchTOMenu().check_and_validate_menuTitle().step_navigateBack().check_and_validate_menuTitle();
    }

    @FrameworkAnnotation
    @Test(description = "User make application sign-out though the menu profile access")
    public void test_user_able_to_logout_through_the_menu_profile() {
        new GetStaterPage().step_getStarted().step_registeredMobileNumber("569760182").
                step_registrationSubmit().step_setContinueWithOTP("").
                step_SkipWithoutEmail().step_setPin("1234").step_nextToConfirm().step_setConfirmPin("1234").
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().
                switchTOMenu().check_and_validate_menuTitle().step_logoutNHL().check_and_validate_pageTitle();
    }

    @FrameworkAnnotation
    @Test(description = "User getting awareness about application build version and nhl info")
    public void test_user_able_to_see_about_nhl_though_the_menu_profile() {
        new GetStaterPage().step_getStarted().step_registeredMobileNumber("569760182").
                step_registrationSubmit().step_setContinueWithOTP("").
                step_SkipWithoutEmail().step_setPin("1234").step_nextToConfirm().step_setConfirmPin("1234").
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().
                switchTOMenu().check_and_validate_menuTitle().
                step_aboutClickAndNavigate().check_and_validate_aboutNHLTitle();
    }

    @FrameworkAnnotation
    @Test(description = "User refer frequently asked questions though the menu profile access")
    public void test_user_able_to_see_faq_answers_though_the_menu_profile() {
        new GetStaterPage().step_getStarted().step_registeredMobileNumber("569760182").
                step_registrationSubmit().step_setContinueWithOTP("").
                step_SkipWithoutEmail().step_setPin("1234").step_nextToConfirm().step_setConfirmPin("1234").
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().
                switchTOMenu().check_and_validate_menuTitle().
                step_faqsClickAndNavigate().check_and_validate_faqsNHLTitle();
    }

    @FrameworkAnnotation
    @Test(description = "User able to see available branch locations though the menu profile access")
    public void test_user_able_to_see_branch_locations_though_the_menu_profile() {
        new GetStaterPage().step_getStarted().step_registeredMobileNumber("569760182").
                step_registrationSubmit().step_setContinueWithOTP("").
                step_SkipWithoutEmail().step_setPin("1234").step_nextToConfirm().step_setConfirmPin("1234").
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().
                switchTOMenu().check_and_validate_menuTitle().
                step_nhlBranchClickAndNavigate(); //TODO (Next Page Content Validation)
    }

    @FrameworkAnnotation
    @Test(description = "User refer eligible islamic products packages though the menu profile access")
    public void test_user_able_to_see_islamic_products_though_the_menu_profile() {
        new GetStaterPage().step_getStarted().step_registeredMobileNumber("569760182").
                step_registrationSubmit().step_setContinueWithOTP("").
                step_SkipWithoutEmail().step_setPin("1234").step_nextToConfirm().step_setConfirmPin("1234").
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().
                switchTOMenu().check_and_validate_menuTitle().
                step_islamicProductClickAndNavigate().check_and_validate_branchNHLTitle();
    }

    @FrameworkAnnotation
    @Test(description = "User access own profile after user registration though the menu profile access")
    public void test_user_able_to_access_own_profile_though_the_menu_profile() {
        new GetStaterPage().step_getStarted().step_registeredMobileNumber("569760182").
                step_registrationSubmit().step_setContinueWithOTP("").
                step_SkipWithoutEmail().step_setPin("1234").step_nextToConfirm().step_setConfirmPin("1234").
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().
                switchTOMenu().check_and_validate_menuTitle().
                step_identityVerifyClickAndNavigate().check_and_validate_personalInfoTitle();


    }

    //====================================== MENU 1st LEVEL VIEW COVERAGE DONE =========================================

    @FrameworkAnnotation
    @Test(description = "User able to make-sure registered data are correct though menu profile section")
    public void test_user_able_to_validate_personal_details_section_in_profile() {
        new GetStaterPage().step_getStarted().step_registeredMobileNumber("569760182").
                step_registrationSubmit().step_setContinueWithOTP("").
                step_SkipWithoutEmail().step_setPin("1234").step_nextToConfirm().step_setConfirmPin("1234").
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().
                switchTOMenu().check_and_validate_menuTitle().
                step_identityVerifyClickAndNavigate().check_and_validate_personalInfoTitle().
                check_and_validate_customerName("Shiwantha Lakmal").
                check_and_validate_customerEmail("Stay updated about your application").check_and_validate_customerMobile("+971 56 976 0182");
    }

    @FrameworkAnnotation
    @Test(description = "User able to change registered email-address though menu profile section")
    public void test_user_able_to_registered_email_though_in_profile() {
        new GetStaterPage().step_getStarted().step_registeredMobileNumber("569760182").
                step_registrationSubmit().step_setContinueWithOTP("").
                step_SkipWithoutEmail().step_setPin("1234").step_nextToConfirm().step_setConfirmPin("1234").
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().
                switchTOMenu().check_and_validate_menuTitle().
                step_identityVerifyClickAndNavigate().check_and_validate_personalInfoTitle().
                step_addEmail().step_ContinueWithEmail("O27029@bankfaf.com");
    }

    @FrameworkAnnotation
    @Test(description = "User able to change login pin-code though menu profile security section")
    public void test_user_able_to_change_login_pin_though_in_profile() {
        new GetStaterPage().step_getStarted().step_registeredMobileNumber("569760182").
                step_registrationSubmit().step_setContinueWithOTP("").
                step_SkipWithoutEmail().step_setPin("1234").step_nextToConfirm().step_setConfirmPin("1234").
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().
                switchTOMenu().check_and_validate_menuTitle().
                step_identityVerifyClickAndNavigate().check_and_validate_personalInfoTitle().
                step_switchToChangeLoginPin().step_setCurrentPin("1234").step_setPin("4321").
                step_nextToConfirm().step_setConfirmPin("4321").step_makeConfirmed();
    }


}