package AlleNikhil.TestAll.testNg.testNgPratice;

import org.testng.annotations.Test;

public class ListenerTest {
    @Test
    public void test1(){
        System.out.println(" Test 1  Theard id:  "+Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.println(" Test 2  Theard id:  "+Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.println(" Test 3  Theard id:  "+Thread.currentThread().getId());
    }
    @Test
    public void test4(){
        System.out.println(" Test 4  Theard id:  "+Thread.currentThread().getId());
    }
    @Test
    public void test5(){
        System.out.println(" Test 5  Theard id:  "+Thread.currentThread().getId());
    }
}
