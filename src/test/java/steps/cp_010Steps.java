package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.cp_010Page;

public class cp_010Steps {

    WebDriver driver;
    cp_010Page page;

    public cp_010Steps() {
        // Assuming WebDriver initialization is handled elsewhere
        page = new cp_010Page(driver);
    }

    @Given("I am on the page with the column headers")
    public void iAmOnThePageWithTheColumnHeaders() {
        driver.get("URL_of_the_page_with_the_table");
    }

    @When("I check the column immediately to the right of 'Ramo'")
    public void iCheckTheColumnImmediatelyToTheRightOfRamo() {
        // This step may internally call a method to verify the position
    }

    @Then("I should see a column titled 'Folio Pre solicitud' in that position")
    public void iShouldSeeAColumnTitledFolioPreSolicitudInThatPosition() {
        Assert.assertTrue(page.isFolioPreSolicitudColumnInPosition());
    }

    @Then("the column should have no data or null values")
    public void theColumnShouldHaveNoDataOrNullValues() {
        Assert.assertTrue(page.isFolioPreSolicitudColumnEmpty());
    }
}