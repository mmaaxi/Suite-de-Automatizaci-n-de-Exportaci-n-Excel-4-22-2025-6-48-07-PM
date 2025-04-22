package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.cp_005Page;

public class cp_005Steps {

    WebDriver driver;
    cp_005Page page;

    public cp_005Steps() {
        this.driver = Hooks.driver;
        page = PageFactory.initElements(driver, cp_005Page.class);
    }

    @Given("el usuario está en la página de reservas")
    public void el_usuario_esta_en_la_pagina_de_reservas() {
        page.navigateToReservaPage();
    }

    @When("el usuario verifica que la columna 'Monto acumulado Folio Reserva 5401' está a la derecha de la columna 'Monto (reserva)'")
    public void el_usuario_verifica_columna_monto() {
        boolean isRight = page.isMontoAcumuladoColumnaALaDerecha();
        Assert.assertTrue("La columna 'Monto acumulado Folio Reserva 5401' no está a la derecha de la columna 'Monto (reserva)'", isRight);
    }

    @Then("la columna 'Monto acumulado Folio Reserva 5401' aparece con el título correcto")
    public void la_columna_esta_con_titulo_correcto() {
        String expectedTitle = "Monto acumulado Folio Reserva 5401";
        String actualTitle = page.getTituloDeLaColumnaAcumulada();
        Assert.assertEquals("El título de la columna no es el esperado", expectedTitle, actualTitle);
    }

    @When("el usuario verifica la fórmula de suma acumulada en la columna 'Monto acumulado Folio Reserva 5401'")
    public void el_usuario_verifica_formula_acumulada() {
        boolean isFormulaCorrect = page.checkSumaAcumuladaFormula();
        Assert.assertTrue("La fórmula de suma acumulada no es correcta", isFormulaCorrect);
    }

    @Then("el valor de cada fila refleja la suma acumulada esperada")
    public void el_valor_refleja_suma_acumulada() {
        boolean isSumaCorrecta = page.verificaSumaAcumuladaEnFilas();
        Assert.assertTrue("El valor de la fila no refleja la suma acumulada esperada", isSumaCorrecta);
    }
}