Feature:
  Income details screen

  @SourceOfIncome
  Scenario: Salary Details income remove Files
    Given the user enters the correct pin "1234"
#    When the user lands on the Welcome page Step2
#    And the user clicks on Lets get started button to open NHL account
#    Then user lands on the Address screen
#    When the user clicks on the confirm button
#    Then the user lands on the Source of income screen
    Then continue button should be "disabled"
    When the user clicks on salary Details
#    Then the user lands on the Salary Details screen
    When the user enter the total Monthly Salary as "100000"
    And the user uploads the Salary certificate
    And the user uploads the Bank statement
    And Clicks on add button
    Then continue button should be "enabled"
##    Then the user see a green tick mark
    When the user clicks on salary Details
    And click on Remove link
    And click on Remove option in the popup
    Then document must be removed

  @SourceOfIncome
  Scenario: Salary Details income remove Files
    Given the user enters the correct pin "1234"
#    When the user lands on the Welcome page Step2
#    And the user clicks on Lets get started button to open NHL account
#    Then user lands on the Address screen
#    When the user clicks on the confirm button
#    Then the user lands on the Source of income screen
    Then continue button should be "disabled"
    When the user clicks on salary Details
#    Then the user lands on the Salary Details screen
    When the user enter the total Monthly Salary as "100000"
    And the user uploads the Salary certificate
    And the user uploads the Bank statement
    And Clicks on add button
    Then continue button should be "enabled"
#   TODO: implement below 3 steps in the scenario
#    And the user see a green tick mark
#    And the user clicks on the continue button in Income Source
#    And the user should land on the Reference details page




#    Then the income source screen is shown


#  @Smoke
#  Scenario: Mobile Email and Set up pin
#    Given the user clicks on the Lets Get Started button
#    When the user enters the valid mobile number "555555555"
#    And the user enter the valid mobile registration OTP "123456"
#    And the user enters the valid email Address "test@test.com"
#    And the user enters the valid email OTP "123456"
#    And the user enters the login pin "1234"
#    And the user confirms the login pin "1234"
#    And the user clicks on later for Location
#    And the user clicks on later for Biometric
#    Then the user lands on the OCR screen
#    Then the user validates villa number "1120"
#    And the user validates building name "Arc Tower B"
#    And the user validates Stree name "Al Oud St"
#    And the user validates Area "Shams Boutik"
#    And the user validates Emirate "Sharjah"
#    And the user validates POBox "23000"
#    Then the user clicks on Continue button


#  @Smoke1
#  Scenario: Mobile Email and Set up pin
#    Given the user opens the NHL Mobile application
#
#  @Regression
#  Scenario: scenario2
#    Given the user opens the NHL Mobile application
#    When the user clicks on the Lets Get Started button

#  Scenario: my Scenario
#    Given i am registering my mobile number

