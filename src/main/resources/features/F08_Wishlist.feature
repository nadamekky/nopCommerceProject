
  Feature:
    Scenario: user add a product to the wishlist
      When user clicks on wishlist button
      Then user check that success message appeared

      Scenario: user go to wishlist tab
        When user clicks on wishlist button
        And user check that success message appeared
        And user clicks on wishlist tab
        Then user check the quantity