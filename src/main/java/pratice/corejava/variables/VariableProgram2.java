package pratice.corejava.variables;

public class VariableProgram2 {
    String name="Shri";
    String name1="Nikhil";
    static String surname="Alle"; //Static Variable

    public void get(){
        System.out.println("Name :"+name);
        System.out.println("Sur-Name :"+VariableProgram2.surname); //Static Variable
        System.out.println("Name :"+name1);
        System.out.println("Sur-Name :"+VariableProgram2.surname); //Static Variable
    }

    public static void main(String[] args) {
        VariableProgram2 obj=new VariableProgram2();
        obj.get();
    }
}
