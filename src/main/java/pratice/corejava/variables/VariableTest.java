package pratice.corejava.variables;

public class VariableTest {
    int jobId1=101;
    String name1="Shri";
    static String compName="TCS";

    int jobId2=102;
    String name2="Nikhil";

    public void details(){
        System.out.println(jobId1);
        System.out.println(name1);
        System.out.println(compName);
    }
    public void details1(){
        System.out.println(jobId2);
        System.out.println(name2);
        System.out.println(compName);

    }


    public static void main(String[] args) {
        VariableTest var=new VariableTest();
        var.details();
        System.out.println("___________");
        var.details1();

    }
}
