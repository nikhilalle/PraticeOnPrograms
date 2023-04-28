package pratice.corejava.allPrograms;

public class Method1 {
    static int jobId = 201;
    static String company = "TCS";
    static String designation = "Automation";
    String name = "Shri";


    public static void get() {
        Method1 mn = new Method1();
        int roll = 120;
        System.out.println(jobId);
        System.out.println(mn.name);
        // System.out.println(name);
        System.out.println(roll);


    }

    public void set() {

        System.out.println(jobId);
        System.out.println(name);

    }

    public static void main(String[] args) {
Method1 obj=new Method1();
obj.set();
get();
    }
}