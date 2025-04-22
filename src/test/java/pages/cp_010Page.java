package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cp_010Page {

    private WebDriver driver;
    private By ramoColumnHeader = By.xpath("//th[contains(text(), 'Ramo')]");
    private By folioPreSolicitudColumnHeader = By.xpath("//th[contains(text(), 'Folio Pre solicitud')]");
    private By folioPreSolicitudColumnData = By.xpath("//td[preceding-sibling::td[contains(text(), 'Ramo')]]");

    public cp_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isFolioPreSolicitudColumnInPosition() {
        WebElement ramoHeader = driver.findElement(ramoColumnHeader);
        WebElement folioPreSolicitudHeader = ramoHeader.findElement(By.xpath("following-sibling::th[1]"));
        return folioPreSolicitudHeader.getText().equals("Folio Pre solicitud");
    }

    public boolean isFolioPreSolicitudColumnEmpty() {
        for (WebElement cell : driver.findElements(folioPreSolicitudColumnData)) {
            if (!cell.getText().isEmpty() && !cell.getText().equalsIgnoreCase("null")) {
                return false;
            }
        }
        return true;
    }
}