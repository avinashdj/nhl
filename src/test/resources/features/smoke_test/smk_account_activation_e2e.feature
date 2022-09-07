Feature: As a bank customer
  I want to activate recently created fab-nhl account


  @SMK
  Scenario Outline: User perform account activation user flow with required details and documents
    Given user complete customer verification flow and landing welcome screen with "<reg-mobile>" "<otp>" "<pin>"
    When user start account activation process using welcome screen
    Then user provide fab bank details for SIO approvals with "<acc-no>" "<iban-no>" "<branch>"
    Then user accept mortgage contract and Instruction-order and terms conditions
    Then user upload requested home site plan and certificate documents
    Then user sign the loan agreement and mortgage agreement
    Then user verify congratulations page for account activation and landing to welcome screen

    Examples:
      |reg-mobile   |otp    |pin |acc-no          |iban-no          |branch    |
      |569760191    |123456 |1234|1234567890123456|12345678901234567|Al Barsha |
