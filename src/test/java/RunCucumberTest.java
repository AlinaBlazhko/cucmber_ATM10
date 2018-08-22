import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by X240 on 8/21/2018.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features="src/test/resources/feature/failedlogin.feature",
        plugin = {
                "pretty", "json:target/Cucumber.json",
                "html:target/cucumber-html-report"
        })
public class RunCucumberTest {
}