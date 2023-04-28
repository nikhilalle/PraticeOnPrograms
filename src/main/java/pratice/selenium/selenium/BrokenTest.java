package pratice.selenium.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.print.DocFlavor;
import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenTest {
    @Test
    public void verifyUrl() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

     List<WebElement> urlLinks= driver.findElements(By.tagName("a"));
        System.out.println("Total Links In Amazon : "+urlLinks.size());

        for (WebElement elements:urlLinks) {
          //  System.out.println(elements.getText());

            String linkUrl=elements.getAttribute("href"); // get Href Attribute ( Links ) Store in String
try {

     // Create Connect With HTTP    URl to Browser

    URL url = new URL(linkUrl);   // link Url (String) Passed Here
    HttpURLConnection    hpt = (HttpURLConnection) url.openConnection();  //  Create Connect With HTTP
    hpt.connect();  // Get Connect to HTTP
    int responseCode = hpt.getResponseCode();  // Get Url Code  i.e 100,200,300,400.....Stored in Integer

    System.out.println(responseCode);
    if(responseCode >=400){
        System.out.println(linkUrl+  "   It in Invalid Links");
    }
    else {
        System.out.println(linkUrl + "   It in Valid Links");
    }

}catch (MalformedURLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
