package pratice.newJava.Methods;

public class Chain {
    public void set1(int a){
        System.out.println(a);
        set2("Pooja");
        System.out.println(SimpleMethod.company);
    }

    public void set2(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Chain obj=new Chain();
        obj.set1(10);
    }
}
