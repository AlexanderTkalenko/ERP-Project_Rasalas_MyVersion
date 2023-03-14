@us09
Feature: user should verify number of modules


  Scenario: Verify the Event managers have access to 19 modules.
    Given the user logged in as "Salesmanager"
    Then verify access to all main modules - 19