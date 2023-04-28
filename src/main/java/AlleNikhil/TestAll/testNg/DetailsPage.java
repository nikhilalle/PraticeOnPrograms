package AlleNikhil.TestAll.testNg;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DetailsPage {
    @DataProvider(name = "xlData")
    public Object[][] fileXl() throws IOException {
        XSSFSheet sheet = sheetValue();
        int row = getRowDetails(sheet);
        int coloum = getcoloumDetails(sheet, 1);
        Object[][] objects = new Object[row][coloum];
        for (int i = 0; i <= row - 1; i++) {
            for (int j = 0; j <= coloum - 1; j++) {
                DataFormatter format = new DataFormatter();
                objects[i][j] = format.formatCellValue(sheet.getRow(i + 1).getCell(j));
            }
        }
        return objects;
    }

    public XSSFSheet sheetValue() throws IOException {
        File file = new File("D:\\JAVA NEW 2022\\Data_Provider   Files\\123.xlsx");
        FileInputStream fin = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fin);
        XSSFSheet sheet = workbook.getSheet("Sheet2");
        return sheet;
    }

    public int getRowDetails(XSSFSheet sheet) {
        return sheet.getLastRowNum();
    }

    public int getcoloumDetails(XSSFSheet sheet, int rowNumber) {
        return sheet.getRow(rowNumber).getLastCellNum();
    }

//    @Test(dataProvider = "xlData")
//    public void loginDetails(String name, String password) {
//        System.out.println(name);
//        System.out.println(password);
//        System.out.println("-----------------");
    }

