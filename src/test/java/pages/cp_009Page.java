package pages;

import org.openqa.selenium.WebDriver;
import org.apache.poi.ss.usermodel.*;

public class cp_009Page {
    WebDriver driver;
    Workbook workbook;
    Sheet sheet;
    Cell paymentCell;
    
    public cp_009Page(WebDriver driver) {
        this.driver = driver;
        // Inicializar el workbook y sheet desde el archivo Excel exportado
    }
    
    public boolean locatePaymentCell() {
        // Implementación para localizar la celda con el movimiento 'pago'
        paymentCell = sheet.getRow(1).getCell(2); // Ejemplo de ubicación
        return paymentCell != null;
    }
    
    public boolean isCellIdentifiedCorrectly() {
        // Verificar si la celda localizada es la correcta
        return "pago".equals(paymentCell.getStringCellValue());
    }
    
    public void applyFormulaAndEnterData() {
        // Aplicar la fórmula y agregar datos de prueba a las celdas requeridas
        // Ejemplo de ingreso de datos: 
        sheet.getRow(3).getCell(25).setCellValue(10); // Z4
        sheet.getRow(4).getCell(29).setCellValue(20); // AD5
        // Otros valores...
        
        // Aplicar fórmula en la celda objetivo
        String formula = "Z4+AD5+AE5+AH5+AC5+AB5+AM5";
        paymentCell.setCellFormula(formula);
    }
    
    public boolean isSumCorrect() {
        // Evaluar la fórmula y verificar el resultado
        FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
        double sumResult = evaluator.evaluate(paymentCell).getNumberValue();
        double expectedSum = 70; // Cálculo manual de 10 + 20 + otros valores ficticios
        return sumResult == expectedSum;
    }
}