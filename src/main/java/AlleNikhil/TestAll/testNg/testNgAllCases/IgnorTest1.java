package AlleNikhil.TestAll.testNg.testNgAllCases;

import org.testng.annotations.Test;

public class IgnorTest1 {
    @Test
    public void test1(){
        System.out.println(" Test 1  Theard id:  "+Thread.currentThread().getId());
    }
    @Test(enabled = false)
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
    @Test(enabled=false)
    public void test5(){
        System.out.println(" Test 5  Theard id:  "+Thread.currentThread().getId());
    }
    @Test(enabled=true)
    public void test11(){
        System.out.println(" Test 11  Theard id:  "+Thread.currentThread().getId());
    }
    @Test(enabled=false)
    public void test12(){
        System.out.println(" Test 12  Theard id:  "+Thread.currentThread().getId());
    }
    // Test Case 2,5,6,9 Not Executed Because We Assigned Ignore @Test(enabled=false)
    // Test Case 1,7,10 Not Executed Because We Assigned Exclude In .Xml File
    // Test Case  12,13 Not Executed Because We Assigned Ignore @Test(enabled=false)
    // Test Case  11,14 Executed Because We Assigned Ignore @Test(enabled=true)
    //  Test 3,4,,8 ,11,14 will Be Executed
    // OutPut :-
//    Test 3  Theard id:  1
//    Test 4  Theard id:  1
//    Test 11  Theard id:  1
//    Test 8  Theard id:  1
//    Test 14  Theard id:  1
}
