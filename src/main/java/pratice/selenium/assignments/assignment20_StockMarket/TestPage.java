package pratice.selenium.assignments.assignment20_StockMarket;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPage extends BasePage{


    @BeforeMethod
    public void openBrowser(){
        initBrowser();

    }
@Test
    public void getDetails(){

        DetailsPage detailsPage=new DetailsPage(getDriver());
        detailsPage.getDetails();
    }
    @AfterMethod
    public void tearDown() {
      // driver.close();
    }
}
