package AlleNikhil.TestAll.testNg.testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class MakeMyTrip {
    @Test
    public void ddlSelect() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://preview.colorlib.com/theme/bootstrap/multiselect-04/");
        Thread.sleep(2000);



        driver.findElement(By.xpath("/html/body/section/div/div[2]/div/div/button/div/div/div")).click();

        List<WebElement> getListofDD = driver.findElements(By.xpath("/html/body/section/div/div[2]/div/div/div/div/ul/li"));
        for (WebElement getList: getListofDD){
            if(getList.getText().equals("Toronto") || getList.getText().equals("Paris")){
                getList.click();
            }else {
                System.out.println(getList.getText());
            }
        }
    }
}


