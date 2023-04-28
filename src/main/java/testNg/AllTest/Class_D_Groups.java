package testNg.AllTest;

import org.testng.annotations.Test;

public class Class_D_Groups {

    @Test (groups = "regression")
    public void group_11(){
        System.out.println("I am Group 11");
    }
    @Test(groups = "sanity")
    public void group_12(){
        System.out.println("I am Group 12");
    }
    @Test(groups = "smoke")
    public void group_13(){
        System.out.println("I am Group 13");
    }
    @Test
    public void group_14(){
        System.out.println("I am Group 14");
    }
    @Test(groups = "regression")
    public void group_15(){
        System.out.println("I am Group 15");
    }
    @Test(groups = "sanity")
    public void group_16(){
        System.out.println("I am Group 16 ");
    }
    @Test
    public void group_17(){
        System.out.println("I am Group 17");
    }
    @Test(groups = "regression")
    public void group_18(){
        System.out.println("I am Group 18");
    }
    @Test (groups = "sanity")
    public void group_19(){
        System.out.println("I am Group 19");
    }
    @Test(groups = "regression")
    public void group_20(){
        System.out.println("I am Group 20 ");
    }
}

// Not Execute :- 14 , 17
