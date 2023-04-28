package pratice.programs;

import org.testng.annotations.Test;

public class StringForLoop {
    @Test
    public void forString(){
        String name="Nikhilesh is my Best Friend";
        System.out.println(name);
        String [] str=name.split(" ");
       //  Nikhilesh   is my Best Friend
        //    0        1  2   3    4
for(int i=0;i<=4;i++){
    System.out.println(str[i]);
}
    }


    @Test
    public void stringReverse(){
        String name="Nikhilesh is my Best Friend";
        System.out.println(name);
        System.out.println();
        System.out.println("Reverse");
        String [] str=name.split(" ");
        //  Nikhilesh   is my Best Friend
        //    0        1  2   3    4
       for(int i=4;i>=0;i--){
           System.out.println(str[i]);
       }
    }

    @Test
    public void stringForward(){
        String name="Nikhilesh is my Best Friend";
        System.out.println(name);
        System.out.println();

        String [] str=name.split(" ");
        System.out.println(str.length);
        for(int i=0;i< str.length;i++){
            System.out.println(str[i]);
        }
    }
    @Test
    public void stringForward1(){
        String name="Nikhilesh is my Best Friend Pooja my Best Friend as well as Pranali is my Best Friend";
        System.out.println(name);
        System.out.println();

        String [] str=name.split(" ");
        System.out.println(str.length);
        for(int i=0;i< str.length;i++){
            System.out.println(str[i]);
        }
    }

    @Test
    public void stringReverse1(){
        String name="Nikhilesh is my Best Friend Pooja my Best Friend as well as Pranali is my Best Friend";
        System.out.println(name);
        System.out.println();
        String [] str=name.split(" ");
        System.out.println(str.length);
        System.out.println("--------------------");
        for(int i=str.length-1;i>=0;i--){
            System.out.println(str[i]);
        }
    }
}
