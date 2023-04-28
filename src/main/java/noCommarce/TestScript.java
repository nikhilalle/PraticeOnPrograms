package noCommarce;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestScript extends BaseClass {


    @BeforeMethod
    public void openApplication() throws IOException {
     intiBrowser();
    }
   @Test
    public void applicationOpen(){
        RegisterTheApplication registerTheApplication=new RegisterTheApplication(getDriver());
        registerTheApplication.registration();
        String actual =registerTheApplication.errorMessageCheck();
       Assert.assertEquals(actual,"The specified email already exists");

    }
   // @Test
    public void loginApplication(){
        LoginTheApplication loginTheApplication=new LoginTheApplication(getDriver());
        loginTheApplication.login();


    }
   @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
