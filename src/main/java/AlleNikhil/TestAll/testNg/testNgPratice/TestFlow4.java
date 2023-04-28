package AlleNikhil.TestAll.testNg.testNgPratice;

import org.testng.annotations.*;

public class TestFlow4 {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("-- BeforeSuite --");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("-- BeforeTest --");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("-- BeforeClass --");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("-- BeforeMethod --");
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
        System.out.println("-- AfterMethod --");
        System.out.println("---------------------");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("-- AfterClass --");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("-- AfterTest --");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("-- AfterSuite --");
    }
}
