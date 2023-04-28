package pratice.corejava.variables;

public class VariableProgram {
    int a=10;
    int b=20;
    String name="Shri";

    public void get(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
    }

    public static void main(String[] args) {
        VariableProgram obj=new VariableProgram();
        obj.get();


    }
}
