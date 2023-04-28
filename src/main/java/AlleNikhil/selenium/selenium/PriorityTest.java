package AlleNikhil.selenium.selenium;

import org.testng.annotations.Test;

public class PriorityTest {
    @Test(priority = 9)
    public void a(){
        System.out.println("I am in A Method Priority: 9 ");
    }
    @Test(priority = 5)
    public void e(){
        System.out.println("I am in E Method Priority: 5 ");
    }
    @Test(priority = 3)
    public void c(){
        System.out.println("I am in C Method Priority:  3");
    }
    @Test(priority = 4)
    public void b(){
        System.out.println("I am in B Method Priority: 4 ");
    }
    @Test(priority = 7)
    public void d(){
        System.out.println("I am in D Method Priority: 7 ");
    }
    @Test(priority = 2)
    public void f(){
        System.out.println("I am in D Method Priority: 2 ");
    }
    @Test(priority = 0)
    public void l(){
        System.out.println("I am in L Method Priority: 0 ");
    }
}
