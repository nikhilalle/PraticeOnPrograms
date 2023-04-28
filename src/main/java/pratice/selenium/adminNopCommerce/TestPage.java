package pratice.selenium.adminNopCommerce;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestPage extends BasePage {
    @Test
    public void homeLogin(){
        WebDriver driver=webdriverLink();

        LoginPage loginPage=new LoginPage();
        loginPage.login(driver);





    }
}
