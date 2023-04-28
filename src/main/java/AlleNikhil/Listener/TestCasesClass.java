package AlleNikhil.Listener;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class TestCasesClass {


        WebDriver driver;

        //Test to pass as to verify listeners.
        @Test
        public void Login() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
        }

        //Forcefully failed this test as verify listener.
        @Test
        public void TestToFail() {
            System.out.println("This method to test fail");
            Assert.assertTrue(false);
        }
    }

