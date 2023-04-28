package AlleNikhil.TestAll.testNg.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoT3 {
    @Test
    public void get(){
        System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.t3-framework.org/joomla30/index.php/en/joomla-pages/sample-page-1/advancesd-search?searchword=&searchphrase=all");
        WebElement createAcc=driver.findElement(By.linkText("Create an account"));
        createAcc.click();
        WebElement firstName=driver.findElement(By.id("jform_name"));
        firstName.sendKeys("Nikhilesh");
        WebElement userName=driver.findElement(By.id("jform_username"));
        userName.sendKeys("Allenikhil");
        WebElement password=driver.findElement(By.id("jform_password1"));
        password.sendKeys("Alle@90890");
        WebElement confPassword=driver.findElement(By.xpath("//input[@id='jform_password2' and @name='jform[password2]']"));
        confPassword.sendKeys("Alle@90890");
        WebElement emailEnter=driver.findElement(By.className("jform[email1]"));
        emailEnter.sendKeys("allenikhil@gmail.com");
        WebElement conEmailEnter=driver.findElement(By.xpath("//input[@class='validate-email required invalid' and @name='jform[email2]']"));
        conEmailEnter.sendKeys("allenikhil@gmail.com");



    }
}
