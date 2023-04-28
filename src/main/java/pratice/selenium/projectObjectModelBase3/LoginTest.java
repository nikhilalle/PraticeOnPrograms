package pratice.selenium.projectObjectModelBase3;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTest extends BasePage{
    @Test
    public void verifyPageLogin(){
        initBrowser();
        LoginPage loginPage=new LoginPage(driver);
        loginPage.loginContactUs(driver);
        loginPage.signIn("alle@gmail.com","12343","Test New Messages on New Page");

    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
