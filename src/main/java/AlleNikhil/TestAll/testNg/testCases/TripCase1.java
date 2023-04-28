package AlleNikhil.TestAll.testNg.testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

public class TripCase1 {
    @Test
    public void detail() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        List<WebElement> allProduct=driver.findElements(By.xpath("//ul[@class='footNav__list']"));

        System.out.println(allProduct.size()); //All Product Total is 5

        Iterator<WebElement> itr=allProduct.iterator();
        while (itr.hasNext()){
            WebElement element=itr.next();
            System.out.println(element.getText());
        }
        // All Item 106



        List<WebElement> productItems1=driver.findElements(By.xpath("//ul[@class='footNav__list'][1]/child::li"));
        System.out.println("Total Products Count : " +productItems1.size()); //PRODUCT OFFERING Items is 25

        Iterator<WebElement> itr1=productItems1.iterator();
        while (itr1.hasNext()){
            WebElement element=itr1.next();
            System.out.println(element.getText());
        }




















    }
}