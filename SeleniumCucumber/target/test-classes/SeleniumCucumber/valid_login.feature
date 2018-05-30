Feature: WP Admin panel

  Scenario: Login test
    Given I am on the QAteam homepage
    When I enter valid username and password
    And click on the submit button
    Then I should see Admin
    And close the browser