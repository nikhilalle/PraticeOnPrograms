package pratice.corejava.variables;

public class StudentClass {
    int rollNo=20;
    String Name="Shri";
    String classNo="MCS";
    int rank=2;

    public static void main(String[] args) {
        StudentClass str=new StudentClass();
        System.out.println("Roll No:"+str.rollNo);
        System.out.println("Name :"+str.Name);
        System.out.println("Class No:"+str.classNo);
        System.out.println("Rank :"+str.rank);
    }
}
