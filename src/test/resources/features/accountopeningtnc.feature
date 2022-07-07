Feature: TnC declaration

@SmokeTnC1
Scenario: User provides consent to the TnC and carries on forward
  Given the user enters the correct pin "1111"
  When the user lands on first TnC account opening page
  And the continue button for first TnC Account Opening should be disabled
  And the consent for first TnC Account Opening should be empty
  And the user provides consent on first TnC account opening page
  And the continue button for first TnC account opening should be enabled
  And the user clicks on continue on first TnC account opening page
  And the user lands on second TnC account opening page
  And the continue button for second TnC account opening should be disabled
  And the consent for second TnC Account Opening should be empty
  And the user provides consent on second TnC account opening page
  And the continue button for second TnC account opening should be enabled
  And the user clicks on continue on second TnC account opening page
  Then the user lands on MRN page "Registered Mortgage"

  @SmokeTnC2
  Scenario: User provides consent to the TnC revisits previous Acc opening TnC before providing consent
    Given the user enters the correct pin "1111"
    When the user lands on first TnC account opening page
    And the continue button for first TnC Account Opening should be disabled
    And the consent for first TnC Account Opening should be empty
    And the user provides consent on first TnC account opening page
    And the continue button for first TnC account opening should be enabled
    And the user clicks on continue on first TnC account opening page
    And the user lands on second TnC account opening page
    And the continue button for second TnC account opening should be disabled
    And the consent for second TnC Account Opening should be empty
    And the user clicks on read our terms and conditions
    And the user lands on first TnC account opening page
    And the user consent check box should be disabled for first TnC account opening screen
    And the continue button for first TnC account opening should be enabled
    And the user clicks on continue on first TnC account opening page
    And And the user lands on second TnC account opening page
    And the user provides consent on second TnC account opening page
    And the continue button for second TnC account opening should be enabled
    And the user clicks on continue on second TnC account opening page
    Then the user lands on MRN page "Registered Mortgage"


  @SmokeTnC3
  Scenario: User provides consent to the TnC revisits previous Acc opening TnC after providing consent
    Given the user enters the correct pin "1111"
    When the user lands on first TnC account opening page
    And the continue button for first TnC Account Opening should be disabled
    And the consent for first TnC Account Opening should be empty
    And the user provides consent on first TnC account opening page
    And the continue button for first TnC account opening should be enabled
    And the user clicks on continue on first TnC account opening page
    And the user lands on second TnC account opening page
    And the consent for second TnC Account Opening should be empty
    And the continue button for second TnC account opening should be disabled
    And the user provides consent on second TnC account opening page
    And the continue button for second TnC account opening should be enabled
    And the user clicks on read our terms and conditions
    And the user lands on first TnC account opening page
    And the user consent check box should be disabled for first TnC account opening screen
    And the continue button for first TnC account opening should be enabled
    And the user clicks on continue on first TnC account opening page
    And And the user lands on second TnC account opening page
    And the consent for second TnC Account Opening should be empty
    And the continue button for second TnC account opening should be disabled
    And the user provides consent on second TnC account opening page
    And the continue button for second TnC account opening should be enabled
    And the user clicks on continue on second TnC account opening page
    Then the user lands on MRN page "Registered Mortgage"