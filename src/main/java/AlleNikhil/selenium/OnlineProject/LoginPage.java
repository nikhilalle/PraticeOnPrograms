package AlleNikhil.selenium.OnlineProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public void login(WebDriver driver){


     driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
     driver.findElement(By.id("passwd")).sendKeys("admin123");
     driver.findElement(By.id("SubmitLogin")).click();

    }

}
