package emailpages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends AbstractPage{

    private By loginButton = By.cssSelector(".HeadBanner-ButtonsWrapper a.HeadBanner-Button-Enter");

    public void openLoginPage(){
        waitForElementVisible(loginButton);
        driver.findElement(loginButton).click();
    }

    public HomePage open() {
        driver.get("https://mail.yandex.ru/");
        return this;
    }
}
