package testNg.annotations;

import org.testng.annotations.*;

public class Annotations {
    @BeforeSuite
    public void get1(){
        System.out.println(" Before  Suite    ");
    }
    @BeforeTest
    public void get2(){
        System.out.println(" Before  Test   ");
    }
    @BeforeClass
    public void get3(){
        System.out.println(" Before  Class    ");
    }
    @BeforeMethod
    public void get4(){
        System.out.println(" Before   Method    ");
    }
    @Test
    public void get5(){
        System.out.println("      @Test  1   ");
    }
    @Test
    public void get10(){
        System.out.println("      @Test  2    ");
    }
    @AfterMethod
    public void get6(){
        System.out.println(" After   Method    ");
        System.out.println("------------------");
    }
    @AfterClass
    public void get7(){
        System.out.println(" After   Class    ");
    }
    @AfterTest
    public void get8(){
        System.out.println(" After  Test    ");
    }
    @AfterSuite
    public void get9(){
        System.out.println(" After   Suite    ");
    }


}
