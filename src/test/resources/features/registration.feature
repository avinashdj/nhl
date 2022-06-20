Feature: Registration of Mobile Email and Setup Pin

  @Smoke
  Scenario: Mobile Email and Set up pin
    Given the user clicks on the Lets Get Started button
    When the user enters the mobile number "555555555"
    And the user clicks on register button
    And the user enter the valid mobile registration OTP "123456"
    And the user enters the valid email Address "test@test.com"
    And the user enters the valid email OTP "123456"
    And the user enters the login pin "1234"
    And the user confirms the login pin "1234"
    And the user clicks on later for Location
    And the user clicks on later for Biometric
    Then the user lands on the OCR screen

  @SmokeTest1
  Scenario: Error message for Invalid Number
    Given the user clicks on the Lets Get Started button
    When the user enters the mobile number "423234234"
    Then Appropriate Error message "Please enter a valid mobile number" should be shown

  @SmokeTest2
  Scenario: Error message for number not registered with ADHA
    Given the user clicks on the Lets Get Started button
    When the user enters the mobile number "523232323"
    And the user clicks on register button
    Then Appropriate Error message "It seems your mobile number isn't registered. Please visit any FAB NHL branch to update your contact details." should be shown

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


  @ExtentReport
  Scenario: Test extent report
    Given the user clicks on the Lets Get Started button

