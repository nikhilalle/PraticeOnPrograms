package AlleNikhil.TestAll.newListener.listnese;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersTest.class)
public class ClassListeners {

    WebDriver driver;

    @Test
    public void test_1() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @Test
    public void test_2() {
        int a = 10, b = 20;
        System.out.println(+a + "  " + b);
        Assert.assertEquals(a, b);
    }

    @Test
    public void test_3() {
        int a = 450, b = 450;
        System.out.println(+a + "  " + b);
        Assert.assertEquals(a, b);
    }

   @Test
    public void test_4() {
        int a = 45055, b = 450;
        System.out.println(+a + "  " + b);
        Assert.assertEquals(a, b);
    }

}
