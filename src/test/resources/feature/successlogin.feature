Feature: Login success
  Try login with right username and password

  Background: open driver

  Scenario: login with different credentials
    Given I open home page and navigate to login page
    When type alinaBlazhko@yandex.ru and gfhjkmkzntcnf
    Then page title should be equals Входящие — Яндекс.Почта



