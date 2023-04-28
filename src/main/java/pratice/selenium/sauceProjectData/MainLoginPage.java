package pratice.selenium.sauceProjectData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainLoginPage {
    WebDriver driver;
    public MainLoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void login(String user,String password ){

         driver.findElement(By.id("user-name")).sendKeys(user);
         driver.findElement(By.id("password")).sendKeys(password);
         driver.findElement(By.id("login-button")).click();

        }

    /**
     *  i want to driver to findElemet so,
     *  driver is available in Base-Page (i.e Class) and is retuning in Test-Page in Browser() (i.e Main Program)
     *  it was Stored in Webdriver driver
     *  using return Driver i am Calling in my method As Parameter so here i am used in This Login Method
     * i.e dr it is Return in WebDriver
     */
}


