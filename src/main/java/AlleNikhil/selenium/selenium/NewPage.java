package AlleNikhil.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewPage {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
            WebDriver driver =new ChromeDriver();
            driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
            driver.manage().window().maximize();
        WebElement loginTxt=driver.findElement(By.xpath("  //input[contains(@data-validate,'isEmail')]  "));
        loginTxt.sendKeys("allenikhilalle@gmail.com");
        WebElement submitBtn=driver.findElement(By.id("SubmitCreate"));
        submitBtn.click();

      // WebElement firstName= driver.findElement(By.id("firstname"));
        WebElement firstName1= driver.findElement(By.tagName("//input[@id='customer_firstname' and @name='customer_firstname']"));

       firstName1.sendKeys("MNik");

        WebElement lasttName= driver.findElement(By.id("customer_lastname"));
        String text = lasttName.getText();
        lasttName.sendKeys("alle");

        WebElement passwd= driver.findElement(By.id("passwd"));
        passwd.sendKeys("MNik");
        WebElement companyName= driver.findElement(By.id("company"));
        companyName.sendKeys("TCS");
        WebElement addLastName= driver.findElement(By.tagName("//input[@id='firstname']"));
       addLastName.sendKeys("MNik");
       WebElement Name= driver.findElement(By.id("cusbnjjmtomer_lastname"));
       Name.sendKeys("MNik");








        //
    }
}
