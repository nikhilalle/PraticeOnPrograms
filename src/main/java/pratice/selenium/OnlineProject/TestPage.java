package pratice.selenium.OnlineProject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestPage extends BasePage {
    @Test
public void mainPage(){

       // BasePage page=new BasePage();
      // WebDriver driver= page.link();

       WebDriver driver=link();

        LoginPage loginPage=new LoginPage();
        loginPage.login(driver);







    }
}
