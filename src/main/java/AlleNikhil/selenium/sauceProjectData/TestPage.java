package AlleNikhil.selenium.sauceProjectData;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestPage extends BasePage {

    @Test
    public void mainLogin(){
      WebDriver driver= browser();

        /*
        BasePage basePage=new BasePage();
        WebDriver driver=basePage.browser();
         */
         /**
          *  i can use also this Logic but it is not recommended
          *   Browser () is Return by driver value so
          *   Webdriver driver is Store Driver Value and using this Driver Veriable
          *   i will FindElement in MainLogin() Method
          *
         **/

       MainLoginPage loginPage=new MainLoginPage(driver);

       loginPage.login("standard_user","secret_sauce");
    }
}
