package emailpages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.refresh;

public class LoginPage extends AbstractPage{

    private By login = By.name("login");
    private By password = By.name("passwd");
    private By submit = By.cssSelector("span.passport-Button-Text");
    private By errorMessage = By.cssSelector("div.passport-Domik-Form-Error");

   public void login(String user, String pwd){
       waitForElementVisible(login);
       driver.findElement(login).sendKeys(user);
       driver.findElement(password).sendKeys(pwd);
       driver.findElement(submit).click();
   }

    public boolean isTitleRight(String title){
       waitForElementVisible(By.cssSelector("span.mail-User-Avatar_header.js-user-picture"));
       return driver.getTitle().equals(title);
    }

    public boolean isErrorMessageCorrect(String message){
        waitForElementVisible(errorMessage);
        return driver.findElement(errorMessage).getText().equals(message);
    }
}
