package AlleNikhil.selenium.sauceProjectTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestPage extends BasePage {
    @Test
    public void login(){

        WebDriver driver=link();

        LoginPage loginPage=new LoginPage(driver);
        loginPage.logindata("standard_user","secret_sauce");



    }




}


