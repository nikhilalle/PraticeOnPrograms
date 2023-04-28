package pratice.corejava.variables;

public class StaticMethodProgram {
    int age=25;
    String name="Shri";
    static String surName="Alle";

    public static void data(){
        System.out.println("Static Method:");
        System.out.println(StaticMethodProgram.surName);
        System.out.println("-------Static Methid--------");

    }

    public static void main(String[] args) {

        StaticMethodProgram obj=new StaticMethodProgram(); // Object Creation i.e obj
        data(); // Directly Call

        System.out.println("Age :" +obj.age);
        System.out.println("Name :"+obj.name);
        System.out.println("Sur-Name :"+surName); // Directly Assign

        System.out.println("-----------------");

        System.out.println("Age :" +obj.age);
        System.out.println("Name :"+obj.name);
        System.out.println("Sur-Name :"+StaticMethodProgram.surName); // By Using Class Name

    }
}
