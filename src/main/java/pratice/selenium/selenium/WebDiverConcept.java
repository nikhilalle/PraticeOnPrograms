package pratice.selenium.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDiverConcept {
    static WebDriver driver;

    @Test
    public void verifyTitle()

    {


        {
             String browser = "Chrome";
            //String browser = "FireFox";

            // ChromeDriver driver = new ChromeDriver();
            // FirefoxDriver driver = new FirefoxDriver();
            // WebDriver driver = new ChromeDriver();
            // WebDriver driver = new FirefoxDriver();


            if (browser.equals("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser.equals("FireFox")) {
                System.setProperty("webdriver.gecko.drive", "D:\\New folder\\geckodriver.exe");
                driver = new FirefoxDriver();
            }

            driver.get("https://www.instagram.com");
            String actualTitle = driver.getTitle();
            System.out.println(actualTitle);

            String execptedlTitle = "Instagram";

            System.out.println(execptedlTitle);

             // Assertion
            /*
            if (actualTitle.equals(execptedlTitle)) {
                System.out.println("Test case is pass");
            } else {
                System.out.println("Test case is fail");
            }

             */

            Assert.assertEquals(actualTitle,execptedlTitle);
             driver.close();

        }
    }
}
