package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.cp_009Page;
import static org.junit.Assert.assertTrue;

public class cp_009Steps {
    WebDriver driver;
    cp_009Page page = new cp_009Page(driver);

    @Given("que el usuario ha exportado el archivo Excel correcto")
    public void exportExcelFile() {
        // Implementación de exportación del archivo
    }
    
    @When("el usuario localiza la celda correspondiente al movimiento 'pago'")
    public void locatePaymentCell() {
        assertTrue(page.locatePaymentCell());
    }
    
    @Then("la celda es identificada correctamente")
    public void verifyCellIdentified() {
        assertTrue(page.isCellIdentifiedCorrectly());
    }
    
    @When("el usuario aplica la fórmula =Z4+AD5+AE5+AH5+AC5+AB5+AM5 e ingresa datos de prueba")
    public void applyFormulaAndEnterTestData() {
        page.applyFormulaAndEnterData();
    }
    
    @Then("el resultado de la suma es correcto y coincide con el cálculo manual")
    public void verifySumCorrect() {
        assertTrue(page.isSumCorrect());
    }
}