@register

  Feature: Create a new employee

    As a client, I want to register a new employee in the App

  Scenario: Create a new employee
    Given enter the url of the app
    When login in with valid credentials
    And navigate to Module PIM and create new employee
    Then validate new employee