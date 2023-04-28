package AlleNikhil.selenium.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoPage {
    @Test
    public void newDemo (){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("https://www.flipkart.com/");

        WebElement userName=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));


       userName.sendKeys("laptop");



       driver.findElement(By.xpath("//a[text()='Login']")).click();
       driver.findElement(By.xpath("//div[@style='width: 39.4683px;'][3]"));

       WebElement ele= driver.findElement(By.xpath("//div[@class='_3uDYxP']//select[@class='_2YxCDZ']//option"));
        Select select=new Select(ele);
        select.selectByValue("50000");
        driver.findElement(By.xpath("//div[text()='Brand']")).click();

        driver.findElement(By.xpath("//label[@class='_2iDkf8 t0pPfW']//div[text()='HP']")).click();


    }
}
//Admin | Password : admin123 )

