package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.cp_008Page;
import static org.junit.Assert.assertTrue;

public class cp_008Steps {
    cp_008Page excelPage = new cp_008Page();

    @Given("el Excel está abierto")
    public void el_Excel_está_abierto() {
        excelPage.openExcel();
    }

    @When("verifico la existencia de la columna 'IVA exento'")
    public void verifico_la_existencia_de_la_columna_IVA_exento() {
        assertTrue(excelPage.isColumnPresent("IVA exento"));
    }

    @Then("la columna 'IVA exento' debe estar presente")
    public void la_columna_IVA_exento_debe_estar_presente() {
        // Validación realizada
    }

    @When("verifico la existencia de la columna 'IVA retenido' e ingreso datos de prueba")
    public void verifico_la_existencia_de_la_columna_IVA_retenido_e_ingreso_datos_de_prueba() {
        assertTrue(excelPage.isColumnPresent("IVA retenido"));
        excelPage.enterTestData("IVA retenido");
    }

    @Then("ambas columnas deben mostrar los montos correspondientes a IVA exento y retenido")
    public void ambas_columnas_deben_mostrar_los_montos_correspondientes_a_IVA_exento_y_retenido() {
        assertTrue(excelPage.verifyTestData("IVA exento"));
        assertTrue(excelPage.verifyTestData("IVA retenido"));
    }
}