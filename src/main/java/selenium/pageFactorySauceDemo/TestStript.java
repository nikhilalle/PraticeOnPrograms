package selenium.pageFactorySauceDemo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestStript extends BaseClass {

    @BeforeMethod
public void browserInt() throws IOException {
        intiBrowser();

    }


    @Test
    public void logIn(){
        HomePage homePage=new HomePage(getDriver());
        homePage.login();

    }
}
