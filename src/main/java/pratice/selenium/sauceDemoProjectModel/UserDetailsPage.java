package pratice.selenium.sauceDemoProjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserDetailsPage {
    WebDriver driver;
    UserDetailsPage (WebDriver driver){
        this.driver=driver;
    }
    public void userDetails(String firstname,String latsName,String Pincode){
        driver.findElement(By.id("first-name")).sendKeys(firstname);
        driver.findElement(By.id("last-name")).sendKeys(latsName);
        driver.findElement(By.id("postal-code")).sendKeys(Pincode);
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
    }
}
