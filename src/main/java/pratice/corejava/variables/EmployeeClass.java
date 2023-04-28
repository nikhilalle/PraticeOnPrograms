package pratice.corejava.variables;

public class EmployeeClass {
    int iD=101;
    String division="Admin";
    String companyName="TCS";

    public static void main(String[] args) {
        EmployeeClass emp=new EmployeeClass();
        System.out.println("ID No:"+emp.iD);
        System.out.println("Division:"+emp.division);
        System.out.println("Company Name:"+emp.companyName);
    }
}
