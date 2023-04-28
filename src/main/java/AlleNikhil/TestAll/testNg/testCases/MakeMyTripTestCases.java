package AlleNikhil.TestAll.testNg.testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.List;

public class MakeMyTripTestCases {
    @Test
    public void product() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");

        String items = "MakeMyTrip";
        System.out.println("-------------Only Singal Procduct ---------");
        List<WebElement> listdata = driver.findElements(By.xpath("//p[text()='" + items + "']"));

        System.out.println(listdata.size());

        Iterator<WebElement> itr2 = listdata.iterator();

        while (itr2.hasNext()) {
            WebElement element = itr2.next();
            System.out.println(element.getText());
        }
        /**
         * 1
         * MAKEMYTRIP
         */

        System.out.println("-------------All Procduct ---------");
        List<WebElement> listOfProducts = driver.findElements(By.xpath("//div[@class='footNav'][1]/descendant::p"));
        System.out.println("Total Products Count : " + listOfProducts.size());

        Iterator<WebElement> itr1 = listOfProducts.iterator();

        while (itr1.hasNext()) {
            WebElement element = itr1.next();
            System.out.println(element.getText());
        }
    /**Total Products Count : 5
    * PRODUCT OFFERING
     *MAKEMYTRIP
     *ABOUT THE SITE
     *QUICK LINKS
     *IMPORTANT LINKS
      **/
        System.out.println("-------------All Items of Procduct---------");
        List<WebElement> ProductItems = driver.findElements(By.xpath("//ul[@class='footNav__list'][1]/child::li"));
        System.out.println("Total Products Count : " +ProductItems.size());

        System.out.println("--- Using Iterator ---");
        Iterator<WebElement> itr = ProductItems.iterator();
        while(itr.hasNext()) {
            WebElement element = itr.next();
            System.out.println(element.getText());
        }
        /**
         * Flights,
         * International Flights,
         * Charter Flights,
         * Hotels,
         * International Hotels,
         * Homestays and Villas,
         * Activities,
         * Holidays In India,
         * International Holidays,
         * Book Hotels From UAE,
         * myBiz for SME Travel,
         * Book Online Cabs,
         * Book Bus Tickets,
         * Book Train Tickets,
         * Cheap Tickets to India,
         * Book Flights From US,
         * Book Flights From UAE,
         * Trip Planner,
         * Gift Cards,
         * Trip Money,
         * Trip Ideas,
         * Travel Blog,
         * PNR Status,
         * MakeMyTrip Advertising Solutions,
         * One Way Cab
         */

    }
}

