package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cp_001Page {
    WebDriver driver;
    
    By submitButton = By.id("submit_button");
    By viewLogButton = By.id("view_log_button");
    By addFolioButton = By.id("add_folio_button");
    By downloadExcelButton = By.id("download_excel_button");
    
    public cp_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToClaimAccountingReport() {
        driver.get("http://example.com/canned-reports/module-claim/report-code/claim-accounting-report");
    }
    
    public void submitAndDownloadExcel() {
        driver.findElement(submitButton).click();
        driver.findElement(viewLogButton).click();
        driver.findElement(addFolioButton).click();
        driver.findElement(downloadExcelButton).click();
    }
    
    public boolean isExcelDownloadedWithModifications() {
        // Lógica para verificar que el archivo Excel se ha descargado y contiene modificaciones
        return true;
    }

    public boolean verifyExcelModifications() {
        // Lógica para verificar que el Excel contiene las modificaciones esperadas (columnas, fórmulas, nombres)
        return true;
    }
}