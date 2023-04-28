package AlleNikhil.selenium.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NewWebPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

        WebElement UserNameC=driver.findElement(By.id("Email"));
        UserNameC.clear();
        UserNameC.sendKeys("allenikhil@gmail.com");

        WebElement password=driver.findElement(By.className("password"));
       password.sendKeys("9823992356");


        WebElement buttonLogin=driver.findElement(By.className("buttons"));

        buttonLogin.click();

        //  email valid email valid


    }
}
