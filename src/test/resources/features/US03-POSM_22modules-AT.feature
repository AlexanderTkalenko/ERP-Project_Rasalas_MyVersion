Feature: user should verify number of modules

  Background:
    Given the user is on login page


  Scenario: Verify the POS managers access to 22 modules.
    Given the user is logged in as POSmanager
    Then verify access to all main modules - 22