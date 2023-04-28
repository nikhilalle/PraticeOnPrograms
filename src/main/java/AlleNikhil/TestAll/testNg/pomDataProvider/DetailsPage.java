package AlleNikhil.TestAll.testNg.pomDataProvider;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DetailsPage {

    @DataProvider(name = "data")
    public Object[][] details() throws IOException {
        XSSFSheet sheet = getSheetData("Sheet1");

        int row =getTotalRowsCount(sheet);
        int coloum = getTotalColumnsCount(sheet,1);
        Object[][] objects = new Object[row][coloum];
        for (int i = 0; i <= row - 1; i++) {
            for (int j = 0; j <= coloum - 1; j++) {
                DataFormatter dataFormatter = new DataFormatter();
                objects[i][j] = dataFormatter.formatCellValue(sheet.getRow(i + 1).getCell(j));
            }
        }
        return objects;
    }
    public XSSFSheet getSheetData(String sheetName) throws IOException {

        File file = new File("D:\\JAVA NEW 2022\\Data_Provider   Files\\123.xlsx");
        FileInputStream fin = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fin);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        return sheet;
    }

    public int getTotalRowsCount(XSSFSheet sheet) {
        return sheet.getLastRowNum();
    }

    public int getTotalColumnsCount(XSSFSheet sheet, int rowNumber) {
        return sheet.getRow(rowNumber).getLastCellNum();
    }

    @Test(dataProvider = "data")
    public void loginDetails(String name, String companyName, String desig, String password, String id) {
        System.out.println(name);
        System.out.println(companyName);
        System.out.println(desig);
        System.out.println(password);
        System.out.println(id);

        System.out.println("-----------------");

    }
}





