package pratice.newJava.inheritances;

public class Child extends Parent{
    public void m1(){
        System.out.println("I am Child Class ");
    }
    public void m1(int roll){
        System.out.println("Roll No :"+roll);

    }
    public void m1(String name){
        System.out.println("Name :"+name);
    }

    public static void main(String[] args) {
        Child obj=new Child();
        obj.m1(); // Child
        obj.m1(101);
        obj.m1("Shriniwas");
        obj.set(); // Father
        obj.get1(1001);
        obj.get2("Wipro");
        obj.data(); //GrandFather
        obj.data1(100000);
        obj.data2("Team Leader");
        obj.a(); // GrandFather1
        obj.a(12);
        obj.a("Ratan Tata");
        obj.b();//  GrandFather2
        obj.b(45);
        obj.b("Nagesh");
        obj.c(); // GrandFather3
        obj.c(55);
        obj.c("Rohit");
    }
}
