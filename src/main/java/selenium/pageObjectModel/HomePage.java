package selenium.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class HomePage extends ActionClass {
//    ActionClass action = new ActionClass();

    WebDriver driver;
    public HomePage (WebDriver driver){
        this.driver=driver;
    }
    By userName = By.id("user-name");
    By password = By.id("password");
    By login = By.id("login-button");


    @Test
    public void loginPage(){
       type(driver,userName,"standard_user");
     type(driver,password,"secret_sauce");
       clickOnElement(driver,login);
    }
    @Test
    public void loginAddToCart(){


    }

}
