@smoke
Feature: F03_currencies
  Scenario: user change currency from US Dollar to Euro to all products
    When user click on the dropdown list and select "Euro" currency
    Then user check the currency of all products
