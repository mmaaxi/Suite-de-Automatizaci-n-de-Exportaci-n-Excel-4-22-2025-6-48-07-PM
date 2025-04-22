package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cp_003Page {
    private WebDriver driver;

    public cp_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyColumnPosition(char column) {
        // Lógica para encontrar la posición inmediatamente a la derecha de la columna 'I'
        // Podría implicar obtener la posición de la columna 'I' y acceder a la siguiente
    }

    public String getNewColumnHeader() {
        WebElement newColumnHeader = driver.findElement(By.xpath("//th[@id='header-of-new-column']"));
        return newColumnHeader.getText();
    }
}