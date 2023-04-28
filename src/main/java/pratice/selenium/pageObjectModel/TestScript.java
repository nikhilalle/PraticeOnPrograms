package pratice.selenium.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestScript extends BaseClass{

    WebDriver driver;
@BeforeMethod
public void web(){
    initialization();
}
    @Test
    public void login() {
        HomePage homePage=new HomePage(getDriver());
        homePage.loginPage();
    }
}
