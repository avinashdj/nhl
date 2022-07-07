Feature: PEP declaration

@SmokePEP1
Scenario: PEP No
  Given the user enters the correct pin "1111"
  When the user lands on PEP page "Additional details"
  And the continue button on PEP should be disabled
  And the user clicks on no on PEP page
  And the user clicks on continue on PEP
  Then the user lands on TnC page "Terms and Conditions"


  @SmokePEP2
  Scenario: PEP Yes and Inside UAE
#    Given the user enters the correct pin "1111"
    When the user lands on PEP page "Additional details"
    And the user clicks on yes on PEP page
    And the continue button on PEP should be disabled
    And check if the PEP options are displayed
    And the user clicks on Inside UAE
    And the user clicks on continue on PEP
    Then the user lands on TnC page "Terms and Conditions"

  @SmokePEP3
  Scenario: PEP Yes and Outside UAE
    Given the user enters the correct pin "1111"
    When the user lands on PEP page "Additional details"
    And the user clicks on yes on PEP page
    And the continue button on PEP should be disabled
    And the user clicks on Outside UAE
    And the user clicks on continue on PEP
    Then the user lands on TnC page "Terms and Conditions"