package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.cp_003Page;
import static org.junit.Assert.assertEquals;

public class cp_003Steps {

    WebDriver driver;
    cp_003Page page;

    @Given("el usuario está en la página que contiene la tabla")
    public void el_usuario_está_en_la_página_que_contiene_la_tabla() {
        driver = Hooks.getDriver();
        page = new cp_003Page(driver);
        driver.get("URL_DE_LA_PÁGINA_CON_LA_TABLA");
    }

    @When("se revisa la posición inmediatamente a la derecha de la columna 'I'")
    public void se_revisa_la_posición_inmediatamente_a_la_derecha_de_la_columna_I() {
        page.verifyColumnPosition('I');
    }

    @Then("se debe encontrar una nueva columna con el encabezado 'Estado Código'")
    public void se_debe_encontrar_una_nueva_columna_con_el_encabezado_Estado_Código() {
        String header = page.getNewColumnHeader();
        assertEquals("Estado Código", header);
    }
}