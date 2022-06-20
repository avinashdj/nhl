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
    And the consent screen is displayed
    Then Position held is "NOT DISPLAYED"
    And the user selects PEP as "NO"
    Then Position held is "NOT DISPLAYED"
    And Continue Button of PEP CONSENT page is "Enabled"
    When the user selects PEP as "YES"
    Then Position held is "DISPLAYED"
    And Continue Button of PEP Consent page is "Disabled"
    When the user selects position held as "INSIDE UAE"
    And Continue Button of PEP CONSENT page is "Enabled"
    When Continue button of PEP Consent is clicked






