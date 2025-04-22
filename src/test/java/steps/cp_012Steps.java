package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.cp_012Page;

public class cp_012Steps {

    cp_012Page excelPage = new cp_012Page();

    @Given("^El documento Excel está abierto$")
    public void elDocumentoExcelEstaAbierto() {
        excelPage.openExcelDocument();
    }

    @When("^Busco la columna 'Fecha de Pago'$")
    public void buscoLaColumnaFechaDePago() {
        excelPage.locateFechaDePagoColumn();
    }

    @Then("^La columna 'Fecha de Pago' debería existir$")
    public void laColumnaFechaDePagoDeberiaExistir() {
        Assert.assertTrue(excelPage.isFechaDePagoColumnPresent());
    }

    @When("^Verifico la columna que está a la derecha de 'Fecha de Pago'$")
    public void verificoLaColumnaALaDerechaDeFechaDePago() {
        excelPage.verifyStatusPagoCodigoColumn();
    }

    @Then("^La columna 'Status Pago Código' debería mostrarse en la posición correcta sin datos$")
    public void laColumnaStatusPagoCodigoDeberiaMostrarseEnLaPosicionCorrectaSinDatos() {
        Assert.assertTrue(excelPage.isStatusPagoCodigoColumnCorrectlyPositioned());
    }
}