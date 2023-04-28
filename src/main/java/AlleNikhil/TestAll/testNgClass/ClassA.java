package AlleNikhil.TestAll.testNgClass;

public class ClassA implements ClassZ {
    public void get(){
        System.out.println("I am  in Get Method in Class A");
    }

    public static void main(String[] args) {
        ClassA obj=new ClassA();
        obj.get();
        obj.get();
    }
}
