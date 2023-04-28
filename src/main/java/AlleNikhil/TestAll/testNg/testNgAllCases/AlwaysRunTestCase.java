package AlleNikhil.TestAll.testNg.testNgAllCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunTestCase {
    @Test
    public void test1(){
        System.out.println(" Test 1  Theard id:  "+Thread.currentThread().getId());


    }
    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println(" Test 2  Theard id:  "+Thread.currentThread().getId());

    }
    @Test
    public void test3(){
        System.out.println(" Test 3  Theard id:  "+Thread.currentThread().getId());

    }
    @Test(dependsOnMethods = "test5")
    public void test4(){
        System.out.println(" Test 4  Theard id:  "+Thread.currentThread().getId());

    }
    @Test
    public void test5(){
        System.out.println(" Test 5  Theard id:  "+Thread.currentThread().getId());
Assert.assertEquals(56,89);
    }
    @Test(alwaysRun = true)
    public void test6(){
        System.out.println(" Test 6  Theard id:  "+Thread.currentThread().getId());


    }
    @Test(alwaysRun = true)
    public void test7(){
        System.out.println(" Test 7  Theard id:  "+Thread.currentThread().getId());
        Assert.assertEquals(12,17);

    }
    @Test
    public void test8(){
        System.out.println(" Test 8  Theard id:  "+Thread.currentThread().getId());

    }
    @Test(alwaysRun = false)
    public void test9(){
        System.out.println(" Test 9  Theard id:  "+Thread.currentThread().getId());

    }
    @Test
    public void test10(){
        System.out.println(" Test 10  Theard id:  "+Thread.currentThread().getId());

    }
}
