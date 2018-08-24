Feature: Login faild
  Try login with incorrect username and password

  Background: open driver

  Scenario Outline: login with different credentials
    Given I open home page and navigate to login page
    When <username> or <password> should be incorrect
    Then Error message should be equals <message>

    Examples:
      | username  | password     | message|
      | Blazhko   | gfhjkmkzntcnf|Неверный пароль|
      | 123       | 1263         |Такого аккаунта нет|