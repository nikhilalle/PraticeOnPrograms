package AlleNikhil.TestAll.testNg.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestPage2 {
    @Test
    public void pageLogin(){
        System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");


        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123 ");
        WebElement logInBtn=driver.findElement(By.id("btnLogin"));
        logInBtn.click();


    }
    @Test
    public void fet(){
        String str = "Java is java again java again".toLowerCase();
        int len = str.length() - str.replace("j", "").length();
        System.out.println(len);

    }
}
