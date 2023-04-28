package pratice.corejava.variableTest;

public class MethodCallInOtherClass {
    public static void main(String[] args) {
        ParameterVariable per=new ParameterVariable();
        per.student(104,"Shruti",'A',96.76f);
        per.student(105,"Avanti",'C',66.76f);
        System.out.println("*******************************************************");
        per.result(201,98.90f);
        per.result(202,78.90f);
    }
}
