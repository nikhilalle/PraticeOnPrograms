package testNg.annotations;

import org.testng.annotations.Test;

public class DependSOnMethod1 {
    @Test
    public void get1(){
        System.out.println("  Get Method  1  ");
    }
    @Test(dependsOnMethods="get1")
    public void get2(){
        System.out.println("  Get Method  2  ");
    }
    //  @Test
    public void get3(){
        System.out.println("  Get Method  3  ");
    }
    @Test(dependsOnMethods = "get2")
    public void get4(){
        System.out.println("  Get Method  4  ");
    }
    @Test(dependsOnMethods = "get3")
    public void get5(){
        System.out.println("  Get Method  5  ");
    }
}
