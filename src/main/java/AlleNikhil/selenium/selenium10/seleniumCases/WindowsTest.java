package AlleNikhil.selenium.selenium10.seleniumCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsTest {
    @Test
    public void verifyWindowHandling() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        String window = driver.getWindowHandle();
        System.out.println(window);  // CDwindow-D27848E8AAF4CF764F81A227F173F5AD
        driver.findElement(By.id("windowButton")).click();
        Set<String> windows = driver.getWindowHandles();
        for (String win:windows){
            driver.switchTo().window(window);
            System.out.println(driver.getCurrentUrl());
//        https://demoqa.com/browser-windows
//            https://demoqa.com/browser-windows




        }

    }
}
