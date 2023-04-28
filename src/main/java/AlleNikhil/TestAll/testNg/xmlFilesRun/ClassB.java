package AlleNikhil.TestAll.testNg.xmlFilesRun;

import org.testng.annotations.Test;

public class ClassB {
    @Test
    public void test21(){
        System.out.println(" Test 21  Theard id:  "+Thread.currentThread().getId());


    }
    @Test
    public void test22(){
        System.out.println(" Test 22  Theard id:  "+Thread.currentThread().getId());

    }
    @Test
    public void test23(){
        System.out.println(" Test 23  Theard id:  "+Thread.currentThread().getId());

    }
    @Test
    public void test24(){
        System.out.println(" Test 24  Theard id:  "+Thread.currentThread().getId());

    }
}
