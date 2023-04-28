package AlleNikhil.selenium.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectOptions {
    @Test
    public void dropDwonList(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //driver.get("http://localhost:63342/corejava-selenium-june22/com/matrix/nikhil/selenium/HTML/Test5.html?languages=javascript#");

        //driver.findElement(By.xpath("//select[@name='languages']")).click();

    }

}
