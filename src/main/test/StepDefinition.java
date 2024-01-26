// StepDefinitions.java

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {

    private WebDriver driver;

    @Given("I open the entrata careers website")
    public void iOpenTheEntrataCareersWebsite() {
        driver = WebDriverManager.getWebDriver();
        driver.get("https://www.entrata.in/careers/");
    }

    @When("I navigate to the Job Openings page")
    public void iNavigateToTheJobOpeningsPage() {

    }

    @Then("the title should be {string}")
    public void theTitleShouldBe(String expectedTitle) {

    }


}
