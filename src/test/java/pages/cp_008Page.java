package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cp_008Page {
    WebDriver driver;

    public cp_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openExcel() {
        // Lógica para abrir el archivo de Excel
    }

    public boolean isColumnPresent(String columnName) {
        // Lógica para verificar si una columna está presente en el Excel
        WebElement columnHeader = driver.findElement(By.xpath("//th[contains(text(), '" + columnName + "')]"));
        return columnHeader.isDisplayed();
    }

    public void enterTestData(String columnName) {
        // Lógica para ingresar datos de prueba en la columna dada
        WebElement columnCell = driver.findElement(By.xpath("//td[contains(text(), '" + columnName + "')]"));
        columnCell.click();
        // Puedes agregar más pasos para ingresar datos
    }

    public boolean verifyTestData(String columnName) {
        // Lógica para verificar que los datos de prueba están presentes
        WebElement columnData = driver.findElement(By.xpath("//td[contains(text(), '" + columnName + "')]"));
        return columnData.isDisplayed() && !columnData.getText().isEmpty();
    }
}