package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.cp_007Page;
import org.junit.Assert;

public class cp_007Steps {
    cp_007Page page = new cp_007Page();

    @Given("El archivo Excel es exportado desde el sistema")
    public void el_archivo_excel_es_exportado_desde_el_sistema() {
        page.exportExcelFromSystem();
    }

    @When("Busco la columna titulada 'IVA 0%'")
    public void busco_la_columna_titulada_iva_0() {
        page.searchForColumnTitle("IVA 0%");
    }

    @Then("La columna 'IVA 0%' debería aparecer en la posición indicada")
    public void la_columna_iva_0_deberia_aparecer_en_la_posicion_indicada() {
        Assert.assertTrue(page.isColumnPresent("IVA 0%"));
    }

    @Given("La columna 'IVA 0%' está presente en el archivo Excel")
    public void la_columna_iva_0_esta_presente_en_el_archivo_excel() {
        Assert.assertTrue(page.isColumnPresent("IVA 0%"));
    }

    @When("Verifico los montos en la columna")
    public void verifico_los_montos_en_la_columna() {
        page.verifyDataInColumn();
    }

    @Then("Debería ver únicamente montos con tasa 0%")
    public void deberia_ver_unicamente_montos_con_tasa_0_por_ciento() {
        Assert.assertTrue(page.verifyAmountsWithZeroTax());
    }
}