package testNg.annotations;

import org.testng.annotations.Test;

public class Groups {
    @Test(groups = "abc")
    public void get1(){
        System.out.println("  Get Method  1  ");
    }
    @Test(groups = "xyz")
    public void get2(){
        System.out.println("  Get Method  2  ");
    }
    @Test
    public void get3(){
        System.out.println("  Get Method  3  ");
    }
    @Test(groups = "xyz")
    public void get4(){
        System.out.println("  Get Method  4  ");
    }
    @Test(groups = "abc")
    public void get5(){
        System.out.println("  Get Method  5  ");
    }
    @Test
    public void get6(){
        System.out.println("  Get Method  6  ");
    }
    @Test(groups = "xyz")
    public void get7(){
        System.out.println("  Get Method  7  ");
    }
    @Test(groups = "abc")
    public void get8(){
        System.out.println("  Get Method  8  ");
    }
}
