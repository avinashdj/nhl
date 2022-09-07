Feature: As a bank customer
  I want to create fab-nhl account by completing open account flow


  @SMK
  Scenario Outline: User perform nhl open account user flow with required details and documents
    Given user complete customer verification flow and landing welcome screen with "<reg-mobile>" "<otp>" "<pin>"
    When user start identity verification process using welcome screen
    Then user validates ADHA application details with "<app-no>" "<granted-amount>" "<service-type>" "<cus-mobile>"
    Then user start open account process using welcome screen
    Then user confirm address details given ADHA application
    Then user provide income source details and upload required documents
    Then user provide non-relations reference contact details
    Then user confirm political expose and relations status as "NO"
    Then user provide and confirm mortgage registration details
    Then user verify congratulations page for open nhl bank account creation and landing to welcome screen
    Examples:
      |reg-mobile   |otp    |pin |app-no    |granted-amount|service-type|cus-mobile       |
      |569760191    |123456 |1234|008 250 28|AED 800,000.00|250000      |+971 56 976 0128 |
