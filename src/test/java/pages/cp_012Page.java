package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cp_012Page {

    WebDriver driver;
    WebElement fechaDePagoColumn;
    WebElement statusPagoCodigoColumn;

    public cp_012Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openExcelDocument() {
        // Implementar la lógica para abrir el documento Excel.
    }

    public void locateFechaDePagoColumn() {
        // Implementar la lógica para ubicar la columna 'Fecha de Pago' (Columna AW).
        fechaDePagoColumn = driver.findElement(By.xpath("//th[text()='Fecha de Pago']"));
    }

    public boolean isFechaDePagoColumnPresent() {
        return fechaDePagoColumn != null;
    }

    public void verifyStatusPagoCodigoColumn() {
        // Implementar la lógica para verificar si la columna 'Status Pago Código' está a la derecha de 'Fecha de Pago'.
        statusPagoCodigoColumn = fechaDePagoColumn.findElement(By.xpath("following-sibling::th[1][text()='Status Pago Código']"));
    }

    public boolean isStatusPagoCodigoColumnCorrectlyPositioned() {
        return statusPagoCodigoColumn != null && statusPagoCodigoColumn.getText().isEmpty();
    }
}