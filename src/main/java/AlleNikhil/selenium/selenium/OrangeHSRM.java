package AlleNikhil.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHSRM {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement userName=driver.findElement(By.xpath("//input[@name='txtUsername' and @id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement passwordUSer=driver.findElement(By.xpath("//input[@name='txtPassword' and @id='txtPassword']"));
        passwordUSer.sendKeys("admin123");
        WebElement userLogin=driver.findElement(By.xpath("//input[@name='Submit' and @id='btnLogin']"));
        userLogin.click();


    }
}
