import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import emailpages.EmailPage;
import emailpages.HomePage;
import emailpages.LeftSection;
import emailpages.LoginPage;
import org.junit.Assert;

/**
 * Created by X240 on 8/25/2018.
 */
public class SendingEmailSteps {

    @And("^Open sent folder$")
    public void openSentFolder() throws Throwable {
        new LeftSection().openSentFolder();
    }

    @Then("^Emil exist in sent folder$")
    public void emilExistInSentFolder() throws Throwable {
        Assert.assertTrue(new LeftSection().rightCountOfEmail());
    }

    @And("^send email$")
    public void sendEmail() throws Throwable {
        new EmailPage().sentEmail();
    }

    @When("^Write email recipient (.*), subject (.*) and body (.*)$")
    public void writeEmailRecipientAlinaBlazhkoYandexRuSubjectEmailForTestAndBodyHelloMrSmith(String recipient,
                                                                                              String subject,
                                                                                              String body) throws Throwable {
        new EmailPage().writeEmail(recipient, subject, body);
    }
}
