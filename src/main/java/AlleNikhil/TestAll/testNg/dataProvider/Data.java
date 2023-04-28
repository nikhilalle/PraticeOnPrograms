package AlleNikhil.TestAll.testNg.dataProvider;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Data {


    @Test(dataProvider = "loginData")
    public void login(String uName, String password) {
        System.out.println(uName);
        System.out.println(password);
        System.out.println("------------");
    }

    @DataProvider(name = "loginData")
    public Object [][] loginData() throws IOException {
        File file = new File("D:\\JAVA NEW 2022\\corejava-selenium-june22\\src\\main\\java\\com\\matrix\\nikhil\\testNg\\dataProvider\\User_Details.xlsx");
        FileInputStream fin = new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(fin);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int rows = sheet.getLastRowNum();
        System.out.println("Total Rows : " + rows);

        int columns = sheet.getRow(1).getLastCellNum();
        System.out.println("Total Columns : " + columns);

        Object [][] obj = new Object[rows][columns]; // row = 5 , col = 2

        for (int i = 0; i <= rows - 1 ; i++) {
            for (int j = 0; j <= columns -1 ; j++) {
                obj [i][j] = sheet.getRow(i+1).getCell(j).getStringCellValue();
                //   obj[0][0] = [1][0] -> Username1
                //   obj[0][1] = [1][1] -> Password1

                //   obj[1][0] = [2][0] -> Username2
                //   obj[1][1] = [2][1] -> Password2

                //   obj[2][0] = [3][0] -> Username3
                //   obj[2][1] = [3][1] -> Password3

                //   obj[3][0] = [4][0] -> Username4
                //   obj[3][1] = [4][1] -> Password4
            }
        }
        return obj;
    }
}

