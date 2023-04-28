package pratice.corejava.variables;

public class StaticVariableTest {
    static int jobId1=101;
   static String name1="Shri";
    static String compName="TCS";

    static String fullName="Alle";
    /*
    * This is Static Variable and Non Static Method Call By Using Class Name / Directly Call
     */

    public void details(){
        System.out.println(jobId1); //Static Variable and Non Static Method Directly Call
        System.out.println(name1); //Static Variable and Non Static Method Directly Call
        System.out.println(StaticVariableTest.compName); // Static Variable and Non Static Method Using Class Name
        System.out.println("_______________________");
    }

    int jobId2=101;
    String name2="Shri";
    String compName2="TCS";

    /*
     * This is  Non-Static Variable and  Static Method Call By Using Object Creation
     */

    public static void data(){
        StaticVariableTest var=new StaticVariableTest();
        System.out.println(var.jobId2); // Non-Static Variable and  Static Method Call By Using Object Creation
        System.out.println(var.name2);
        System.out.println(var.compName2);

        System.out.println(StaticVariableTest.fullName); // Static Variable and  Static Method Call By Using Class Name
        System.out.println("_______________________");
    }

    public static void main(String[] args) {
        StaticVariableTest str=new StaticVariableTest();
        str.details(); // Non-Static Method Call By Using Object Creation
        StaticVariableTest.data(); //  Static Method Call By Using Class Name

    }
}
