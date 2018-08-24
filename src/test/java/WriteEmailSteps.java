import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import emailpages.*;
import org.junit.Assert;

/**
 * Created by X240 on 8/23/2018.
 */
public class WriteEmailSteps {


    @Given("^Sign in in mail with user name (.+@.+\\..+) and (.*)$")
    public void signInInMailWithUserNameAlinaBlazhkoYandexRuAndGfhjkmkzntcnf(String email, String pwd) throws Throwable {
       new HomePage().open().openLoginPage();
       new LoginPage().login(email, pwd);
    }

    @When("^Open new email$")
    public void openNewEmail() throws Throwable {
        new Header().openNewEmail();
    }

    @And("^Write recipient (.+@.+\\..+), subject (.*) and body (.*)$")
    public void writeRecipientRecipientSubjectSubjectAndBodyBody(String recipient, String subject,
                                                                 String body) throws Throwable {
        new EmailPage().writeEmail(recipient, subject, body).closeEmail();
    }

    @And("^Close email$")
    public void closeEmail() throws Throwable {
        new EmailPopup().closeEmailAndSaveAsDraft();
    }

    @And("^Choose close and save as draft button$")
    public void chooseCloseAndSaveAsDraftButton() throws Throwable {
        new LeftSection().openDraftFolder();
    }

    @And("^Open draft folder$")
    public void openDraftFolder() throws Throwable {
        new LeftSection().openDraftFolder();
    }

    @Then("^assert that draft is visible$")
    public void assertThatDraftIsVisible() throws Throwable {
        new Header().refreshPage();
        Assert.assertTrue(new LeftSection().rightCountOfEmail());
    }
}
