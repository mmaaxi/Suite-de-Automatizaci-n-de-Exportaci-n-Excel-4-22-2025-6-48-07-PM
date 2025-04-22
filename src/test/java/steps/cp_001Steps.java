package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.cp_001Page;

import static org.junit.Assert.*;

public class cp_001Steps {
    WebDriver driver = new ChromeDriver();
    cp_001Page reportPage = new cp_001Page(driver);
    
    @Given("el usuario está en el módulo de Canned Reports > Module Claim > Report Code > Claim Accounting Report")
    public void el_usuario_esta_en_el_modulo_de_canned_reports() {
        reportPage.navigateToClaimAccountingReport();
    }
    
    @When("el usuario ejecuta el flujo Submit > View Log > Agregar Folio > Descargar archivo de excel")
    public void el_usuario_ejecuta_el_flujo_de_descarga() {
        reportPage.submitAndDownloadExcel();
    }
    
    @Then("el archivo Excel se descarga correctamente y presenta las modificaciones definidas")
    public void el_archivo_excel_se_descarga_correctamente() {
        assertTrue(reportPage.isExcelDownloadedWithModifications());
    }

    @Then("el Excel muestra las modificaciones definidas en la historia de usuario")
    public void el_excel_muestra_las_modificaciones() {
        assertTrue(reportPage.verifyExcelModifications());
    }
}