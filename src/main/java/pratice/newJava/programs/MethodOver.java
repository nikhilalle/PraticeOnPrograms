package pratice.newJava.programs;

public class MethodOver {
    public void get(int a,int b,String c){
        int sum=a+b;
        System.out.println("Sum of A & B :"+sum);
        System.out.println("Name :"+c);
        get(40,50);
    }
    public static void get(int a,int b,int d){
         int sum=a+d+b;
        System.out.println("Sum of A & B :"+sum);

    }
    public void get(int roll,String c){
        System.out.println("Roll No :"+roll);
        System.out.println("Name :"+c);
        get(35,70,"Nikhil");
    }
    public void get(int a,int b){
        get("Shri","Alle");
        int sum=a+b;
        System.out.println("Sum of A & B :"+sum);
    }
    public void get(String a,String c){

        System.out.println("Name :"+a);
        System.out.println("Sur-Name :"+c);
    }

    public static void main(String[] args) {
        MethodOver obj=new MethodOver();
        obj.get(25,50);
        obj.get(101,"Shri");
        obj.get(20,40,"Nikhil");
        obj.get("Nikhilesh ","Alle");
        get(25,50,45);
    }
}
