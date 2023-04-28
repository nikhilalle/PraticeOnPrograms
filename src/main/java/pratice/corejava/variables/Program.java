package pratice.corejava.variables;

public class Program {

    public static void setData(){
        System.out.println("I AM IN STATIC METHOD ");
            }

    public static void main(String[] args) {
        Program abc=new Program();  // Another Class Called
        setData(); // Directly Call

        VariableProgram2 obj=new VariableProgram2();
        System.out.println(obj.name); // We can Call By Using Object i.e obj

        System.out.println(VariableProgram2.surname); // Surname is Static so we can Call By Using Class name

        System.out.println(obj.name1);  // We can Call By Using Object i.e obj

        System.out.println(VariableProgram2.surname); // Surname is Static so we can Call By Using Class name

    }
}
