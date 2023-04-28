package AlleNikhil.TestAll.testNg.testNgPratice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFlow {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("-- beforeMethod --");
    }
    @Test
    public void test1() {
        System.out.println("-- Test1 --");
    }

    @Test
    public void test2() {
        System.out.println("-- Test2 --");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("-- afterMethod --");
        System.out.println("---------------------");
    }

}
