package pratice.corejava.variableTest;

public class ParameterVariable {
static String collegeName="Pune University";
    public void student(int rollNo,String name,char div,float percentage){

        System.out.print(rollNo+"  ");
        System.out.print(name+"  ");
        System.out.print(div+"  ");
        System.out.print(percentage+"  ");
        System.out.println(collegeName);
        System.out.println("-----------------");
    }
    public void result(int rollNo,float percentage){

        System.out.print(rollNo+"  ");
        System.out.print(percentage+"  ");
        System.out.println(collegeName);
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
       ParameterVariable per=new ParameterVariable();
       per.student(101,"Pooja",'A',56.76f);
        per.student(102,"Nikhil",'A',86.56f);
        per.student(103,"Pranav",'D',96.36f);
        per.student(104,"Shruti",'A',96.76f);
        per.student(105,"Avanti",'C',66.76f);
        System.out.println("*******************************************************");
        per.result(201,98.90f);
        per.result(202,78.90f);
        per.result(203,88.90f);



    }
}
