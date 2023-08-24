Feature: Open page

  Scenario: Open text box page
    Given open text-box page
    When "User input words to$
    And User click button
    Then close window

Feature: WebDriverUpload


  Scenario:Download page
    Given Download page
    When upload mp3
    Then Exit browser


