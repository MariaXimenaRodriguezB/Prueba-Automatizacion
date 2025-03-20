@register

  Feature: Create a new employee

    As a client, I want to register a new employee in the App

  Scenario Outline: Create a new employee
    Given enter the url of the app
    When login in with valid credentials
    And navigate to Module PIM and create new employee
      | firstName   | middleName   | lastName   | userName   | userPassword   |
      | <firstName> | <middleName> | <lastName> | <userName> | <userPassword> |
    Then validate new employee
    Examples:
      | firstName | middleName | lastName   | userName      | userPassword |
      | Maria5    | Ximena5    | Rodriguez5 | MariaXimenaR5 | Maria**13    |
