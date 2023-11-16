Feature: Api Demos Test

  Background:
    Given The user is on the start page

  Scenario: Scenario_1
    When The user swipes and clicks "Views"
    And The user clicks "Controls"
    And The user clicks "01. Light Theme"
    And The user sends "Controls" to InputBox
    And The user clicks "Checkbox 1"
    Then Verify that Checkbox checked
    And The user clicks "RadioButton 1"
    Then Verify that RadioButton checked
    And The user swipes and clicks "Star"
    Then Verify that Star checked
    And The user swipes and clicks "OFF"
    Then Verify that first OFF checked
    And Verify that second OFF checked
    And The user clicks "Mercury"
    And The user clicks "Mars"

  Scenario: Scenario_2
    When The user swipes and clicks "Views"
    And The user clicks "Expandable Lists"
    And The user clicks "1. Custom Adapter"
    And The user clicks "People Names"
    Then Verify that four person names are visible
    And The user clicks "People Names"
    Then Verify that four person names are invisible
    When The user clicks "Fish Names"
    Then Verify that second fish name is "Bubbles"

  Scenario: Scenario_3
    When The user choose a random number between 10 and 20
    And The user swipes and clicks "Views"
    And The user swipes and clicks "TextSwitcher"
    And The user clicks Next until selected number
    And The user navigates back



