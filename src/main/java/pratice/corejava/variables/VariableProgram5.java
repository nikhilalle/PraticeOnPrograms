package pratice.corejava.variables;

public class VariableProgram5 {
    int iD1=101;
    String name1="Shri";

    static String companyName="TCS";

    int iD2=102;
    String name2="Nikhil";
    int iD3=103;
    String name3="Shruti";
    int iD4=104;
    String name4="Harika";
    int iD5=105;
    String name5="Pratham";


    public static void main(String[] args) {
        VariableProgram5 obj = new VariableProgram5();
        System.out.println(obj.iD1);
        System.out.println(obj.name1);
        System.out.println(VariableProgram5.companyName);
        System.out.println("------------------------");
        System.out.println(obj.iD2);
        System.out.println(obj.name2);
        System.out.println(VariableProgram5.companyName);
        System.out.println("------------------------");
        System.out.println(obj.iD3);
        System.out.println(obj.name3);
        System.out.println(VariableProgram5.companyName);
        System.out.println("------------------------");
        System.out.println(obj.iD4);
        System.out.println(obj.name4);
        System.out.println(VariableProgram5.companyName);
        System.out.println("------------------------");
        System.out.println(obj.iD5);
        System.out.println(obj.name5);
        System.out.println(VariableProgram5.companyName);

    }

}
