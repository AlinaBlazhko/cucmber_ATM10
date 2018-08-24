import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import emailpages.*;

/**
 * Created by X240 on 8/24/2018.
 */
public class SendingEmailSteps {
    @Given("^Write letter and saved as draft$")
    public void writeLetterAndSavedAsDraft() throws Throwable {
        new HomePage().open().openLoginPage();
        new LoginPage().login("alinaBlazhko@yandex.ru", "gfhjkmkzntcnf");
        new Header().openNewEmail();
        new EmailPage().writeEmail("alinaBlazhko@yandex.ru", "Email for test", "Hello Mr. Smith!").closeEmail();
        new EmailPopup().closeEmailAndSaveAsDraft();
    }

    @And("^Open the letter in drafts$")
    public void openTheLetterInDrafts() throws Throwable {
        new LeftSection().openDraftFolder();
        new CenterPart().openDraftEmail();
    }

    @When("^Click send email button$")
    public void clickSendEmailButton() throws Throwable {
        new EmailPage().sentEmail();
    }

    @And("^Open sent folder$")
    public void openSentFolder() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Emil exist in sent folder$")
    public void emilExistInSentFolder() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
