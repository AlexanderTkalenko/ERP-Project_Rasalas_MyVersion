@us07
Feature: user should verify number of modules


  Scenario: Verify the Event managers have access to 15 modules.
    Given the user logged in as "Eventmanager"
    Then verify access to all main modules - 15