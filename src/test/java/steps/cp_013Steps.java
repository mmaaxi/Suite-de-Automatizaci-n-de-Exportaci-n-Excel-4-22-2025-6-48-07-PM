package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.cp_013Page;
import org.junit.Assert;

public class cp_013Steps {
    cp_013Page page = new cp_013Page();

    @Given("la página de listado se muestra")
    public void laPaginaDeListadoSeMuestra() {
        page.openPage();
    }

    @When("identifico la columna originalmente denominada 'Status de Pago'")
    public void identificoLaColumnaOriginalmenteDenominadaStatusDePago() {
        Assert.assertTrue(page.verifyOriginalColumnExists());
    }

    @Then("la columna es localizada con los datos previos")
    public void laColumnaEsLocalizadaConLosDatosPrevios() {
        Assert.assertTrue(page.verifyOriginalDataPresent());
    }

    @When("verifico que el nombre se haya actualizado a 'Descripción Status Pago'")
    public void verificoQueElNombreSeHayaActualizadoADescripcionStatusPago() {
        Assert.assertTrue(page.verifyColumnNameUpdated());
    }

    @Then("el encabezado muestra 'Descripción Status Pago' y aparece en la posición indicada")
    public void elEncabezadoMuestraDescripcionStatusPagoY_ApareceEnLaPosicionIndicada() {
        Assert.assertTrue(page.verifyUpdatedPosition());
    }
}