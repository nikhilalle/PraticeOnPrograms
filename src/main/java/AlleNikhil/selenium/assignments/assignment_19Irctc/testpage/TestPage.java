package AlleNikhil.selenium.assignments.assignment_19Irctc.testpage;

import com.matrix.AlleNikhil.selenium.assignments.assignment_19Irctc.searchPage.SearchPage;
import com.matrix.AlleNikhil.selenium.assignments.assignment_19Irctc.basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestPage extends BasePage {
    WebDriver driver;
    @BeforeMethod
    public void openBrowser() throws IOException {
        intBrowser(readProperties().getProperty("TrainUrl"));
    }
@Test
    public void checkDetails(){
    SearchPage searchPage=new SearchPage(getDriver());
    searchPage.searchTrains();

}
    }


