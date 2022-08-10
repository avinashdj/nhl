Feature: As a fab customer,
  I want to see main menu via welcome screen
  So that i can control my personal details and custom setting though profile.

  Background: Customer initiate user journey as registered or non-registered
    Given the user launch application as new user and get started

  @TestME
  Scenario: Customer access menu profile and logout
    Given the user register with registered mobile no "569760182" and provide verification code
    #And the user skipping registered email update and continue
    # the user setting secret pin and make confirm for login access
    #And the user "allow" permission to capture current mobile geo location
    #And the user "allow" permission to capture customer biometrics via mobile
