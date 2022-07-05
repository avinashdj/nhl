Feature: Update Address

  @AccountActivation
  Scenario: Address mandatory fields validation
#    Given the user enters the correct pin "1234"
#    When the user lands on the Welcome page Step2
#    And the user clicks on Lets get started button to open NHL account
    Then user lands on the Address screen
#    When the user clicks on the update button
#    Given the user misses to enter the required fields error message is shown
#      |  |  |  |  | Sharjah |       |
#      |  |  |  |  | Sharjah | 23000 |
#    And the user enters villa number ""
#    And the user enters building name ""
#    And the user enters Street name ""
#    And the user enters Area ""
#    And the user selects Emirate "Sharjah"
#    And the user enters POBox ""
#    And the user clicks on done
#    Then Please fill your address details should be shown

  @AccountActivation
  Scenario: Address field validation
    Given the user enters the correct pin "1234"
    When the user lands on the Welcome page Step2
    And the user clicks on Lets get started button to open NHL account
    Then user lands on the Address screen
    When the user clicks on the update button
    Given the user misses to enter the required fields error message is shown
      | VillaNumber | buildingName | streetName | area | poBox |
      | "     "     | "          " | "      "   | "  " | "   " |
      |             |              |            |      |       |
      |             |              |            |      | 23001 |


  @AccountActivation
  Scenario: User validates his address
    Given the user enters the correct pin "1234"
    When the user lands on the Welcome page Step2
    And the user clicks on Lets get started button to open NHL account
    Then user lands on the Address screen
    When the user clicks on the update button
    And the user enters villa number "1120"
    And the user enters building name "Arc Tower B"
    And the user enters Street name "Al Oud St"
    And the user enters Area "Shams Boutik"
    And the user selects Emirate "Sharjah"
    And the user enters POBox "23000"
    And the user clicks on done
    Then the user validates villa number "1120"
    And the user validates building name "Arc Tower B"
    And the user validates Street name "Al Oud St"
    And the user validates Area "Shams Boutik"
    And the user validates Emirate "Sharjah"
    And the user validates POBox "23000"
    Then the user clicks on Continue button
    And the user clicks on the confirm button
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

