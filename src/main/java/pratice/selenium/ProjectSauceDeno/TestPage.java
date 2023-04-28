package pratice.selenium.ProjectSauceDeno;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestPage extends BasePage {
    @Test
    public void login(){

        WebDriver driver=webLink();

        LoginPage loginPage=new LoginPage(driver);
        loginPage.userLogin("standard_user","secret_sauce");

        loginPage.addToCart("Nikhilesh","Alle");
    }
}
