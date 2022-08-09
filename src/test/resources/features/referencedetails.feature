Feature: Validation of Reference details screen


  @SmokeCombo
  Scenario: Reference details invalid data
    Given the user enters the correct pin "1111"
    When the user enters the details of invalid reference details list
      | Adbul | Friend | 623454343 | 523433322 | 023232321 | Adbul | Friend | 623454343 | 523433322 | 023232321 |
      | Adbul | Friend | 623454343 | 623433322 | 043232321 | Adbul | Friend | 623454343 | 623433322 | 043232321 |
      | Adbul | Friend | 623454343 | 623433322 |           | Adbul | Friend | 623454343 | 623433322 |           |
      | Adbul | Friend | 523454343 | 523433322 | 743232321 | Adbul | Friend | 523454343 | 523433322 | 743232321 |
      | Adbul | Friend | 523454343 | 523433322 | 043232321 | Adbul | Friend | 523454343 | 523433322 | 043232321 |
#    And the user press on continue on reference details screen
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


    Scenario: Reference details valid try
    Given the user enters the correct pin "1111"
      When the user enters the details valid of reference details list
        | Adbul | Friend | 523454343 | 523433322 | 043232321 | Adbul | Friend | 523454343 | 523433322 | ""        |
        | Adbul | Friend | 523454343 | 523433322 | ""        | Adbul | Friend | 523454343 | 523433322 | 043232321 |
        | Adbul | Friend | 523454343 | 523433322 | ""        | Adbul | Friend | 523454343 | 523433322 | ""        |
      And the user press on continue on reference details screen
      Then the consent screen is displayed



#  @Smoke
#  Scenario: Positive flow for Reference details screen
#    Given the user enters the correct pin "1234"
#    When the user enters the details of first reference
#      | Adbul     |
#      | Friend    |
#      | 523454343 |
#      | 523433322 |
#      | 043232321 |
#    And the user enters the details of second reference
#      | Adbul     |
#      | Friend    |
#      | 523454343 |
#      | 523433322 |
#      | 043232321 |
#    And the user press on continue on reference details screen
#    Then the consent screen is displayed
#
#  @SmokeTest1
#  Scenario: Only 1 Reference details for Reference details screen
#    Given the user enters the correct pin "1234"
#    When the user enters the details of first reference
#      | Adbul     |
#      | Friend    |
#      | 523454343 |
#      | 523433322 |
#      | 043232321 |
#    Then the continue button on reference details should be disabled
#
#
#  @SmokeTest2
#  Scenario: Incorrect First Ref contact numbers
#    Given the user enters the correct pin "1234"
#    When the user enters the details of first reference
#      | Adbul     |
#      | Friend    |
#      | 623454343 |
#      | 623433322 |
#      | 043232321 |
#    And the user enters the details of second reference
#      | Adbul     |
#      | Friend    |
#      | 523454343 |
#      | 523433322 |
#      | 043232321 |
#    Then the continue button on reference details should be disabled
#    And the user gets "Please enter a valid number" error in first reference contact number
#    And the user gets "Please enter a valid number" error in first reference alternate contact number
#
#
#  @SmokeTest3
#  Scenario: Incorrect Second Ref contact numbers
#    Given the user enters the correct pin "1234"
#    When the user enters the details of first reference
#      | Adbul     |
#      | Friend    |
#      | 523454343 |
#      | 523433322 |
#      | 043232321 |
#    And the user enters the details of second reference
#      | Adbul     |
#      | Friend    |
#      | 623454343 |
#      | 623433322 |
#      | 123232321 |
#    Then the continue button on reference details should be disabled
#    And the user gets "Please enter a valid number" error in Second reference contact number
#    And the user gets "Please enter a valid number" error in Second reference alternate contact number
#    And the user gets "Please enter a valid number" error in Second reference office contact number
#
#  @SmokeTest4
#  Scenario: No Office number is provided in any reference details
#    Given the user enters the correct pin "1234"
#    When the user enters the details of first reference
#      | Adbul     |
#      | Friend    |
#      | 523454343 |
#      | 523433322 |
#      |           |
#    And the user enters the details of second reference
#      | Adbul     |
#      | Friend    |
#      | 523454343 |
#      | 523433322 |
#      |           |
#    And the user press on continue on reference details screen
#    Then the consent screen is displayed
#
#  @SmokeTest5
#  Scenario: Incorrect Office number provided in first reference details
#    Given the user enters the correct pin "1234"
#    When the user enters the details of first reference
#      | Adbul     |
#      | Friend    |
#      | 523454343 |
#      | 523433322 |
#      | 123232321 |
#    And the user enters the details of second reference
#      | Adbul     |
#      | Friend    |
#      | 523454343 |
#      | 523433322 |
#      |           |
#    Then the continue button on reference details should be disabled
#    And the user gets "Please enter a valid number" error in first reference office contact number
#
#  @SmokeTest6
#  Scenario: Incorrect Office number is provided in second reference details
#    Given the user enters the correct pin "1234"
#    When the user enters the details of first reference
#      | Adbul     |
#      | Friend    |
#      | 523454343 |
#      | 523433322 |
#      |           |
#    And the user enters the details of second reference
#      | Adbul     |
#      | Friend    |
#      | 523454343 |
#      | 523433322 |
#      | 993232321 |
#    Then the continue button on reference details should be disabled
#    And the user gets "Please enter a valid number" error in Second reference office contact number
#
#  @SmokeTest7
#  Scenario: No first reference contact number is provided
#    Given the user enters the correct pin "1234"
#    When the user enters the details of first reference
#      | Adbul     |
#      | Friend    |
#      |           |
#      | 523433322 |
#      | 043232321 |
#    And the user enters the details of second reference
#      | Adbul     |
#      | Friend    |
#      | 523454343 |
#      | 523433322 |
#      | 993232321 |
#    Then the continue button on reference details should be disabled
#    And the user gets "Please enter a valid number" error in first reference contact number
#    And the user gets "Please enter a valid number" error in Second reference office contact number
#
#  @SmokeTest8
#  Scenario: No Office number is provided in both reference details
#    Given the user enters the correct pin "1234"
#    When the user enters the details of first reference
#      | Adbul     |
#      | Friend    |
#      | 523454343 |
#      | 523433322 |
#      |           |
#    And the user enters the details of second reference
#      | Adbul     |
#      | Friend    |
#      | 523454343 |
#      |           |
#      | 993232321 |
#    Then the continue button on reference details should be disabled
#    And the user gets "Please enter a valid number" error in Second reference alternate contact number
#    And the user gets "Please enter a valid number" error in Second reference office contact number
#

