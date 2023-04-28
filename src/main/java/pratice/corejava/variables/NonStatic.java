package pratice.corejava.variables;

public class NonStatic {
    int rollNo = 10;
    String name = "Nikhil";
    String division = "ABC";

    public static void main(String[] args) {
        NonStatic obj = new NonStatic();
        System.out.println(obj.rollNo);
        System.out.println(obj.name);
        System.out.println(obj.division);
    }
}
