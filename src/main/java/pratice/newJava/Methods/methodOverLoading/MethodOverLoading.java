package pratice.newJava.Methods.methodOverLoading;

public class MethodOverLoading {
    public void get(){
        System.out.println("I am In Get Zero Arguments");
        System.out.println("---------------------");
    }
    public void get(int roll ,String name){
        System.out.println("I am In Get 2 Arguments");
        System.out.println(roll);
        System.out.println(name);
        System.out.println("---------------------");
    }
    public void get(String name,int roll){
        System.out.println("I am In Get Zero Arguments");
        System.out.println(name);
        System.out.println(roll);
        System.out.println("---------------------");

    }
    public void get(String name,int roll,char div){
        System.out.println("I am In Get Zero Arguments");
        System.out.println(name);
        System.out.println(roll);
        System.out.println(div);
        System.out.println("---------------------");
    }
    public void get(int roll,char div,String sub){
        System.out.println("I am In Get Zero Arguments");
        System.out.println(roll);
        System.out.println(div);
        System.out.println(sub);
        System.out.println("---------------------");
    }

    public void get(String name,String middlename,String lastName){
        System.out.println("I am In Get Zero Arguments");
        System.out.println(name);
        System.out.println(middlename);
        System.out.println(lastName);
        System.out.println("---------------------");

    }
    public void get(String name,int middlename,String lastName){
        System.out.println("I am In Get Zero Arguments");
        System.out.println(name);
        System.out.println(middlename);
        System.out.println(lastName);
        System.out.println("---------------------");


    }

    public static void main(String[] args) {
        MethodOverLoading obj=new MethodOverLoading();
        obj.get();
        obj.get(101,"Shruti");
        obj.get("Nikhil",501);
        obj.get(201,'A',"Maths");
        obj.get("Nikhil","Anil","Alle");
        obj.get("Nikhil",302,'B');

    }


}
