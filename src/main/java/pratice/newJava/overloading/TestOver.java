package pratice.newJava.overloading;

public class TestOver {

    public void details(int roll ,int marks){
        System.out.println("Roll No :"+roll);
        System.out.println("Marks :"+marks);
    }
    public void details(char div ,int std){
        System.out.println("div :"+div);
        System.out.println("Marks :"+std);
    }
    public void details(int std ,char div){
        System.out.println("standard :"+std);
        System.out.println("Division :"+div);
    }
    public void details(int roll ,int marks,String name){
        System.out.println("Roll No :"+roll);
        System.out.println("Marks : "+marks);
        System.out.println("Name : "+name);
        System.out.println("Sample : "+name  +  roll);
    }

    public static void main(String[] args) {
        TestOver ts=new TestOver();
        ts.details('A',10);
        ts.details(9,'B');
        ts.details(102,87);
        ts.details(208,96,"Nikhil");

    }



}
