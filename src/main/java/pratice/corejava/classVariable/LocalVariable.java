package pratice.corejava.classVariable;

public class LocalVariable {
    int rollNo1=100;
    String name1="Harika";
    int Class1 = 1;
    int rollNo2=101;
    String name2="Shriniwas";
    int Class2 = 2;
    int rollNo3=102;
    String name3="Pratham";
    int Class3 = 5;
    int rollNo4=103;
    String name4="Nikhil";
    int Class4 = 3;
    int rollNo5=104;
    String name5="Shruti";
    int Class5 = 5;
    int rollNo6=105;
    String name6="Adhira";
    int Class6 =8;
    int rollNo7=106;
    String name7="Rajesh";
    int Class7 =4;
    public void get()
    {
        System.out.println("Roll No:"+rollNo1);
        System.out.println("Name :"+name1);
        System.out.println("Class :"+Class1);
        System.out.println("------------");
        System.out.println("Roll No:"+rollNo2);
        System.out.println("Name :"+name2);
        System.out.println("Class :"+Class2);
        System.out.println("------------");
        System.out.println("Roll No:"+rollNo3);
        System.out.println("Name :"+name3);
        System.out.println("Class :"+Class3);
        System.out.println("------------");
        System.out.println("Roll No:"+rollNo4);
        System.out.println("Name :"+name4);
        System.out.println("Class :"+Class4);
        System.out.println("------------");
        System.out.println("Roll No:"+rollNo5);
        System.out.println("Name :"+name5);
        System.out.println("Class :"+Class5);
        System.out.println("------------");
        System.out.println("Roll No:"+rollNo6);
        System.out.println("Name :"+name6);
        System.out.println("Class :"+Class6);
        System.out.println("------------");
        System.out.println("Roll No:"+rollNo7);
        System.out.println("Name :"+name7);
        System.out.println("Class :"+Class7);
    }

    public static void main(String[] args) {
        LocalVariable obj=new LocalVariable();
        obj.get();
    }
}
