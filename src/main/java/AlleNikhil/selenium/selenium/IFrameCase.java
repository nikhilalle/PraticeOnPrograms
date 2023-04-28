package AlleNikhil.selenium.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class IFrameCase {
    @Test
    public void frames(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#google_vignette");

        WebElement element=driver.findElement(By.xpath("//li[@id='iFrame']"));
        element.click();

        List<WebElement> iframe=driver.findElements(By.tagName("iframe"));
        System.out.println(iframe.size());
        System.out.print(iframe);

        for(WebElement list:iframe){
            System.out.print(" list Of I-Frames  "+list.getText());
            System.out.println(list);
        }

driver.close();

    }
}
