Feature: As a bank customer
  I want to see the nhl app menu and manage profile configuration and settings


  @SMK
  Scenario Outline: User perform main-menu complete flow and validate its functionalities
    Given user complete customer verification flow and landing welcome screen with "<reg-mobile>" "<otp>" "<pin>"
    When User landing to nhl menu screen through welcome screen
    Then User landing faq's screen and validate its functionalities
    Then User landing about screen and validate its functionalities
    Then User landing personalize screen and validate its functionalities with "<customer-name>" "<cus-mobile>"
    Then User landing islamic screen and validate its functionalities
    Examples:
      |reg-mobile   |otp    |pin |customer-name   |cus-mobile       |
      |569760191    |123456 |1234|SHIWANTHA LAKMAL|+971 56 976 0182 |
