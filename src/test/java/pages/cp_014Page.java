package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ExcelUtil;

public class cp_014Page {

    WebDriver driver;

    By ivaAcumuladoColumn = By.xpath("//YourXPathHere");

    public cp_014Page(WebDriver driver) {
        this.driver = driver;
    }

    public void abrirArchivoExcel() {
        ExcelUtil.openExcel("path/to/excel/file.xlsx");
    }

    public void seleccionarColumnaIVA() {
        WebElement column = driver.findElement(ivaAcumuladoColumn);
        column.click();
    }

    public boolean esColumnaSeleccionadaCorrectamente() {
        // Implement logic to verify if the column is selected correctly
        return true; // Placeholder
    }

    public boolean verificarFormulaIVA() {
        // Implement logic to verify the correct formula in the column
        return ExcelUtil.verifyIVACalculationFormula("IVA Acumulado");
    }

    public double obtenerResultadoEsperado() {
        // Return the expected result for comparison
        return ExcelUtil.calculateExpectedIVA("path/to/excel/file.xlsx");
    }

    public double obtenerCalculoIVA() {
        // Extract and return the actual calculated IVA from Excel
        return ExcelUtil.extractActualIVA("path/to/excel/file.xlsx");
    }
}