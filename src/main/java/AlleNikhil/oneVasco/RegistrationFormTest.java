package AlleNikhil.oneVasco;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationFormTest extends BasePage {

WebDriver driver;
    @BeforeMethod
    public void browserInitiate(){
        initiateBrowser();
    }
    @Test
    public void registrationForm() throws InterruptedException {
        RegistrationPage registrationPage=new RegistrationPage(getDriver());
        registrationPage.userRegistration();

    }

}
