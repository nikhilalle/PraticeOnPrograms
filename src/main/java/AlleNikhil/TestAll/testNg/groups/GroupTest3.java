package AlleNikhil.TestAll.testNg.groups;

import org.testng.annotations.Test;

public class GroupTest3 {
    /**
    Regression Test 1,10,4
    sanity Test 2,9,5
     Exclude smoke Test 3,8,7
    Normal Test 6
     *  Out Put  *
     GroupTest1  Test 1 method
     GroupTest1 Test 10 method
     GroupTest1 Test 2 method
     GroupTest1 Test 4 method
     GroupTest1 Test 5 method
     GroupTest1 Test 9 method
     **/

    @Test(groups = "Regression")
    public void test1() {
        System.out.println("GroupTest1  Test 1 method");
    }

    @Test(groups = "sanity")
    public void test2() {
        System.out.println("GroupTest1 Test 2 method");
    }

    @Test(groups = "smoke")
    public void test3() {
        System.out.println("GroupTest1 Test 3 method");
    }

    @Test(groups = "Regression")
    public void test4() {
        System.out.println("GroupTest1 Test 4 method");
    }

    @Test(groups = "sanity")
    public void test5() {
        System.out.println("GroupTest1 Test 5 method");
    }

    @Test
    public void test6() {
        System.out.println("GroupTest1 Test 6 method");
    }

    @Test(groups = "smoke")
    public void test7() {
        System.out.println("GroupTest1 Test 7 method");
    }
    @Test(groups = "smoke")
    public void test8() {
        System.out.println("GroupTest1 Test 8 method");
    }
     @Test(groups = "sanity")
    public void test9() {
        System.out.println("GroupTest1 Test 9 method");
    }

    @Test(groups = "Regression")
    public void test10() {
        System.out.println("GroupTest1 Test 10 method");
    }
}
