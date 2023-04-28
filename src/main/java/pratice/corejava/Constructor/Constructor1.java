package pratice.corejava.Constructor;

import java.text.SimpleDateFormat;

public class Constructor1 {
    int rollNo;
    String name;
    public Constructor1(){
        System.out.println("I Am in Non-Para-Constructor");
    }
    public Constructor1(int rollNo,String name){
        System.out.println("I am Para-Constructor");

        System.out.println("Roll No:"+rollNo);
        System.out.println("Name :"+name);

        SimpleDateFormat date=new SimpleDateFormat();
        System.out.println(date);

    }

    public static void main(String[] args) {
        new Constructor1();
        new Constructor1(102,"Shri");
        new Constructor1(103,"Nikhil");

    }
}
