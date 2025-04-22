package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import setup.DriverSetup;

public class cp_013Page {
    private WebDriver driver;

    public cp_013Page() {
        this.driver = DriverSetup.getDriver();
    }

    public void openPage() {
        driver.get("http://url-del-sistema.com/listado");
    }

    public boolean verifyOriginalColumnExists() {
        WebElement originalColumn = driver.findElement(By.xpath("//th[text()='Status de Pago']"));
        return originalColumn != null;
    }

    public boolean verifyOriginalDataPresent() {
        WebElement columnData = driver.findElement(By.xpath("//td[contains(@class, 'status-pago-data')]"));
        return columnData != null && !columnData.getText().isEmpty();
    }

    public boolean verifyColumnNameUpdated() {
        WebElement updatedColumn = driver.findElement(By.xpath("//th[text()='Descripción Status Pago']"));
        return updatedColumn != null;
    }

    public boolean verifyUpdatedPosition() {
        WebElement column = driver.findElement(By.xpath("//th[text()='Descripción Status Pago']"));
        // Example to check position: using table headers
        return column.getLocation().getX() == expectedPositionX;
    }
    
    private int expectedPositionX = 200; // Set as per requirement
}