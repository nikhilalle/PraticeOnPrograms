package selenium.waitsConcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImpliciteWait {
    WebDriver driver;
    @BeforeMethod
    public void intBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().fullscreen();
        //driver.manage().window().setSize(new Dimension(1034, 768));
    }
    @Test
    public void loginApplication(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).submit();
        //System.out.println("   Title    "+driver.getTitle());
        System.out.println("   Current  URL  "+driver.getCurrentUrl());
       // System.out.println("   Page Source   "+driver.getPageSource());
        /**
         * it will given the entire page Source
         * means what ever we inspect it will show here in Page  Source
         * i.e Method driver.getPageSource
         *
         */
        System.out.println("-------------------------");
      //  System.out.println("   Window Id "+driver.getWindowHandle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        driver.manage().timeouts().implicitlyWait(30, Timeout.ofSeconds(67).getTimeUnit());
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();





    }
}
