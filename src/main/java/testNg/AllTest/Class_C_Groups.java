package testNg.AllTest;

import org.testng.annotations.Test;

public class Class_C_Groups {

    @Test (groups = "regression")
    public void group_1(){
        System.out.println("I am Group 1");
    }
    @Test(groups = "sanity")
    public void group_2(){
        System.out.println("I am Group 2");
    }
    @Test(groups = "smoke")
    public void group_3(){
        System.out.println("I am Group 3");
    }
    @Test
    public void group_4(){
        System.out.println("I am Group 4");
    }
    @Test(groups = "regression")
    public void group_5(){
        System.out.println("I am Group 5");
    }
    @Test(groups = "sanity")
    public void group_6(){
        System.out.println("I am Group 6 ");
    }
    @Test
    public void group_7(){
        System.out.println("I am Group 7");
    }
    @Test(groups = "regression")
    public void group_8(){
        System.out.println("I am Group 8");
    }
    @Test (groups = "sanity")
    public void group_9(){
        System.out.println("I am Group 9");
    }
    @Test(groups = "regression")
    public void group_10(){
        System.out.println("I am Group 10 ");
    }
}

// Not Execute :- 4 , 7
