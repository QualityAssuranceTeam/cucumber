Feature: Sum two numbers
  Test simple calculator

  Scenario: Sum two positive numbers
    Given a is "5" and b is "3"
    When I sum up a and b
    Then I get "8"

  Scenario: Sum two negative numbers
    Given a is "-7" and b is "-12"
    When I sum up a and b
    Then I get "-19"

  Scenario: Sum two bipolar numbers
    Given a is "5" and b is "-3"
    When I sum up a and b
    Then I get "2"