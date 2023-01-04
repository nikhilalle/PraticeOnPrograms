package bhanne.testscript;

import bhanne.base.BaseClass;
import bhanne.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;


public class TestClass extends BaseClass {

    HomePage homePage;
    @BeforeMethod
    public void openBrowser() throws IOException {
        initBrowser(readProperties().getProperty("url"));
        homePage = new HomePage(getDriver());
    }

    @Test
    public void verifyLogin () throws InterruptedException {
        homePage.createAccount(getDriver());

    }
}