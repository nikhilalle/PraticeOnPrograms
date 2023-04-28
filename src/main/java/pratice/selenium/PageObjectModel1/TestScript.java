package pratice.selenium.PageObjectModel1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestScript extends BaseClass {
    WebDriver driver;
    @BeforeMethod
    public void initilaztion(){
        init();
    }
@Test
    public void testScript(){
        HomePage homePage=new HomePage(getDriver());
        homePage.login();
        homePage.addToCart();
        homePage.enterDetails();
}
}
