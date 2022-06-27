Feature: Registration of Mobile Email and Setup Pin

  @TestME
  Scenario: Error message for Invalid Number
    Given the user clicks on the Lets Get Started button
    When the user enters the mobile number "423234234"
    Then Appropriate Error message "Please enter a valid mobile number----" should be shown

  @SmokeTest2
  Scenario: Error message for number not registered with ADHA
    Given the user clicks on the Lets Get Started button
    When the user enters the mobile number "523232323"
    And the user clicks on register button
    Then Appropriate Error message "It seems your mobile number isn't registered. Please visit any FAB NHL branch to update your contact details." should be shown

  @smokeTest3
  Scenario: User Enters an invalid email length
    Given the user clicks on the Lets Get Started button
    When the user enters the mobile number "555555555"
    And the user clicks on register button
    And the user enter the mobile registration OTP "123456"
    And the user enters the email Address "qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm@test.com"
    Then continue button in email page should be "disabled"

  @SmokeTest4
  Scenario: Mobile Email and Set up pin and incorrect Confirm pin
    Given the user clicks on the Lets Get Started button
    When the user enters the mobile number "555555555"
    And the user clicks on register button
    And the user enter the mobile registration OTP "123456"
    And the user clicks on skip link for email address
    And the user enters the email OTP "123456"
    And the user enters the login pin "1234"
    And the user confirms the login pin "1111"
    Then Appropriate Error message "The PIN does not match. Please enter the same PIN as before." should be shown

  @smokeTest6
  Scenario: User Enters an invalid email
    Given the user clicks on the Lets Get Started button
    When the user enters the mobile number "555555555"
    And the user clicks on register button
    And the user enter the mobile registration OTP "123456"
    And the user enters the email Address "test!#$%^&*()@test.com"
    Then continue button in email page should be "disabled"

  @Smoke
  Scenario: Mobile Email and Set up pin
    Given the user clicks on the Lets Get Started button
    When the user enters the mobile number "555555555"
    And the user clicks on register button
    And the user enter the mobile registration OTP "123456"
    And the user clicks on skip link for email address
    And the user enters the login pin "1234"
    And the user confirms the login pin "1234"
    And the user clicks on allow for Location
    And the user clicks on later for Biometric
    Then the user lands on the OCR screen

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
  #    And the user enters the email Address "test@test.com"
#    And the user clicks on Continue for email button

  @SmokeTest5
  Scenario: User allows location
    Given the user clicks on the Lets Get Started button
    When the user enters the mobile number "555555555"
    And the user clicks on register button
    And the user enter the mobile registration OTP "123456"
    And the user enters the email Address "test@test.com"
    And the user clicks on Continue for email button
    And the user enters the email OTP "123456"
    And the user enters the login pin "1234"
    And the user confirms the login pin "1234"
    And the user clicks on allow for Location
    And the user clicks on later for Biometric
    Then the user lands on the OCR screen



