package pratice.corejava.variables;

public class StaticVariable {
    static int a=29;
    static String name="Shri";
    static String surName="Alle";

    public static void data(){
        System.out.println("Age:"+a); // Directly
        System.out.println("Name : "+StaticVariable.name); //By Using Class Name
        System.out.println("Sur-Name: "+surName); // Directly

    }

    public static void main(String[] args) {
        new StaticVariable();
        data(); // Directly Call
        System.out.println("-------------------");
        StaticVariable.data(); // By Using Class Name Call
    }
}
