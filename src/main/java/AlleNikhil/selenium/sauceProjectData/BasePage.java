package AlleNikhil.selenium.sauceProjectData;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public WebDriver browser() {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        return driver;
    }

        /**

         * here I am Creating Driver Link now all Data Are Stored in Browser () Method in BasePage (i.e Class)
         * now i want to this driver into Login Page so  i am return Driver into TestPage i.e MainPage
         *
         * driver.findElement(By.id("user-name")).sendKeys("standard_user");
         * driver.findElement(By.id("password")).sendKeys("secret_sauce");
         * driver.findElement(By.id("login-button")).click();
         **/

}

