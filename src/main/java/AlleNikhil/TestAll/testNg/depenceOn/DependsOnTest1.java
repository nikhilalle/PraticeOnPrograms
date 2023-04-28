package AlleNikhil.TestAll.testNg.depenceOn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnTest1 {
    @Test
    public void login() {
        System.out.println("-----Login Page-----");
        Assert.assertEquals(2, 2);
    }

    @Test(dependsOnMethods = "login")
    public void mainFrame() {
        System.out.println("----mainFrame-----");
        Assert.assertEquals(1, 1);
    }

    @Test(dependsOnMethods = "mainFrame")
    public void logOut() {
        System.out.println("-----loginOut----");
    }

    @Test
    public void test1() {
        System.out.println("----Test 1-----");

    }
    @Test
    public void test2() {
        System.out.println("----Test 2-----");

    }
    @Test
    public void test3() {
        System.out.println("----Test 3-----");

    }
    @Test
    public void test4() {
        System.out.println("----Test 4-----");

    }
}
/**
 *-----Login Page-----
 * ----Test 1-----
 * ----Test 2-----
 * ----Test 3-----
 * ----Test 4-----
 * ----mainFrame-----
 * -----loginOut----
 * 1st Execute @Test and After that Depends Methods
 */



