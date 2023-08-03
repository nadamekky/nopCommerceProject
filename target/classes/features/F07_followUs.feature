@smoke
  Feature:
    Scenario: user opens facebook link
      When user click on facebook icon
      Then "https://www.facebook.com/nopCommerce" is opened in new tab


    Scenario: user opens twitter link
        When user click on twitter icon
        Then "https://twitter.com/nopCommerce" is opened in new tab


    Scenario: user opens rss link
      When user click on rss icon
      Then  "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab


    Scenario: user opens youtube link
      When user click on youtube icon
      Then "https://www.youtube.com/user/nopCommerce" is opened in new tab
