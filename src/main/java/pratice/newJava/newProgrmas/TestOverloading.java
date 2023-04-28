package pratice.newJava.newProgrmas;

public class TestOverloading {
    public void get(){
        System.out.println("I am in Zero parameters :");
    }
    public void get(int a,int b){
        System.out.println("add : "+(a+b));
    }
    public void get(int a,int b,int c){
        System.out.println("add : "+(a+b+c));
    }
    public void get(int a,int b,String name){
        System.out.println("add : "+(a+b));
        System.out.println("Name : "+name);
    }
    public void get(String  name,int rollNo,int division ){
        System.out.println("Name :"+name+"   Roll No :"+rollNo+"   Division of class :"+division);
    }

    public static void main(String[] args) {
        TestOverloading obj=new TestOverloading();
        obj.get();
        obj.get(10,20);
        obj.get(20,40,60);
        obj.get(50,80,"Shri");
        obj.get("Nikhil",101,7);
    }
}
