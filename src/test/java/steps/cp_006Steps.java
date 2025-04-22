package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.cp_006Page;
import static org.junit.Assert.assertEquals;

public class cp_006Steps {
    WebDriver driver;
    cp_006Page page;

    @Given("^el usuario está en la página con la tabla de datos$")
    public void el_usuario_está_en_la_página_con_la_tabla_de_datos() {
        driver = new ChromeDriver();
        driver.get("URL_DE_LA_PAGINA"); // Reemplazar con la URL correcta
        page = new cp_006Page(driver);
    }

    @When("^el usuario ubica la columna 'Monto Acumulado Folio OPC'$")
    public void el_usuario_ubica_la_columna_Monto_Acumulado_Folio_OPC() {
        // Lógica para ubicar la columna en la interfaz, si es necesario
    }

    @Then("^la cabecera de la columna debe ser 'Monto Acumulado Folio OPC \\(2121\\)'$")
    public void la_cabecera_de_la_columna_debe_ser_Monto_Acumulado_Folio_OPC_2121() {
        String actualHeader = page.obtenerTextoCabeceraColumna();
        assertEquals("Monto Acumulado Folio OPC (2121)", actualHeader);
        driver.quit();
    }
}