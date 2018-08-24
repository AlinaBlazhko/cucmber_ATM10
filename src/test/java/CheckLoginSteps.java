import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import emailpages.HomePage;
import emailpages.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


/**
 * Created by X240 on 8/21/2018.
 */
public class CheckLoginSteps {

    WebDriver driver;
    private HomePage homePage = new HomePage();
    private LoginPage login = new LoginPage();

    @Given("^I open home page and navigate to login page$")
    public void iOpenHomePageAndNavigateToLoginPage() throws Throwable {
        homePage.open().openLoginPage();
    }


    @When("^type (.*) and (.*)$")
    public void typeUsernameAndPassword(String user, String password) throws Throwable {
        login.login(user, password);
    }

    @Then("^page title should be equals (.*)$")
    public void pageTitleShouldBeEqualsTitle(String title) throws Throwable {
        Assert.assertTrue(login.isTitleRight(title));
    }

    @When("^(.*) or (.*) should be incorrect$")
    public void usernameOrPasswordShouldBeIncorrect(String user, String password) throws Throwable {
        login.login(user, password);
    }


    @Then("^Error message should be equals (.*)$")
    public void errorMessageShouldBeEqualsMessage(String message) throws Throwable {
        Assert.assertTrue(login.isErrorMessageCorrect(message));
    }
}
