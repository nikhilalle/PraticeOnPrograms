package pratice.dataDriven;


import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Test(dataProvider = "data")
public class DataDrivenExcel {
    public void browserInit(String name, String surname, String rollMo) {
        System.out.print(name);
        System.out.print("    " + surname);
        System.out.print("    " + rollMo);
        System.out.println();
    }

    @DataProvider(name = "data")
    public Object[][] testCase() throws IOException, InvalidFormatException {
        File file = new File("D:\\JAVA NEW 2022\\Book.xlsx");
        FileInputStream fin = new FileInputStream(file);
        XSSFWorkbook book = new XSSFWorkbook(fin);
        XSSFSheet sheetBook = book.getSheet("Sheet1");

        int row = sheetBook.getLastRowNum();
        int column = sheetBook.getRow(1).getLastCellNum();
        Object[][] objectArray = new Object[row][column];
        for (int i = 0; i <= column - 1; i++) {
            System.out.println(i);
            for (int j = 0; j <= column - 1; j++) {
                System.out.println(j);
                DataFormatter dataFormat = new DataFormatter();
                objectArray[i][j] = dataFormat.formatCellValue(sheetBook.getRow(i + 1).getCell(j));
            }
        }
        return objectArray;

    }
}
