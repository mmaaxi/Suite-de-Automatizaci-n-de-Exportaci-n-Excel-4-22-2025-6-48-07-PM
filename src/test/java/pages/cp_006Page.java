package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cp_006Page {
    WebDriver driver;

    // Localizador para la cabecera de la columna específica
    By columnaCabecera = By.xpath("//th[contains(text(), 'Monto Acumulado Folio OPC')]");

    public cp_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public String obtenerTextoCabeceraColumna() {
        WebElement headerElement = driver.findElement(columnaCabecera);
        return headerElement.getText();
    }
}