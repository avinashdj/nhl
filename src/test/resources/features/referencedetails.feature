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

