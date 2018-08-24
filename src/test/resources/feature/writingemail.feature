Feature: write new email

  Background: open driver

  Scenario Outline:
    Given Sign in in mail with user name alinaBlazhko@yandex.ru and gfhjkmkzntcnf
    When Open new email
    And Write recipient <recipient>, subject <subject> and body <body>
    And Close email
    And Choose close and save as draft button
    And Open draft folder
    Then assert that draft is visible

    Examples:
      | recipient              | subject        | body             |
      | alinaBlazhko@yandex.ru | Email for test | Hello Mr. Smith! |

