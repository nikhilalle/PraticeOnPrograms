package AlleNikhil.TestAll.testNg.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestPage4 {
    @Test
        public void pageLogin1() {
            System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://demo.t3-framework.org/joomla30/index.php/en/joomla-pages/sample-page-2/login-page");

            // By Using X-Path
       WebElement searchBar = driver.findElement(By.name("search"));
       searchBar.sendKeys("FileLogin");
       searchBar.click();
            WebElement txtUserName = driver.findElement(By.xpath("//input[@name='username' and @id='username']"));
            txtUserName.sendKeys("Admin");
            WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password' and @id='password']"));
            txtPassword.sendKeys("admin123 ");
            WebElement logInBtn = driver.findElement(By.name("Log in"));
            logInBtn.click();



        }
    }

