@us03
Feature: user should verify number of modules


  Scenario: Verify the POS managers have access to 22 modules.
    Given the user is logged in as POSmanager
    Then verify access to all main modules - 22