package AlleNikhil.TestAll.testNg.depenceOn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnTest {
    @Test
    public void login() {
        System.out.println("-----Login Page-----");
        Assert.assertEquals(2, 2);
    }

    @Test(dependsOnMethods = "login")
    public void mainFrame() {
        System.out.println("----mainFrame-----");
        Assert.assertEquals(1, 2);
    }

    @Test(dependsOnMethods = "mainFrame")
    public void logOut() {
        System.out.println("-----loginOut----");
    }
}
/**
 * -----Login Page-----
 * ----mainFrame-----
 * error after not moving forward due to dependsOnMethods = "mainFrame";
 * soo logOut() Method  not Invoked
 * when mainFrame will Run Properly then & Then logOut() Method Execute
 * java.lang.AssertionError:
 * Expected :2
 * Actual   :1
 */



