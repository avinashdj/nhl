Feature:
  Validation of Reference details screen

  @Smoke
  Scenario: Positive flow for Reference details screen
    Given the user enters the correct pin "1234"
    When the user enters the details of first reference
      | Adbul     |
      | Friend    |
      | 523454343 |
      | 523433322 |
      | 043232321 |
    And the user enters the details of second reference
      | Adbul     |
      | Friend    |
      | 523454343 |
      | 523433322 |
      | 043232321 |
    And the user press on continue on reference details screen
    Then the consent screen is displayed

  @SmokeTest1
  Scenario: Only 1 Reference details for Reference details screen
    Given the user enters the correct pin "1234"
    When the user enters the details of first reference
      | Adbul     |
      | Friend    |
      | 523454343 |
      | 523433322 |
      | 043232321 |
    Then the continue button on reference details should be disabled


  @SmokeTest2
  Scenario: Incorrect First Ref contact numbers
    Given the user enters the correct pin "1234"
    When the user enters the details of first reference
      | Adbul     |
      | Friend    |
      | 623454343 |
      | 623433322 |
      | 043232321 |
    And the user enters the details of second reference
      | Adbul     |
      | Friend    |
      | 523454343 |
      | 523433322 |
      | 043232321 |
    Then the continue button on reference details should be disabled
    And the user gets "Please enter a valid number" error in first reference contact number
    And the user gets "Please enter a valid number" error in first reference alternate contact number


  @SmokeTest3
  Scenario: Incorrect Second Ref contact numbers
    Given the user enters the correct pin "1234"
    When the user enters the details of first reference
      | Adbul     |
      | Friend    |
      | 523454343 |
      | 523433322 |
      | 043232321 |
    And the user enters the details of second reference
      | Adbul     |
      | Friend    |
      | 623454343 |
      | 623433322 |
      | 123232321 |
    Then the continue button on reference details should be disabled
    And the user gets "Please enter a valid number" error in Second reference contact number
    And the user gets "Please enter a valid number" error in Second reference alternate contact number
    And the user gets "Please enter a valid number" error in Second reference office contact number

  @SmokeTest4
  Scenario: No Office number is provided in any reference details
    Given the user enters the correct pin "1234"
    When the user enters the details of first reference
      | Adbul     |
      | Friend    |
      | 523454343 |
      | 523433322 |
      |           |
    And the user enters the details of second reference
      | Adbul     |
      | Friend    |
      | 523454343 |
      | 523433322 |
      |           |
    And the user press on continue on reference details screen
    Then the consent screen is displayed

  @SmokeTest5
  Scenario: Incorrect Office number provided in first reference details
    Given the user enters the correct pin "1234"
    When the user enters the details of first reference
      | Adbul     |
      | Friend    |
      | 523454343 |
      | 523433322 |
      | 123232321 |
    And the user enters the details of second reference
      | Adbul     |
      | Friend    |
      | 523454343 |
      | 523433322 |
      |           |
    Then the continue button on reference details should be disabled
    And the user gets "Please enter a valid number" error in first reference office contact number

  @SmokeTest6
  Scenario: Incorrect Office number is provided in second reference details
    Given the user enters the correct pin "1234"
    When the user enters the details of first reference
      | Adbul     |
      | Friend    |
      | 523454343 |
      | 523433322 |
      |           |
    And the user enters the details of second reference
      | Adbul     |
      | Friend    |
      | 523454343 |
      | 523433322 |
      | 993232321 |
    Then the continue button on reference details should be disabled
    And the user gets "Please enter a valid number" error in Second reference office contact number

  @SmokeTest7
  Scenario: No first reference contact number is provided
    Given the user enters the correct pin "1234"
    When the user enters the details of first reference
      | Adbul     |
      | Friend    |
      |           |
      | 523433322 |
      | 043232321 |
    And the user enters the details of second reference
      | Adbul     |
      | Friend    |
      | 523454343 |
      | 523433322 |
      | 993232321 |
    Then the continue button on reference details should be disabled
    And the user gets "Please enter a valid number" error in first reference contact number
    And the user gets "Please enter a valid number" error in Second reference office contact number

  @SmokeTest8
  Scenario: No Office number is provided in both reference details
    Given the user enters the correct pin "1234"
    When the user enters the details of first reference
      | Adbul     |
      | Friend    |
      | 523454343 |
      | 523433322 |
      |           |
    And the user enters the details of second reference
      | Adbul     |
      | Friend    |
      | 523454343 |
      |           |
      | 993232321 |
    Then the continue button on reference details should be disabled
    And the user gets "Please enter a valid number" error in Second reference alternate contact number
    And the user gets "Please enter a valid number" error in Second reference office contact number


  @SmokeCombo
  Scenario: Reference details valid or invalid
    Given the user enters the correct pin "1111"
    When the user enters the details of reference details list
      | Adbul | Friend | 623454343 | 523433322 | 023232321 | Adbul | Friend | 623454343 | 523433322 | 023232321 |
      | Adbul | Friend | 623454343 | 623433322 | 043232321 | Adbul | Friend | 623454343 | 623433322 | 043232321 |
      | Adbul | Friend | 623454343 | 623433322 |           | Adbul | Friend | 623454343 | 623433322 |           |
      | Adbul | Friend | 523454343 | 523433322 | 743232321 | Adbul | Friend | 523454343 | 523433322 | 743232321 |
      | Adbul | Friend | 523454343 | 523433322 | 043232321 | Adbul | Friend | 523454343 | 523433322 | 043232321 |
      | Adbul | Friend | 523454343 | 523433322 | 043232321 | Adbul | Friend | 523454343 | 523433322 |           |
      | Adbul | Friend | 523454343 | 523433322 |           | Adbul | Friend | 523454343 | 523433322 | 043232321 |
      | Adbul | Friend | 523454343 | 523433322 |           | Adbul | Friend | 523454343 | 523433322 |           |
    And the user press on continue on reference details screen
    Then the consent screen is displayed

  @SmokeCombo1
  Scenario: Reference details blank values
    Given the user enters the correct pin "1111"
    When the user enters the details of reference details list blank values
      | Adbul | Friend | " "       | 523433322 | 083232321 | Adbul | Friend | " "       | 523433322 | 083232321 |
      | Adbul | Friend | 523454343 | " "       | 043232321 | Adbul | Friend | 523454343 | " "       | 043232321 |
      | " "   | Friend | 523454343 | 523433322 | 043232321 | " "   | Friend | 523454343 | 523433322 | 043232321 |
      | Adbul | " "    | 523454343 | 523433322 | 043232321 | Adbul | " "    | 523454343 | 523433322 | 043232321 |
      | " "   | " "    | 523454343 | 523433322 | 043232321 | " "   | " "    | 523454343 | 523433322 | 043232321 |
      | " "   | " "    | " "       | " "       | " "       | Adbul | Friend | 523454343 | 523433322 | 043232321 |
      | Adbul | Friend | 523454343 | 523433322 | 043232321 | " "   | " "    | " "       | " "       | " "       |
    Then the continue button on reference details should be disabled

#Full flow
# //android.widget.RadioButton[@content-desc="No"]
#//android.widget.RadioButton[@content-desc="Yes"]
# //android.widget.RadioButton[@content-desc="Inside UAE"]
# //android.widget.RadioButton[@content-desc="Outside UAE"]
#  //android.widget.Button[@content-desc="Continue"]


  @SmokeCombo2
  Scenario: Reference details blank values full flow
    Given the user clicks on the Lets Get Started button
    When the user enters the mobile number "567069024"
    And the user clicks on register button
    And the user enter the mobile registration OTP "123456"
    And the user clicks on skip link for email address
    And the user enters the login pin "1111"
    And the user confirms the login pin "1111"
    And the user clicks on allow for Location
    And the user clicks on later for Biometric
    And the user swipes to Account Opening card
    And the user enters the details of reference details list blank values
      | Adbul | Friend | " "       | 523433322 | 083232321 | Adbul | Friend | " "       | 523433322 | 083232321 |
      | Adbul | Friend | 523454343 | " "       | 043232321 | Adbul | Friend | 523454343 | " "       | 043232321 |
      | " "   | Friend | 523454343 | 523433322 | 043232321 | " "   | Friend | 523454343 | 523433322 | 043232321 |
      | Adbul | " "    | 523454343 | 523433322 | 043232321 | Adbul | " "    | 523454343 | 523433322 | 043232321 |
      | " "   | " "    | 523454343 | 523433322 | 043232321 | " "   | " "    | 523454343 | 523433322 | 043232321 |
      | " "   | " "    | " "       | " "       | " "       | Adbul | Friend | 523454343 | 523433322 | 043232321 |
      | Adbul | Friend | 523454343 | 523433322 | 043232321 | " "   | " "    | " "       | " "       | " "       |
    Then the continue button on reference details should be disabled