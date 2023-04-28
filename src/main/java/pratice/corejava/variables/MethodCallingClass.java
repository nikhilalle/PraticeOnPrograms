package pratice.corejava.variables;

public class MethodCallingClass {
    public void get(EmployeeClass e){
        System.out.println(e.companyName);
        System.out.println(e.iD);
        System.out.println(e.division);
        System.out.println("------------------");

    }
    public void set(StudentClass s){
        System.out.println(s.Name);
        System.out.println(s.classNo);
        System.out.println(s.rollNo);
        System.out.println(s.rank);
    }
    public void set(VariableProgram5 v){
        VariableProgram5 var =new VariableProgram5();

        System.out.println(v.iD1);
        System.out.println(v.name1);
        System.out.println(VariableProgram5.companyName);
        System.out.println("_______________");

        System.out.println(v.iD2);
        System.out.println(v.name2);
        System.out.println(VariableProgram5.companyName);
        System.out.println("_______________");

        System.out.println(v.iD3);
        System.out.println(v.name3);
        System.out.println(VariableProgram5.companyName);
        System.out.println("_______________");

        System.out.println(v.iD4);
        System.out.println(v.name4);
        System.out.println(VariableProgram5.companyName);
        System.out.println("_______________");

        System.out.println(v.iD5);
        System.out.println(v.name5);
        System.out.println(VariableProgram5.companyName);
        System.out.println("_______________");

    }

    public static void main(String[] args) {
        StudentClass st=new StudentClass();
        EmployeeClass emp=new EmployeeClass();
        VariableProgram5 var =new VariableProgram5();

        MethodCallingClass obj=new MethodCallingClass();

        obj.get(emp);
        obj.set(st);
        obj.set(var);
    }
}
