Feature: the user should have access to the documentation page


  Scenario: verify  the "Odoo Documentation" message is displayed in a new window
    Given the user logged in as "POSmanager"
    When the user click on username dashboard
    And the user click on Documentation button
    Then the user should be able to see "Odoo Documentation" message in a new window


    Scenario: verify there are 4 main document topics are listed on Documentation page
      Given the user logged in as "POSmanager"
      When the user click on username dashboard
      When the user click on Documentation button
      Then the user should be able to see 4 main document topics (User Docs, Developer, Install and Maintain, Contribute)