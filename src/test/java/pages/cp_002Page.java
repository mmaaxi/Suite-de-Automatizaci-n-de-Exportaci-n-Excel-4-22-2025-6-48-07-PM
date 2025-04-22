package pages;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class cp_002Page {

    private Sheet sheet;

    public void loadExcelFile() throws IOException {
        FileInputStream file = new FileInputStream(new File("path_to_exported_excel_file.xlsx"));
        Workbook workbook = new XSSFWorkbook(file);
        this.sheet = workbook.getSheetAt(0); // Assuming data is on the first sheet
        file.close();
    }

    public boolean isColumnCConcatenated() {
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
            Cell cellC = row.getCell(2);
            if (cellC == null || cellC.getCellType() != CellType.STRING) {
                return false;
            }
        }
        return true;
    }

    public boolean isFormulaInColumnCValid() {
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
            Cell cellC = row.getCell(2);
            if (cellC == null || cellC.getCellType() != CellType.STRING) {
                return false;
            }
            Cell cellD = row.getCell(3);
            Cell cellH = row.getCell(7);
            Cell cellU = row.getCell(20);
            Cell cellO = row.getCell(14);
            Cell cellE = row.getCell(4);

            String expectedValue = cellD.getStringCellValue() + "_" + cellH.getStringCellValue() + "_"
                    + cellU.getStringCellValue() + "_" + cellO.getStringCellValue() + "_"
                    + cellE.getStringCellValue();

            if (!cellC.getStringCellValue().equals(expectedValue)) {
                return false;
            }
        }
        return true;
    }
}