package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.cp_014Page;

public class cp_014Steps {

    cp_014Page ivaPage = new cp_014Page();

    @Given("^el archivo Excel exportado está abierto$")
    public void el_archivo_Excel_exportado_está_abierto() {
        ivaPage.abrirArchivoExcel();
    }

    @When("^selecciono la columna 'IVA Acumulado'$")
    public void selecciono_la_columna_IVA_Acumulado() {
        ivaPage.seleccionarColumnaIVA();
    }

    @Then("^la columna es seleccionada correctamente$")
    public void la_columna_es_seleccionada_correctamente() {
        Assert.assertTrue(ivaPage.esColumnaSeleccionadaCorrectamente());
    }

    @Then("^verifico que la fórmula sume los montos de 'IVA 16%', 'IVA FRONTERIZO', 'IVA 0 %' e 'IVA EXENTO', excluyendo 'IVA retenido'$")
    public void verifico_que_la_fórmula_sumolos_montos() {
        Assert.assertTrue(ivaPage.verificarFormulaIVA());
    }

    @Then("^el cálculo refleja la suma correcta de los IVAs indicados$")
    public void el_cálculo_refleja_la_suma_correcta_de_los_IVAs_indicados() {
        Assert.assertEquals(ivaPage.obtenerResultadoEsperado(), ivaPage.obtenerCalculoIVA());
    }
}