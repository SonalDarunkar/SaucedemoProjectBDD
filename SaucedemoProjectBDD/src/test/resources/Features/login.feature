
Feature: Login page Automation of Saucedemo app.

Scenario Outline: Check login is successful with valid creds.
   Given User is on login page
   When User enters valid "<username>" and "<password>"
   And Clicks on login page button
   Then User is navigate to homepage
   And Close the browser

   
   Examples:
   
   | username                | password     |
   | standard_user           | secret_sauce |
   
   
   