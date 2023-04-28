package AlleNikhil.TestAll.testNg.pomDataProvider;

import org.testng.annotations.Test;

import java.io.IOException;

public class TestPage extends DetailsPage{
    String name, companyName,  desig, password,  id;
    @Test
    public void verifyLogin() throws IOException {

        DetailsPage page = new DetailsPage();
        page.details();
        page.loginDetails(name,companyName,desig,password,id);

        System.out.println("     :-"   +name+companyName+desig+password+id);
    }
}


