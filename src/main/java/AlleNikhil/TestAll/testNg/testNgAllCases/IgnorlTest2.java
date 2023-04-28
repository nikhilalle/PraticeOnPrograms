package AlleNikhil.TestAll.testNg.testNgAllCases;

import org.testng.annotations.Test;

public class IgnorlTest2 {
    @Test(enabled = false)
    public void test6(){
        System.out.println(" Test 6  Theard id:  "+Thread.currentThread().getId());


    }
    @Test(timeOut = 1)
    public void test7(){
        System.out.println(" Test 7  Theard id:  "+Thread.currentThread().getId());

    }
    @Test
    public void test8(){
        System.out.println(" Test 8  Theard id:  "+Thread.currentThread().getId());

    }
    @Test(enabled=false)
    public void test9(){
        System.out.println(" Test 9  Theard id:  "+Thread.currentThread().getId());

    }
    @Test
    public void test10(){
        System.out.println(" Test 10  Theard id:  "+Thread.currentThread().getId());

    }
    @Test(enabled=false)
    public void test13(){
        System.out.println(" Test 13  Theard id:  "+Thread.currentThread().getId());

    }
    @Test(enabled=true)
    public void test14(){
        System.out.println(" Test 14  Theard id:  "+Thread.currentThread().getId());

    }
//     <exclude name="test1"/>
//                    <include name="test2"/>
//                    <include name="test3"/>
//                    <include name="test4"/>
//                    <include name="test5"/>
//                    <include name="test6"/>
//                    <exclude name="test7"/>
//                    <include name="test8"/>
//                    <include name="test9"/>
//                    <exclude name="test10"/>
}
