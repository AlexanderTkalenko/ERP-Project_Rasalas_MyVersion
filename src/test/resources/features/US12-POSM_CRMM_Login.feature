@us12
Feature: User valid login and account name
  Agile Story: As a POS and CRM manager, I want to Login with valid credentials and get my account name.


  Scenario Outline: Verify user information "<email>"
    Given the user is on the login page
    When the user is login using "<email>" and "<password>"
    Then account holder name should be "<name>"
    Examples:
      | email                       | password         | name               |
      | posmanager55@info.com       | posmanager       | POSManager55       |
      | posmanager67@info.com       | posmanager       | POSManager67       |
      | posmanager89@info.com       | posmanager       | POSManager89       |
      | eventscrmmanager55@info.com | eventscrmmanager | EventsCRMManager55 |
      | eventscrmmanager67@info.com | eventscrmmanager | EventsCRMManager67 |
      | eventscrmmanager89@info.com | eventscrmmanager | EventsCRMManager89 |
