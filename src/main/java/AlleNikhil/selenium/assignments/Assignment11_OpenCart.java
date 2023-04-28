package AlleNikhil.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Assignment11_OpenCart {
    /**
     * Assingment 11:
     * //Steps:
     * //Open https://demo.opencart.com/
     * //Verify menu Items available on the main page
     * //Note: Add all of these items in array or ArrayList as an expected items and verify them with actual items
     **/
    @Test
    public void checkdetails() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com");

        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='collapse navbar-collapse']/ul/li/a"));

        List<String> expectedTopics = new ArrayList();


        for (WebElement element : elements) {

            expectedTopics.add(element.getText());
        }
        System.out.print(expectedTopics);
        System.out.println("-------------------");
        System.out.println(expectedTopics.size());

        System.out.println("--------------------------Actual Topic Enter---------------");
        ArrayList<String> actualTopics = new ArrayList();
        actualTopics.add("Desktops");
        actualTopics.add("Laptops & Notebooks");
        actualTopics.add("Components");
        actualTopics.add("Tablets");
        actualTopics.add("Software");
        actualTopics.add("Phones & PDAs");
        actualTopics.add("Cameras");
        actualTopics.add("MP3 Players");

        System.out.println(actualTopics);

        System.out.println(actualTopics.size());
        Assert.assertEquals(expectedTopics,actualTopics);

        // Done

            }

        }


