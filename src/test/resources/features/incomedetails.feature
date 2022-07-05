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
    When the user clicks on "Salary" as income source
#    Then the user lands on the Salary Details screen
    When the user enter the total income for "Salary" as "1000000"
    And the user uploads the document - "Salary certificate"
    And the user uploads the document - "Salary-Bank statement"
    And Clicks on add button
    Then continue button should be "enabled"
##    Then the user see a green tick mark
    When the user clicks on "Salary" as income source
    And click on Remove link
    And click on Remove option in the popup
    Then check if the Add button is disabled

  @SourceOfIncome
  Scenario: Salary Details remove individual files
    Given the user enters the correct pin "1234"
#    When the user lands on the Welcome page Step2
#    And the user clicks on Lets get started button to open NHL account
#    Then user lands on the Address screen
#    When the user clicks on the confirm button
#    Then the user lands on the Source of income screen
    Then continue button should be "disabled"
    When the user clicks on "Salary" as income source
#    Then the user lands on the Salary Details screen
    When the user enter the total income for "Salary" as "1000000"
    And the user uploads the document - "Salary certificate"
    And the user uploads the document - "Salary-Bank statement"
    And the user clicks on remove icon of "Salary certificate"
    Then check if the Add button is disabled

  @SourceOfIncome
  Scenario: Salary Details income File exceeds 4mb
    Given the user enters the correct pin "1234"
#    When the user lands on the Welcome page Step2
#    And the user clicks on Lets get started button to open NHL account
#    Then user lands on the Address screen
#    When the user clicks on the confirm button
#    Then the user lands on the Source of income screen
    Then continue button should be "disabled"
    When the user clicks on "Salary" as income source
##    Then the user lands on the Salary Details screen
    When the user enter the total income for "Salary" as "1000000"
    And the user uploads the document above the max size limit - "Salary certificate"
    Then validate whether the File exceeds max size error is shown
    Then check if the Add button is disabled
###    Then the user see a green tick mark
#    When the user clicks on "Salary" as income source
#    And click on Remove link
#    And click on Remove option in the popup
#    Then check if the Add button is disabled


  @SourceOfIncome
  Scenario: Own Business remove Files
      Given the user enters the correct pin "1234"
##    When the user lands on the Welcome page Step2
##    And the user clicks on Lets get started button to open NHL account
##    Then user lands on the Address screen
##    When the user clicks on the confirm button
##    Then the user lands on the Source of income screen
    Then continue button should be "disabled"
    When the user clicks on "Own Business" as income source
##    Then the user lands on the Salary Details screen
    When the user enter the total income for "Own Business" as "1000000"
    And the user uploads the document - "Trade license"
    And the user uploads the document - "Own Business-Bank statement"
    And the user selects Industry as "Ship fleet owners"
    And Clicks on add button
    Then continue button should be "enabled"
#    #Then the user see a green tick mark
    When the user clicks on "Own Business" as income source
    And click on Remove link
    And click on Remove option in the popup
    Then continue button should be "disabled"

  @SourceOfIncome
  Scenario: Own Business remove individual files
    Given the user enters the correct pin "1234"
##    When the user lands on the Welcome page Step2
##    And the user clicks on Lets get started button to open NHL account
##    Then user lands on the Address screen
##    When the user clicks on the confirm button
##    Then the user lands on the Source of income screen
    Then continue button should be "disabled"
    When the user clicks on "Own Business" as income source
##    Then the user lands on the Salary Details screen
    When the user enter the total income for "Own Business" as "1000000"
    And the user uploads the document - "Trade license"
    And the user uploads the document - "Own Business-Bank statement"
    And the user selects Industry as "Ship fleet owners"
    And the user clicks on remove icon of "Trade license"
    Then check if the Add button is disabled

  @SourceOfIncome
  Scenario: Additional Income remove files
    Given the user enters the correct pin "1234"
#    When the user lands on the Welcome page Step2
#    And the user clicks on Lets get started button to open NHL account
#    Then user lands on the Address screen
#    When the user clicks on the confirm button
#    Then the user lands on the Source of income screen
    Then continue button should be "disabled"
    When the user clicks on "Additional Income" as income source
#    Then the user lands on the Salary Details screen
    When the user enter the total income for "Additional Income" as "1000000"
    And the user uploads the document - "Pension certificate"
    And the user uploads the document - "Additional Income-Bank statement"
    And Clicks on add button
    Then continue button should be "enabled"
#    #Then the user see a green tick mark
    When the user clicks on "Additional Income" as income source
    And click on Remove link
    And click on Remove option in the popup
    Then continue button should be "disabled"

  @SourceOfIncome
  Scenario: Additional Income remove individual files - Pension certificate
    Given the user enters the correct pin "1234"
#    When the user lands on the Welcome page Step2
#    And the user clicks on Lets get started button to open NHL account
#    Then user lands on the Address screen
#    When the user clicks on the confirm button
#    Then the user lands on the Source of income screen
    Then continue button should be "disabled"
    When the user clicks on "Additional Income" as income source
#    Then the user lands on the Salary Details screen
    When the user enter the total income for "Additional Income" as "1000000"
    And the user uploads the document - "Pension certificate"
    Then check if the Add button is disabled
    And the user uploads the document - "Additional Income-Bank statement"
    And the user clicks on remove icon of "Pension certificate"
    Then check if the Add button is disabled

  Scenario: Additional Income remove individual files - Bank Statmeent
    Given the user enters the correct pin "1234"
#    When the user lands on the Welcome page Step2
#    And the user clicks on Lets get started button to open NHL account
#    Then user lands on the Address screen
#    When the user clicks on the confirm button
#    Then the user lands on the Source of income screen
    Then continue button should be "disabled"
    When the user clicks on "Additional Income" as income source
#    Then the user lands on the Salary Details screen
    When the user enter the total income for "Additional Income" as "1000000"
    And the user uploads the document - "Pension certificate"
    Then check if the Add button is disabled
    And the user uploads the document - "Additional Income-Bank statement"
    Then check if the Add button is enabled
    And the user clicks on remove icon of "Additional Income-Bank statement"
    Then check if the Add button is disabled



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

