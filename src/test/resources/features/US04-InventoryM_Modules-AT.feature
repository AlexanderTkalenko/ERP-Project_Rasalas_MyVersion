Feature: user should verify number of modules


  Scenario: Verify the Inventory managers have access to 16 modules.
    Given the user logged in as "Inventorymanager"
    Then verify access to all main modules - 16