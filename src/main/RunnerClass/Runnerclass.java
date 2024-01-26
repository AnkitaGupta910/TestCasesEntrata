import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utils.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps"
)
public class TestRunner {

    @BeforeClass
    public static void setUp() {
        // Any setup code if needed
    }

    @AfterClass
    public static void tearDown() {
        WebDriverManager.quitWebDriver();
    }
}