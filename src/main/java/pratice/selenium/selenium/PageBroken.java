package pratice.selenium.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class PageBroken {
    @Test
    public void brokenPage() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        WebElement logPage = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));

        Actions actions = new Actions(driver);
        actions.moveToElement(logPage).click().build().perform();

        List<WebElement> links = driver.findElements(By.xpath("//a"));
        System.out.println(links.size());

        for (WebElement element : links) {
            System.out.println("Total Links : " + element.getSize());

            String linksElements = element.getAttribute("href");
            try {
                URL url = new URL(linksElements);
                HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
                con.connect();
                int stauts = con.getResponseCode();


                if (stauts >= 400) {
                    System.out.println("it is an Invalid Code ");
                } else {
                    System.out.println("It is an Valide Code");
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }

}
