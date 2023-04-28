package testNg.AllTest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Class_B_Ignore {

    @Test
    @Ignore
    public void group_1(){
        System.out.println("I am Group 1");
    }
    @Test
    public void group_2(){
        System.out.println("I am Group 2");
    }
    @Test(enabled = false)
    public void group_3(){
        System.out.println("I am Group 3");
    }
    @Test
    public void group_4(){
        System.out.println("I am Group 4");
    }
    @Test
    public void group_5(){
        System.out.println("I am Group 5");
    }
    @Test //Exclude in TestNg.Xml File
    public void group_6(){
        System.out.println("I am Group 6 ");
    }
    @Test
    public void group_7(){
        System.out.println("I am Group 7");
    }
    //@Test
    public void group_8(){
        System.out.println("I am Group 8");
    }
    @Test @Ignore
    public void group_9(){
        System.out.println("I am Group 9");
    }
    @Test
    public void group_10(){
        System.out.println("I am Group 10 ");
    }
}
// Execute :- 2 , 4 , 5 ,7 , 10.

// Not Execute :-  1 , 3 , 6 , 8 , 9.
/*  OUT PUT
I am Group 2
I am Group 4
I am Group 5
I am Group 7
I am Group 10
*/