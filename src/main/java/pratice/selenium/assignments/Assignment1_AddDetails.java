package pratice.selenium.assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Assignment1_AddDetails {
    @Test
    public void login() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        WebElement singUpOpen = driver.findElement(By.xpath("//a[@class='login']")); ////a[@class='login']

        singUpOpen.click();

        WebElement loginTxt = driver.findElement(By.xpath("//input[contains(@data-validate,'isEmail')]  "));
        loginTxt.sendKeys("allenikhilalle@gmail.com");
        WebElement submitBtn = driver.findElement(By.id("SubmitCreate"));
        submitBtn.click();
        Thread.sleep(15000);

      // driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("customer_firstname']")).sendKeys("Nikhilesh");
        driver.findElement(By.id("customer_lastname")).sendKeys("Alle");
        driver.findElement(By.xpath("//input[@name='passwd' and @id='passwd']")).sendKeys("Nikhil@4545");
        //driver.findElement(By.id("customer_firstname")).sendKeys("Nikhilesh");
        driver.findElement(By.xpath("//input[@id='firstname' and @name='firstname']")).sendKeys("Nikhil");
        driver.findElement(By.xpath("//input[@id='lastname' and @name='lastname']")).sendKeys("alle");
        driver.findElement(By.xpath("//input[@id='lastname' and @name='lastname']")).sendKeys("alle");
        driver.findElement(By.xpath("//input[@id='address1' and @name='address1']")).sendKeys("12 Solapur Maharashtra");
        driver.findElement(By.xpath("//input[@id='address2' and @name='address2']")).sendKeys("Solapur Maha");
        driver.findElement(By.xpath("//input[@id='city' and @name='city']']")).sendKeys("Solapur");
        driver.findElement(By.xpath("//input[@id='address2' and @name='address2']")).sendKeys("Solapur Maha");
        driver.findElement(By.xpath("//input[@name='postcode' and @id='postcode']")).sendKeys("413005");
        driver.findElement(By.xpath("//textarea[@name='other' and @id='other']")).sendKeys("Data is Check");
        driver.findElement(By.xpath("//input[@name='phone' and @id='phone']")).sendKeys("02172256585");
        driver.findElement(By.xpath("//input[@name='alias' and @id='alias']")).sendKeys("158");
        driver.findElement(By.xpath("//input[@name='phone_mobile' and @id='phone_mobile']")).sendKeys("8790348488");
driver.findElement(By.id("submitAccount")).click();
    }
}

