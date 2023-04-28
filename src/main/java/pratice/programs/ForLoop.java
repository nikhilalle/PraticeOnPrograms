package pratice.programs;

import org.testng.annotations.Test;

public class ForLoop {
    @Test
    public  void m1() {
        java.lang.String name="Nikhil";
        for(int i=1;i<=5;i++){
            System.out.println(name);
        }
    }
    @Test
    public  void m2() {
        System.out.println("----------------");
        java.lang.String name="Nikhil";
        for(int i=0;i<5;i++){
            System.out.println(name);
        }
    }
    @Test
    public  void m3() {
        java.lang.String name="Nikhil";
        String name1="Pooja Pranali";

        for(int i=1;i<=5;)
        {
            System.out.println(+i+name1);
            i++;
        }
    }
    @Test
    public  void m4() {
        java.lang.String name="Nikhil";
        String name1="Pooja Pranali";

        for(int i=5;i>=0;)
        {
            System.out.println(+i+name1);
            i--;
        }
    }
    @Test
    public  void m5() {
        java.lang.String name="Nikhil";
        String name1="Pooja Pranali";
        for(int i=5;i>0;i--){
            System.out.println(+i+name1);

        }
    }

}
