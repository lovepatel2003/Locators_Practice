#@FeatureTags
Feature: Rahul Shetty Automation Project
# @ScenarioTags
  Scenario: Checking radio button
    Given Open Rahul Shetty Website
    When Click on Radio button
    Then Validate that the radio button is selected

  Scenario: Search countries to select country
    Given Open Rahul Shetty Website
    When Click on select countries searchbar
    Then Search Cana
    And Click Canada

  Scenario: Checking dropdown menu
    Given Open Rahul Shetty Website
    When Click on dropdown menu
    Then save the dropdown menu options in a list
    And click on second element

  Scenario: Checkbox
    Given Open Rahul Shetty Website
    When Click on Checkbox
    Then Validate that the Checkbox is checked

  Scenario: Open new window of the browser
    Given Open Rahul Shetty Website
    When Click on Open Window button
    Then validate the new window is opened

  Scenario: Open new tab in the browser
    Given Open Rahul Shetty Website
    When Click on Open tab
    Then validate the new tab is opened

  Scenario: Open new tab in the browser
    Given Open Rahul Shetty Website
    When Click on Enter your name textfield
    Then Enter Love Patel
    And Click on Alert
    And Click on Ok
    And Click on Confirm
    And Click on Ok
    And Click on Confirm
    And Click on Cancel

  Scenario: Check Upload option
    Given Oepn Guru upload website demo
    When Click on file upload button and pass the filepath
    Then Check terms and conditions checkbox and click submit
    And validate success message