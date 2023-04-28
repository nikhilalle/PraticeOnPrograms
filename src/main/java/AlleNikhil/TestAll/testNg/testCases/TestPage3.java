package AlleNikhil.TestAll.testNg.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestPage3 {
    @Test
    public void pageLogin(){
        System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");

        // By Using X-Path
        WebElement txtUserName=driver.findElement(By.xpath("//input[@name='txtUsername']"));
        txtUserName.sendKeys("Admin");
        WebElement txtPassword=driver.findElement(By.xpath("//input[@name='txtPassword']"));
        txtPassword.sendKeys("admin123 ");
        WebElement logInBtn=driver.findElement(By.xpath("//input[@type='submit']"));
        logInBtn.click();
}
}
