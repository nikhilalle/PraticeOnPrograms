package pratice.selenium.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowTab {
    @Test
    public void tabWindowCheck() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();

        driver.findElement(By.id("tabButton")).click();

        System.out.println(driver.getTitle());

        System.out.println("Parent Window Url : " + driver.getCurrentUrl());

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent----Window"+parentWindow);  //  CDwindow-A1BD00649959563060E956984FE3E146 ( Parent Window Address )

        Set<String> windows = driver.getWindowHandles();
        System.out.println("Multiple Windows: " + windows);

        // Multiple Windows: [CDwindow-A1BD00649959563060E956984FE3E146, CDwindow-02C6301DF05A06A932BC44BCE7BDC59B]
        //                              ( Parent Window Address )                  ( Child Window Address )

        System.out.println("-----------------------");
        List<String> listOfWindows = new ArrayList<>(windows);
        for (String listPrint : listOfWindows) {
            System.out.println("Total List Elements : " + listPrint);

            // Total List Elements : CDwindow-A1BD00649959563060E956984FE3E146    Index of ( 0 ) ( Parent Window Address )
            // Total List Elements : CDwindow-02C6301DF05A06A932BC44BCE7BDC59B    Index of ( 1 ) ( Child Window Address )

        }
        System.out.println("-----------------------");
        System.out.println("List Of   Windows  " + listOfWindows.get(1));   //New Page Address
        driver.switchTo().window(listOfWindows.get(1));  // Move to New Page Action
        System.out.println(driver.getCurrentUrl());   // Nwe Page Url
        driver.close();

        driver.switchTo().window(parentWindow);
        System.out.println(driver.getCurrentUrl()); // Back To Parent Page


    }
}

