Feature: Calc test

  @Android
  Scenario: E2E test
    Given I see calculator opened
    Then I verify that SUM of '5' and '3' equals to '8'
