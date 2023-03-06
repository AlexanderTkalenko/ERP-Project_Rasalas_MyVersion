@us02
Feature: the user should see repair orders columns on the Repairs page
  Agile story: As a POS and Sales manager, the user should be able to get correct information on the Repairs page


  Scenario: as the POS manager, the user should verify there are 6 columns to see the repair orders on the Repairs page
    Given the user logged in as "POSmanager"
    When the user go to the Repairs page
    Then the user should verify 6 columns of repair orders


  Scenario: as the Sales manager, the user should verify there are 6 columns to see the repair orders on the Repairs page
    Given the user logged in as "Salesmanager"
    When the user go to the Repairs page
    Then the user should verify 6 columns of repair orders