@us10
Feature: user should be able to manage quotation on the Sales page


  Scenario: verify the user can select all the quotation by clicking the top checkbox
    Given the user logged in as "POSmanager"
    When the user go to the Sales page
    And the user is select all the quotation by clicking "Quotation Number" checkbox


  Scenario: verify the user can select all the quotation by clicking the top checkbox
    Given the user logged in as "Salesmanager"
    When the user go to the Sales page
    And the user is select all the quotation by clicking "Quotation Number" checkbox