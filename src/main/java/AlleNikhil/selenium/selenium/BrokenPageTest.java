package AlleNikhil.selenium.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenPageTest {
    WebDriver driver;
@BeforeMethod
    public  void intiBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();

    }
    @Test
    public void verifyPage() throws IOException {
     List<WebElement> urlLinks= driver.findElements(By.tagName("a"));

        System.out.println("Total Links In This Page :  "+urlLinks.size());

        for (WebElement links:urlLinks) {
            String allLinks = links.getAttribute("href");
            try {


                URL url = new URL(allLinks);
                HttpURLConnection http = (HttpURLConnection) url.openConnection();
                http.connect();

                int code = http.getResponseCode();
                System.out.println(" Service Code " + code);
                if (code >= 400) {
                    System.out.println("Link is In Valid " + allLinks);
                } else {
                    System.out.println("Link is  Valid " + allLinks);
                }
            }catch (MalformedURLException test){
                test.printStackTrace();
            }

            }


    }
    @AfterMethod
    public void tearDown(){
  //  driver.close();
    }

}
