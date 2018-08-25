Feature: write new email and send

  Background: open driver

  Scenario:
    Given Sign in in mail with user name alinaBlazhko@yandex.ru and gfhjkmkzntcnf
    And Open new email
    When Write email recipient alinaBlazhko@yandex.ru, subject Email for test and body Hello Mr. Smith!
    And send email
    And Open sent folder
    Then Emil exist in sent folder


