Feature: the user should be able to view the product order


  Scenario: verify the POSmanager can view the order list on the Point os Sale page,
  after checking the Order reference, all the orders should be checked.
    Given the user logged in as "POSmanager"
    When the user click to Point os Sales module
    When the user click to orders
    And the user checking the Order reference
    Then all the orders should be checked