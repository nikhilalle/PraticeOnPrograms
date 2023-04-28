package AlleNikhil.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

public class Assignment7_WebDriverSelenium {
    @Test
    public void webUrlCount() throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.findElement(By.xpath("//div[@class='a4bIc']//child::input[@class='gLFyf gsfi']")).sendKeys("Selenium Webdriver");
        Thread.sleep(1000);
        List<WebElement> list= driver.findElements(By.xpath("//ul/li[@class='sbct']//span[text()]"));
        System.out.println(list.size());

        System.out.println("--- Using Iterator ---");
        Iterator<WebElement> element=list.iterator();
        while (element.hasNext()){
            WebElement ele=element.next();
            System.out.println(ele.getText());
        }
        // All Done

        }

    }
