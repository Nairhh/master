Feature: Login Functionality

  @login
  Scenario: Login with valid credentials
    Given Navigate to homepage
    When User enters UserName and Password
    Then User logged in successfully

  @data_driven
  Scenario: The one where the user change some of the data and place the order
    Given User is already registered
    And Add product to cart
    When User increases the product quantity by 2
    And Continue for checkout
    And Change the shipping address to new address
    Then The product should be delivered to new address
