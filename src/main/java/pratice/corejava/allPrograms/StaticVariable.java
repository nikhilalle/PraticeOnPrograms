package pratice.corejava.allPrograms;

public class StaticVariable {
    static int jobId = 201;
    static String company = "TCS";
    static String designation = "Automation";

    public static void main(String[] args) {
        new StaticVariable();
        System.out.println("JOB-ID: "+StaticVariable.jobId);
        System.out.println("Company  Name :"+StaticVariable.company);
        System.out.println("Designation :"+StaticVariable.designation);
    }
}
