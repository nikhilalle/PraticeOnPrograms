package AlleNikhil.TestAll.testNg.dataProvider;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataProvider3 {
    @Factory

    @Test(dataProvider = "Nikhil")
    public void login(String userName,String password){
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.saucedemo.com/");
//        driver.manage().window().maximize();
//        driver.findElement(By.id("user-name")).sendKeys(userName);
//        driver.findElement(By.id("password")).sendKeys(password);
//        driver.findElement(By.id("login-button")).click();
        System.out.println(userName);
        System.out.println(password);
        System.out.println("____________");

    }
    @Test(dataProvider = "Nikhil")
    public void login1(String userName,String password) {

        System.out.println(password);
        System.out.println(userName);
        System.out.println("____________");
    }
        @DataProvider(name = "Nikhil")
    public  Object[][]  getDetails() throws IOException {
        File file=new File("C:\\Users\\RADHE-KRISHNA\\OneDrive\\Desktop\\New folder\\123.xlsx");
        FileInputStream fin=new FileInputStream(file);
        XSSFWorkbook workbook=new XSSFWorkbook(fin);
        XSSFSheet sheet=workbook.getSheet("Sheet2");
        int row=sheet.getLastRowNum();
        System.out.println(row);
        int coloum=sheet.getRow(1).getLastCellNum();
        System.out.println(coloum);
        Object[][] objects=new Object[row][coloum];
        for (int i=0;i<=row-1;i++){
            for (int j=0;j<=coloum-1;j++){
                DataFormatter dataFormatter=new DataFormatter();
                objects[i][j]=dataFormatter.formatCellValue(sheet.getRow(i+1).getCell(j));
            }
        }
        return objects;
    }
}
