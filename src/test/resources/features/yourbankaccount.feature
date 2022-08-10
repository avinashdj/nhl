Feature:
  Income details screen

  @YourBankAccount
  Scenario: FAB Account details
    Given the user enters the correct pin "1234"
#    When the user lands on the Welcome page Step2
#    And the user clicks on Lets get started button to open NHL account
#    Then user lands on the Address screen
#    When the user clicks on the confirm button
#    Then the user lands on the Source of income screen
    Then continue button should be disabled
    Then the Bank Name should not be shown
    When the user enters the IBAN as "123456789"
    Then continue button should be disabled
    And the user enters the Account number as "123456789"
    Then continue button should be disabled
    And the user enters the Branch name as "Abu Dhabi Main Branch"
    And the continue button is enabled

  Scenario: FAB Account creation
    Given the user enters the correct pin "1234"
#    When the user lands on the Welcome page Step2
#    And the user clicks on Lets get started button to open NHL account
#    Then user lands on the Address screen
#    When the user clicks on the confirm button
#    Then the user lands on the Source of income screen
    When the user enters the IBAN as "123456789"
    And the user enters the Account number as "123456789"
    And the user enters the Branch name as "Abu Dhabi Main Branch"
    And the user clicks on Continue button for Account creation
    Then the "SIO" authorisation page is shown
    And the Continue button in the "SIO" authorisation page is disabled
    When the user clicks on I Authorise in "SIO" authorisation page
    Then the Continue button in the "SIO" authorisation page is enabled
    When the user clicks on Continue button in the "SIO" authorisation page

  Scenario: Other Bank Account details
    Given the user enters the correct pin "1234"
#    When the user lands on the Welcome page Step2
#    And the user clicks on Lets get started button to open NHL account
#    Then user lands on the Address screen
#    When the user clicks on the confirm button
#    Then the user lands on the Source of income screen
    Then continue button should be disabled
    And the FAB Bank is selected by default
    When the user select Other Bank option
    Then continue button should be disabled
    Then the Bank Name should be shown
    When the user enters the IBAN as "123456789"
    Then continue button should be disabled
    And the user enters the Account number as "123456789"
    Then continue button should be disabled
    And the user enters the Branch name as "Abu Dhabi Main Branch"
    Then continue button should be disabled
    And the user enter the Bank name as "Emirates NBD"
    And the continue button is enabled

  Scenario: Other Bank Account creation
    Given the user enters the correct pin "1234"
#    When the user lands on the Welcome page Step2
#    And the user clicks on Lets get started button to open NHL account
#    Then user lands on the Address screen
#    When the user clicks on the confirm button
#    Then the user lands on the Source of income screen
    When the user select Other Bank option
    When the user enters the IBAN as "123456789"
    And the user enters the Account number as "123456789"
    And the user enters the Branch name as "Abu Dhabi Main Branch"
    And the user enter the Bank name as "Emirates NBD"
    And the user clicks on Continue button for Account creation
    Then the "DDA" authorisation page is shown
    And the Continue button in the "DDA" authorisation page is disabled
    When the user clicks on I Authorise in "DDA" authorisation page
    Then the Continue button in the "DDA" authorisation page is enabled
    When the user clicks on Continue button in the "DDA" authorisation page



