package AlleNikhil.TestAll.testNg.dataProvider;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataProvider2 {
    @Test(dataProvider = "data")
    public void details(String name,String companyName,String desig ,String password,String id){
        System.out.println(name);
        System.out.println(companyName);
        System.out.println(desig);
        System.out.println(password);
        System.out.println(id);
        System.out.println("-----------------");
    }
@DataProvider(name = "data")
    public Object[][] testCase() throws IOException {
        File file=new File("C:\\Users\\RADHE-KRISHNA\\OneDrive\\Desktop\\New folder\\123.xlsx");
        FileInputStream fin=new FileInputStream(file);
    XSSFWorkbook workbook = new XSSFWorkbook(fin);
    XSSFSheet sheet = workbook.getSheet("Sheet1");
    int row = sheet.getLastRowNum();
    int columns = sheet.getRow(1).getLastCellNum();
    Object[][] objectArray=new Object[row][columns];
        for(int i=0;i<=row-1;i++){
            for (int j=0;j<=columns-1;j++){
                DataFormatter formatter=new DataFormatter();
                objectArray[i][j] = formatter.formatCellValue(sheet.getRow(i+1).getCell(j));
            }
        }
        return objectArray;
    }
}



