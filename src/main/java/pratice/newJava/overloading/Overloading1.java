package pratice.newJava.overloading;

public class Overloading1 {
    public Overloading1(int jobId,String name,String companyName){
        System.out.println("Job ID :"+jobId);
        System.out.println("Name of Employee :"+name);
        System.out.println("Company Name :"+companyName);

    }
    public Overloading1(double salaryPackage,char division,String designation){
        System.out.println("Salary Per year :"+salaryPackage);
        System.out.println("Division :"+division);
        System.out.println("Role :"+designation);
    }

    public static void main(String[] args) {
        new Overloading1(101,"Shri","tcs");
        new Overloading1(20.35,'A',"Team Leader");
        System.out.println("_____________________________________");
        new Overloading1(105,"Nikhil","Wipro");
        new Overloading1(12.30,'B',"Tester");

    }
}
