package AlleNikhil.testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SelectClassTest {

    WebDriver driver;

    @Test
    public void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("file:///C:/Users/RADHE-KRISHNA/Downloads/dropdown%20(2).html");
        driver.manage().window().maximize();


        for (int i = 1; i < 11; i++) {
            WebElement listElement = driver.findElement(By.xpath("//div[@class='container']//div[" + i + "]//select//option[" + i + "]"));

            listElement.click();
//            Select select=new Select(listElement);
//            select.selectByIndex(i);

        }
    }


    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}

//        for(int i=0;i<10;i++) {
//            List<WebElement> elements = driver.findElements(By.xpath("//div[@class='dropdown'][i]"));
//            elements.get(i).click();
    //for(int j=i;j<=i;j++) {
    //       WebElement listElement = driver.findElement(By.xpath("//select[@id='firstName'][1]"));
    //
    //
    // WebElement listElement = driver.findElement(By.xpath("//select[@id='firstName'] [" +j+"] "));

////div[@class='container']//div[4]//select//option[4]

//            Select  s=new Select( listElement);
//            s.selectByIndex(i);

//            //div[@class='container']//div[2]//select//option[2]
//            driver.findElement(By.xpath("//*[@id='firstName']/option["+i+"]")).click();
//
//
//        }



