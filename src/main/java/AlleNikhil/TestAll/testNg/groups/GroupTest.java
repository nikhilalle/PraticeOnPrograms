package AlleNikhil.TestAll.testNg.groups;

import org.testng.annotations.Test;

public class GroupTest {
    /**
    Regression Test 1,10
    sanity Test 2,9
    smoke Test 3,8
    Normal Test 4,5,6,7
     *  Out Put  *
    In Test 1 method
    In Test 10 method
    In Test 2 method
    In Test 3 method
    In Test 8 method
    In Test 9 method
     **/

    @Test(groups = "Regression")
    public void test1() {
        System.out.println("In Test 1 method");
    }

    @Test(groups = "sanity")
    public void test2() {
        System.out.println("In Test 2 method");
    }

    @Test(groups = "smoke")
    public void test3() {
        System.out.println("In Test 3 method");
    }

   @Test
    public void test4() {
        System.out.println("In Test 4 method");
    }

    @Test
    public void test5() {
        System.out.println("In Test 5 method");
    }
    @Test
    public void test6() {
        System.out.println("In Test 6 method");
    }

    @Test
    public void test7() {
        System.out.println("In Test 7 method");
    }
    @Test(groups = "smoke")
    public void test8() {
        System.out.println("In Test 8 method");
    }
     @Test(groups = "sanity")
    public void test9() {
        System.out.println("In Test 9 method");
    }

    @Test(groups = "Regression")
    public void test10() {
        System.out.println("In Test 10 method");
    }
}
