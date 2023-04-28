package AlleNikhil.TestAll.testNg.dataProvider;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderWithXLS {
    @Test(dataProvider = "userDetails")
    public void verifyLogin(String empName,int id) {
        System.out.println(empName);

        System.out.println(id);

        System.out.println("--------------");

    }

    @DataProvider(name = "userDetails")
    public Object[][] details() throws IOException {
        File file = new File("D:\\JAVA NEW 2022\\corejava-selenium-june22\\src\\main\\java\\com\\matrix\\nikhil\\testNg\\dataProvider\\User_Details.xlsx");
        FileInputStream fin = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fin);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int row = sheet.getLastRowNum();
        int columns = sheet.getRow(1).getLastCellNum();
        Object[][] object = new Object[row][columns];

        for (int i = 0; i <= row - 1 ; i++) {
            for (int j = 0; j <= columns -1 ; j++) {

                DataFormatter formatter=new DataFormatter();
                object [i][j] =formatter.formatCellValue(sheet.getRow(i+1).getCell(j));

            }
        } return object;



    }
}
