package com.nhl.tests;

import com.nhl.annotations.FrameworkAnnotation;
import com.nhl.listeners.TestListener;
import com.nhl.pages.accountcreation.additionaldetails.PEPPage;
import com.nhl.pages.accountcreation.mrn.MRNPage;
import com.nhl.pages.accountcreation.referencedetails.ReferenceDetailsPage;
import com.nhl.pages.accountcreation.sourceofincome.IncomeDetailsPage;
import com.nhl.pages.idandv.GetStaterPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class CPRTermsTest extends BaseTest {

    @FrameworkAnnotation
    @Test(description = "User make accept mandatory consumer protection right terms and conditions")
    public void test_user_able_to_make_confirm_consumer_protection_right_terms_conditions() {
        new GetStaterPage().step_getStarted().step_registeredMobileNumber("569760182").
                step_registrationSubmit().step_setContinueWithOTP("").
                step_SkipWithoutEmail().step_setPin("1234").step_nextToConfirm().step_setConfirmPin("1234").
                step_makeConfirmed().step_locationPermissionLater().step_biometricsPermissionLater().step_StepWidgetContinueForVerifyIdentity();


        // 2 Out of 5 Phase - Open NHL Account Widget
        // Preconditions : OCR + NFR + Face 3D work-flows should complete via APIs
        new IncomeDetailsPage().check_and_validate_incomeSourceTitle().step_navigateToMonthlySalaryIncome().step_enterTotalMonthlySalary("15000").
                step_uploadSalaryCertificate().step_uploadBankStatement().step_clickAdd().step_clickContinue();

        // 3 Out of 5 Phase - Open NHL Account Widget
        // Preconditions : OCR + NFR + Face 3D work-flows should complete via APIs + Income Source completion required
        new ReferenceDetailsPage().step_enterFirstReferenceFullName("Jonny Rome").step_enterFirstReferenceRelationship("Wife").
                step_enterFirstReferenceMobileNumber("569760183").step_enterFirstReferenceAltContactNumber("569760184").
                step_enterSecondReferenceFullName("Joson Jo").step_enterSecondReferenceRelationship("Brother").
                step_enterSecondReferenceMobileNumber("569760185").step_enterSecondReferenceAltContactNumber("569760186").step_clickContinue();

        // 4 Out of 5 Phase - Open NHL Account Widget
        // Preconditions : OCR + NFR + Face 3D work-flows should complete via APIs + Income Source + Reference Details completion required
        new PEPPage().setPoliticallyExposed(false).step_clickContinue().check_and_validate_CPRTermsTitle().
                step_selectAllMandatoryTerms().step_clickContinue().step_acceptDeclarationCondition().step_acceptDeclarationCondition().step_clickContinue();

        // 5 Out of 5 Phase - Open NHL Account Widget
        // Preconditions : OCR + NFR + Face 3D work-flows should complete via APIs + Income Source + Reference + CPR Terms Details completion required
        new MRNPage().step_enterRegistrationNumber("1111111111111").step_enterConfirmRegistrationNumber("1111111111111").
                step_clickDone().step_clickDone();
    }
}
