package pratice.corejava.Constructor;

public class ConstructorChaining {

    ConstructorChaining(){
        this(29); // Using This Keyword We Can Call Constructor  its Parameters

        System.out.println("I am in  1st  Constructor"); // 3rd

    }
    ConstructorChaining(int a){
        this("Nikhil");
        System.out.println("I am in  2nd  Constructor"); // 2nd

    }
    ConstructorChaining(String name){
        System.out.println("I am in  3rd  Constructor"); // 1 st

    }

    public static void main(String[] args) {
        new ConstructorChaining();
    }
}
