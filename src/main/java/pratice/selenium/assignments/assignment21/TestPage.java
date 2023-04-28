package pratice.selenium.assignments.assignment21;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPage extends BasePage {

    @BeforeMethod
    public void intBroswer() {
        browser();
    }

    @Test
    public void verifyPage() throws InterruptedException {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.signUpPage();
        CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage(getDriver());
        createNewAccountPage.createAccount();
        AddToCart addToCart = new AddToCart(getDriver());
        addToCart.cartAdd();
        ShippingAddress shpping = new ShippingAddress(driver);
        shpping.shippinLogin();


    }


}

