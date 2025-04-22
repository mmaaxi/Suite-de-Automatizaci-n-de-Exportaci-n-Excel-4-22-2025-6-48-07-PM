package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import pages.cp_002Page;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class cp_002Steps {

    cp_002Page excelPage = new cp_002Page();

    @When("I locate column C in the Excel file")
    public void i_locate_column_C_in_the_Excel_file() throws IOException {
        excelPage.loadExcelFile();
    }

    @Then("the cell C2 and subsequent cells should show concatenated data")
    public void validate_concatenated_data() {
        assertTrue("The content of column C is not concatenated as expected", excelPage.isColumnCConcatenated());
    }

    @Then("the content of the cell should follow the formula: =CONCATENATE(D2,'_',H2,'_',U2,'_',O2,'_',E2)")
    public void validate_cell_content_formula() {
        assertTrue("The formula of column C does not match", excelPage.isFormulaInColumnCValid());
    }
}