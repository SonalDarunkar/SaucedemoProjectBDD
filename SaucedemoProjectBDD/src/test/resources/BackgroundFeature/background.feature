
Feature: Background demo feature

Background: User is logged into the saucedemo app
Given User is accessing saucedemo login page
When User enters valid username and password
Then User should be able to navigate home page

  Scenario: Test Menu item
    When Clicks on breacrumb icon
    Then User should be able to see menu items

  Scenario: Verify add to card functionality
    When Clicks on add to cart button
    Then Item should be added to the cart

