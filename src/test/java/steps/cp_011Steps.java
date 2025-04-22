package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.cp_011Page;

import static org.junit.Assert.assertTrue;

public class cp_011Steps {
    WebDriver driver;
    cp_011Page page;

    @Given("I am on the application page")
    public void i_am_on_the_application_page() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("URL of the application page");
        page = new cp_011Page(driver);
    }

    @When("I check the table headers")
    public void i_check_the_table_headers() {
        // The page object method will perform the check
    }

    @Then("I should see a column 'Folio de Pago' to the right of 'Folio Pre solicitud'")
    public void i_should_see_a_column_folio_de_pago_to_the_right_of_folio_pre_solicitud() {
        assertTrue(page.isFolioDePagoColumnPositionedCorrectly());
    }

    @Then("the 'Folio de Pago' column should be empty")
    public void the_folio_de_pago_column_should_be_empty() {
        assertTrue(page.isFolioDePagoColumnEmpty());
        driver.quit();
    }
}