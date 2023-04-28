package testNg.AllTest;

import org.testng.annotations.Test;

public class GroupTest {
    @Test(groups = { "Regression", "sanity" })
    public void group_1() {
        System.out.println("I am Group 1  Regression & sanity  ");
    }
    @Test(groups = "Regression")
    public void group_6() {
        System.out.println("I am Group 6   Regression  ");
    }
    @Test(groups = "sanity")
    public void group_2() {
        System.out.println("I am Group 2 sanity ");
    }

    @Test(groups = "smoke")
    public void group_3() {
        System.out.println("I am Group 3  smoke   ");
    }
    @Test(groups = {"smoke","sanity"})
    public void group_4() {
        System.out.println("I am Group 4  smoke   &  sanity");
    }
}

