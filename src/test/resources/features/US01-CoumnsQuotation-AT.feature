@us01
Feature: the user should see quotation columns on Sales page
  Agile story: As a POS and Sales manager, the user should be able to get correct information on the Sales page


  Scenario: as the POS manager, the user should verify there are 6 columns to see the quotation on the Sales page
    Given the user logged in as "POSmanager"
    When the user go to the Sales page
    Then the user should verify 6 columns of quotation


  Scenario: as the Sales manager, the user should verify there are 6 columns to see the quotation on the Sales page
    Given the user logged in as "Salesmanager"
    When the user go to the Sales page
    Then the user should verify 6 columns of quotation