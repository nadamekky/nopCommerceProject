@smoke
Feature:
  Scenario Outline: user could search using product name
    When user enter product data "<product>"
    And user click on search button
    Then user should see result about the "<product>"

      Examples:
        | product |
        | book    |
        | laptop  |
        | nike    |


      Scenario Outline: user could search with sku
        When user enter product data "<product>"
        And user click on search button
        And user clicks on product
        Then user check sku of product "<product>"

        Examples:
          | product   |
          | SCI_FAITH |
          | APPLE_CAM |
          | SF_PRO_11 |



