package emailpages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EmailPopup extends AbstractPage{

    private By saveAsDraftAndCloseButton = By.xpath("//span[text()='Сохранить и перейти']");
    private By notSaveButton = By.xpath("//span[text()='Не сохранять']");
    private By cancelButton = By.xpath("//span[text()='Отмена']");

    public void closeEmailAndSaveAsDraft(){
        driver.findElement(saveAsDraftAndCloseButton).click();
    }

}
