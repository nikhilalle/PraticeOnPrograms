package AlleNikhil.selenium.seleniumAll;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsHandle {
    @Test
    public void windowHandleTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();

        String window1 = driver.getWindowHandle();
        System.out.println(window1);
        driver.findElement(By.id("tabButton")).click();

        System.out.println(driver.getTitle());
        Set<String> allWindows = driver.getWindowHandles();
        for (String win : allWindows) {
            System.out.println(win);
        }

    }

    }


