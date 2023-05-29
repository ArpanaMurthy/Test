Feature: Login to the application

  @smoke
  Scenario Outline: Login with correct username and password
    Given I navigate to the application login page
    When I entered the "<userName>" and "<password>"
    Then I entered to the home screen


    Examples:
    |userName | password|
    | arpana  |  arpana |

