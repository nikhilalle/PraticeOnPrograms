package AlleNikhil.selenium.faceBookProject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestFaceBook extends BasePage {
    @Test
    public void loginFaceBook(){
        WebDriver driver=driverLink();

        LoginPage loginPage=new LoginPage();
        loginPage.login(driver);

    }
}
