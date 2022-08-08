Feature: Mortgage Registration

@SmokeMRN1
Scenario: MRN Matching
  Given the user enters the correct pin "1234"
  When the user lands on welcome screen and clicks continue
  And the user lands on MRN page "Registered Mortgage"
  And the continue button on MRN should be disabled
  And the user enters MRN "123456789012"
  And the continue button on MRN should be disabled
#  And the hypertext what is MRN should be enabled "Link help text"
  And the user re enters MRN "123456789012"
  And the continue button for MRN should be enabled
  And the user clicks on continue on MRN
#  How to verify sanctions and screening hit
  And the user lands on the congratulations page "NHL Account"
  And the user clicks on continue on congratulations page
  Then the user lands on Account activation dashboard "Account Activation" "Prepare required documents"


  @SmokeMRN2
  Scenario: MRN not Matching
    Given the user enters the correct pin "1234"
    When the user lands on welcome screen and clicks continue
    And the user lands on MRN page "Registered Mortgage"
    And the continue button on MRN should be disabled
    And the user enters MRN "123456789012"
    And the continue button on MRN should be disabled
#  And the hypertext what is MRN should be enabled "Link help text"
    And the user re enters MRN "123456789012"
    And the continue button for MRN should be enabled
    And the user clicks on continue on MRN
    Then the user gets MRN error "Mortgage registration number doesn't match"


  @SmokeMRN3
  Scenario: MRN not not matching length first greater
    Given the user enters the correct pin "1234"
    When the user lands on MRN page "Registered Mortgage"
    And the continue button on MRN should be disabled
    And the user enters MRN "123456789012"
    And the continue button on MRN should be disabled
    And the hypertext what is MRN should be enabled "Link help text"
    And the user re enters MRN "9234567890"
    And the continue button on MRN should be disabled

  @SmokeMRN4
  Scenario: MRN not not matching length second greater
    Given the user enters the correct pin "1234"
    When the user lands on MRN page "Registered Mortgage"
    And the continue button on MRN should be disabled
    And the user enters MRN "1234567890"
    And the continue button on MRN should be disabled
    And the hypertext what is MRN should be enabled "Link help text"
    And the user re enters MRN "923456789012"
    And the continue button on MRN should be disabled

