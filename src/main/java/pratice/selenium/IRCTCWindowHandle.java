package pratice.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class IRCTCWindowHandle {
    WebDriver driver;

    @BeforeMethod
    public void intiBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://indianrailways.gov.in/");
        driver.manage().window().maximize();

    }

    @Test
    public void verifyPage() throws InterruptedException {
        Actions actions = new Actions(driver);
        //Select Zonal Railway
        WebElement zonalRail = driver.findElement(By.xpath("//a[@title='Zonal Railways']"));
        actions.moveToElement(zonalRail).build().perform();
        driver.findElement(By.xpath("//a[@title='Central Railway']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Using Get-Window-Handle to Given Driver in Next Page
        Set<String> windows = driver.getWindowHandles();
        System.out.println("Multiple Windows: " + windows);
        List<String> listWindows=new ArrayList<>(windows);
        for (String list:listWindows){
            System.out.println("All Windwos List :    "+list);
            System.out.println();
            System.out.println("Index 0"+listWindows.get(0));
            System.out.println("Index 1"+listWindows.get(1));
            driver.switchTo().window(listWindows.get(1));


        }

        driver.findElement(By.xpath("//a[text()='Holiday Packages']")).click();
        Alert altert=driver.switchTo().alert();
       altert.accept();

        Set<String> itemWindows=driver.getWindowHandles();
        for (String listItem:itemWindows){
            System.out.println(listItem);
        }
        System.out.println("-------------------------");
        List<String> listOFHolidayPackage=new ArrayList<>(itemWindows);
        System.out.println("List-OF-Holiday-Package  :  "+listOFHolidayPackage);
        System.out.println("All Windwos List :    "+listOFHolidayPackage);
        System.out.println();

        System.out.println("Index 0  " +listOFHolidayPackage.get(0));
        System.out.println("Index 1  " +listOFHolidayPackage.get(1));
        System.out.println("Index 1  " +listOFHolidayPackage.get(2));

         driver.switchTo().window(listOFHolidayPackage.get(2));
//

       driver.findElement(By.xpath("//input[@placeholder='Enter Origin/Destination City']")).sendKeys("Nikhilesh");
          }
   @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
