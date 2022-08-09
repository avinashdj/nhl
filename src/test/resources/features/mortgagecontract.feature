Feature: TnC declaration

@SmokeTnC1
Scenario: User provides consent to the TnC and carries on forward
  Given the user enters the correct pin "1111"
  When the user lands on first MC page
  And the continue button for first MC should be disabled
  And the consent for first MC should be empty
  And the user provides consent on first MC page
  And the continue button for first MC should be enabled
  And the user clicks on continue on first MC page
  And the user lands on second MC page
  And the continue button for second MC should be disabled
  And the consent for second MC should be empty
  And the user provides consent on second MC page
  And the continue button for second MC should be enabled
  And the user clicks on continue on second MC page
  Then the user lands on MRN page "Registered Mortgage"

  @SmokeTnC2
  Scenario: User provides consent to the TnC revisits previous Acc opening TnC before providing consent
    Given the user enters the correct pin "1111"
    When the user lands on first MC page
    And the continue button for first MC should be disabled
    And the consent for first MC should be empty
    And the user provides consent on first MC page
    And the continue button for first MC should be enabled
    And the user clicks on continue on first MC page
    And the user lands on second MC page
    And the continue button for second MC should be disabled
    And the consent for second MC should be empty
    And the user clicks on read our MC terms and conditions
    And the user lands on first MC page
    And the user consent check box should be disabled for first MC screen
    And the continue button for first MC should be enabled
    And the user clicks on continue on first MC page
    And the user lands on second MC page
    And the user provides consent on second MC page
    And the continue button for second MC should be enabled
    And the user clicks on continue on second MC page
    Then the user lands on MRN page "Registered Mortgage"


  @SmokeTnC3
  Scenario: User provides consent to the TnC revisits previous Acc opening TnC after providing consent
    Given the user enters the correct pin "1111"
    When the user lands on first MC page
    And the continue button for first MC should be disabled
    And the consent for first MC should be empty
    And the user provides consent on first MC page
    And the continue button for first MC should be enabled
    And the user clicks on continue on first MC page
    And the user lands on second MC page
    And the consent for second MC should be empty
    And the continue button for second MC should be disabled
    And the user provides consent on second MC page
    And the continue button for second MC should be enabled
    And the user clicks on read our MC terms and conditions
    And the user lands on first MC page
    And the user consent check box should be disabled for first MC screen
    And the continue button for first MC should be enabled
    And the user clicks on continue on first MC page
    And the user lands on second MC page
    And the consent for second MC should be empty
    And the continue button for second MC should be disabled
    And the user provides consent on second MC page
    And the continue button for second MC should be enabled
    And the user clicks on continue on second MC page
    Then the user lands on MRN page "Registered Mortgage"