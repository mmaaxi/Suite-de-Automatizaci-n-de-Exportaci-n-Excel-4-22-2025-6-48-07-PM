package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CP004Page;
import static org.junit.Assert.assertTrue;

public class CP004Steps {
    CP004Page cp004Page = new CP004Page();

    @Given("El usuario ha exportado un archivo Excel existente con la columna 'estado'")
    public void elUsuarioHaExportadoUnArchivoExcelExistenteConLaColumnaEstado() {
        // Código para exportar el archivo Excel y asegurarse de que está listo para su uso
        cp004Page.exportExcelFile();
    }

    @When("Identifico la columna 'estado' en el archivo Excel exportado")
    public void identificoLaColumnaEstadoEnElArchivoExcelExportado() {
        // Código para identificar la columna en el archivo Excel
        cp004Page.identifyStatusColumn();
    }

    @Then("La columna 'estado' presenta datos previos antes de la actualización")
    public void laColumnaEstadoPresentaDatosPreviosAntesDeLaActualizacion() {
        // Verificación de que la columna 'estado' tiene los datos previos
        assertTrue(cp004Page.checkInitialStatusData());
    }

    @When("Verifico los valores y formato en la columna 'estado'")
    public void verificoLosValoresYFormatoEnLaColumnaEstado() {
        // Código para verificar los valores y formato de la columna
        cp004Page.verifyUpdatedStatusData();
    }

    @Then("La columna 'estado' muestra la actualización correcta en valores y formato")
    public void laColumnaEstadoMuestraLaActualizacionCorrectaEnValoresYFormato() {
        // Asegurarse de que la actualización es la esperada
        assertTrue(cp004Page.checkUpdatedStatusCorrectly());
    }
}