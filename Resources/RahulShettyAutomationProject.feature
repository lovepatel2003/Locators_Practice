#@FeatureTags
Feature: Rahul Shetty Automation Project
# @ScenarioTags
  Scenario: Checking radio button
    Given Open Rahul Shetty Website
    When Click on Radio button
    Then Validate that the radio button is selected

  Scenario: Checking dropdown menu
    Given Open Rahul Shetty Website
    When Click on dropdown menu
    Then save the dropdown menu options in a list
    And click on second element