Feature: User valid login and account name
  Agile Story: As a sales and expense manager, I want to Login with valid credentials and get my account name.


  Scenario Outline: Verify user information "<email>"
    Given the user is on the login page
    When the user is login using "<email>" and "<password>"
    Then account holder name should be "<name>"
    Examples:
      | email                      | password        | name              |
      | salesmanager55@info.com    | salesmanager    | SalesManager55    |
      | salesmanager67@info.com    | salesmanager    | SalesManager67    |
      | salesmanager89@info.com    | salesmanager    | SalesManager89    |
      | expensesmanager55@info.com | expensesmanager | ExpensesManager55 |
      | expensesmanager67@info.com | expensesmanager | ExpensesManager67 |
      | expensesmanager89@info.com | expensesmanager | ExpensesManager89 |