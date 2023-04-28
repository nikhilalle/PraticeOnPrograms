package AlleNikhil.TestAll.TestNGPratice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTestCases {

    @Test(enabled = false)
    public void test1() {
        System.out.println("IgnoreTestCases Test 1 method");
    }

    @Test(enabled = true)
    public void test2() {
        System.out.println("IgnoreTestCases Test 2 method");
    }

    @Test
    public void test3() { System.out.println("IgnoreTestCases Test 3 method"); }

    @Test
    public void test4() { System.out.println("IgnoreTestCases Test 4 method"); }

    @Test @Ignore
    public void test5() { System.out.println("IgnoreTestCases Test 5 method"); }

    @Test
    public void test6() { System.out.println("IgnoreTestCases Test 6 method"); }

   // @Test
    public void test7() { System.out.println("IgnoreTestCases Test 7 method"); }


}
