Feature: write new email

  Background: open driver

  Scenario:
    Given Write letter and saved as draft
    And Open the letter in drafts
    When Click send email button
    And Open sent folder
    Then Emil exist in sent folder


