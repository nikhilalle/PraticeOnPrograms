package pratice.selenium.sauceDemoProjectModel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestPage extends BasePage {
    @Test
    public void addCard() throws InterruptedException {
        WebDriver driver = webBrowser();
        Thread.sleep(3500);
        LoginPage loginPage = new LoginPage(driver);

        loginPage.loginHost("standard_user", "secret_sauce");
        Thread.sleep(3500);
        CartPage cart = new CartPage(driver);
        cart.addToCart();
        Thread.sleep(3500);

        UserDetailsPage userDetailsPage = new UserDetailsPage(driver);
        userDetailsPage.userDetails("Alle", "Nikhil", "413005");

        // Checking For CHECKOUT: COMPLETE or NOT

        cart.verifycheckoutComplete();

    }
}
