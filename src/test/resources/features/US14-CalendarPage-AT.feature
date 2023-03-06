@us14
Feature: the user should have access the calendar page


  Scenario: verify users get time list by default from 0:00 - 23:00, and increase by one hour each time
    Given the user logged in as "POSmanager"
    When the user is on the Calendar page
    Then verify the time starts with 0:00


  Scenario: verify users get time list by default from 0:00 - 23:00, and increase by one hour each time
    Given the user logged in as "POSmanager"
    When the user is on the Calendar page
    Then verify the time ends with 23:00

  @wip
  Scenario: verify users get time list by default from 0:00 - 23:00, and increase by one hour each time
    Given the user logged in as "POSmanager"
    When the user is on the Calendar page
    Then verify time increase by one hour