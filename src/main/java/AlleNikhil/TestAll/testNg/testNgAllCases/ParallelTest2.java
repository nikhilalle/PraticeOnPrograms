package AlleNikhil.TestAll.testNg.testNgAllCases;

import org.testng.annotations.Test;

public class ParallelTest2 {
    @Test
    public void test6(){
        System.out.println(" Test 6  Theard id:  "+Thread.currentThread().getId());

    }
    @Test
    public void test7(){
        System.out.println(" Test 7  Theard id:  "+Thread.currentThread().getId());

    }
    @Test
    public void test8(){
        System.out.println(" Test 8  Theard id:  "+Thread.currentThread().getId());

    }
    @Test
    public void test9(){
        System.out.println(" Test 9  Theard id:  "+Thread.currentThread().getId());

    }
    @Test
    public void test10(){
        System.out.println(" Test 10  Theard id:  "+Thread.currentThread().getId());

    }
}
