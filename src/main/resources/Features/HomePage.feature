Feature: Login

  #@sanity @regression
  Scenario: Successfully Login with the Valid Credentials
    Given User Lunch Chrome Browser
    When User open url "https://admin-demo.nopcommerce.com/login"
    And User enter Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page Title Should Be "Dashboard / nopCommerce administration"
    When User click on the logout link
   # Then Page Title Should Be "Your store. Login"
    And Close the Browser
