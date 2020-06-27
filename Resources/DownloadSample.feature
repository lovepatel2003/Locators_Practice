#@FeatureTags
Feature: Download Functionality
# @ScenarioTags
  Scenario: Check download option
    Given go to selenium website
    When Click on Windows ID Download
    Then Validate if Windows ID Download is clicked

  Scenario Outline: Test sign in in Gmail
    Given go to gmail login webpage
    When enter <email> and <password> to sign in
    Then validate the confirmation message
    Examples:
      | email                    | password       |
      | lovepatel200396@gmailcom | sjahdfjhdsbfds |