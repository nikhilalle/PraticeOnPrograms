package AlleNikhil.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Assignment17_IndianRail {
    /**
     * Open https://indianrailways.gov.in/
     * Mouse hover on Zonal Railways from menu items
     * Click on Holiday Packages
     * Click the OK button present on Alert to go to the next tab.
     * Enter Origin/Destination City as ‘Tirupati’
     * Get the Title, package code, upcoming date of journey and amount, print this information on the console.
     * (Please refer below image)
     **/
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


        System.out.println("-----------------------");
        List<String> listOfWindows = new ArrayList<>(windows);
        for (String listPrint : listOfWindows) {
            System.out.println("Total List Elements : " + listPrint);
            System.out.println("List Of   Windows  " + listOfWindows.get(1));   //New Page Address
            driver.switchTo().window(listOfWindows.get(1));  // Move to New Page Action
            System.out.println(driver.getCurrentUrl());   // New Page Url

            // Click Holiday Package

            driver.findElement(By.xpath("//a[@title='Holiday Packages' and text()='Holiday Packages']")).click();
            //actions.moveToElement(holyDayPackageClick).doubleClick().build().perform();
            Alert alert = driver.switchTo().alert();
            alert.accept();

            //Using Get-Window-Handle to Given Driver in Next Page

            Set<String> windows1 = driver.getWindowHandles();
            System.out.println(windows1);

            List<String> newWindows = new ArrayList<>(windows1);
                driver.switchTo().window(newWindows.get(2));

                System.out.println(driver.getCurrentUrl());

                Thread.sleep(3000);
                /*
                driver.findElement(By.xpath("//input[@placeholder='Enter Origin/Destination City']")).sendKeys("Tirupathi");
                WebElement travelMode = driver.findElement(By.name("sector"));
                Select select = new Select(travelMode);
                select.selectByVisibleText("Domestic");
                driver.findElement(By.xpath("//div[@class='form-in-custom3']//button[@class='btn btn-radius-none btn-yellow']")).click();
                */

                // Enter destination Tirupati

                driver.findElement(By.xpath("//input[@placeholder= 'Enter Origin/Destination City']")).sendKeys("TIRUPATI");
                Thread.sleep(10000);
                WebElement element = driver.findElement(By.xpath("//li[@class='homeautopromt active']/a/span"));
                actions.moveToElement(element).click().build().perform();
                Thread.sleep(6000);

                //Element Check

                String titleOfElement = driver.findElement(By.xpath("//h5[text()='TIRUPATI MOKSHAM']")).getText();
                String packageCodeOfElement = driver.findElement(By.xpath("//span[text()='SHH038 ']")).getText();
                String upcomingDateOfJourney = driver.findElement(By.xpath("//h5[text()='TIRUPATI MOKSHAM']/following::span[6]")).getText();
                String amountPaid = driver.findElement(By.xpath("//h5[text()='TIRUPATI MOKSHAM']/following::strong[8]")).getText();

                // Check All Elements

                System.out.println("Holiday Package Title: " + titleOfElement);
                System.out.println("Package Code: " + packageCodeOfElement);
                System.out.println("Upcoming Date Of Journey: " + upcomingDateOfJourney);
                System.out.println("Amount: " + amountPaid);


            }
        }
    }

