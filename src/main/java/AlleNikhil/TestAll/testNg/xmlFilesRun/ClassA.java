package AlleNikhil.TestAll.testNg.xmlFilesRun;

import org.testng.annotations.Test;

public class ClassA {
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
}
