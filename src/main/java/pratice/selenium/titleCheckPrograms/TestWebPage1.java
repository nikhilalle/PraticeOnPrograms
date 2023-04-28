package pratice.selenium.titleCheckPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestWebPage1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/login");
        driver.manage().window().maximize();
       String actualTitle= driver.getTitle();
        System.out.println(actualTitle);

        String exptTitle="Login � Instagram";
        System.out.println(exptTitle);

        WebElement userNameInsta=driver.findElement(By.xpath("//input[@name='username']"));
        userNameInsta.sendKeys("Allenikhil");


      //  Assert.assertEquals(exptTitle,actualTitle);
/*
        if(exptTitle.equals(actualTitle)){
            System.out.println("It is Correct");
        }else {
            System.out.println("It is not Correct");
        }
        */

    }
}
