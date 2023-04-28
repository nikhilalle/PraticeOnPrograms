package AlleNikhil.selenium.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.math.ec.custom.sec.SecT113Field;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class NewWindowTest {
    @Test
    public void verifyWindow() {
        // Open Page
        // Get the window handle (unique ID) of the parent window
        // Perform some action to open a new window
        // Get window handles (unique ID) of multiple windows
        // Switch to the Child window
        // Perform actions on child window
        // Close child window
        // Switch to the Parent window
        // Close parent window

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();

        String parentWindow = driver.getWindowHandle();  // Parent Address Get in String

        System.out.println("Parent Page Address: " + parentWindow);

        System.out.println("Parent Page_Title : " + driver.getTitle());
        System.out.println("Parent Window URL " + driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle().isEmpty());

        driver.findElement(By.id("windowButton")).click();

        Set<String> allWindows = driver.getWindowHandles();  // Get All Windows Address and Stored in String

        System.out.println(allWindows);
        for (String window : allWindows)   // all Windows Getting in  String
        {

            if (!parentWindow.equals(allWindows)) {
                driver.switchTo().window(window);  // now Switch to New (Child) Window
                System.out.println("Current Page URl : " + driver.getCurrentUrl());
                driver.close(); // Close New (Child) Window

            }
        }
      //  driver.switchTo().window(parentWindow);
      //  driver.switchTo().defaultContent();
       // System.out.println(driver.getTitle());


        driver.switchTo().window(parentWindow);
        driver.switchTo().defaultContent();
        System.out.println("Parent Window Title : " +driver.getTitle());
        driver.close();


    }
}