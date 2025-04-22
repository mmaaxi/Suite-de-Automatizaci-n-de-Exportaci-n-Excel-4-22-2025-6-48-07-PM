package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cp_011Page {
    private WebDriver driver;

    private By folioPreSolicitudColumn = By.xpath("//th[contains(text(), 'Folio Pre solicitud')]");
    private By folioDePagoColumn = By.xpath("//th[contains(text(), 'Folio de Pago')]");
    private By folioDePagoColumnData = By.xpath("//td[count(//th[contains(text(), 'Folio de Pago')]/preceding-sibling::th)+1]");

    public cp_011Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isFolioDePagoColumnPositionedCorrectly() {
        return driver.findElement(folioPreSolicitudColumn).findElement(By.xpath("following-sibling::th")).equals(driver.findElement(folioDePagoColumn));
    }

    public boolean isFolioDePagoColumnEmpty() {
        return driver.findElements(folioDePagoColumnData).stream().allMatch(e -> e.getText().isEmpty());
    }
}