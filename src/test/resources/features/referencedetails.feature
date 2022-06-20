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



