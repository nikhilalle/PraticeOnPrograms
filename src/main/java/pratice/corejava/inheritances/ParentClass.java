package pratice.corejava.inheritances;

public class ParentClass {
    public  void s1(){
        System.out.println("I am In ParentClass  S1 Method ");
    }
    public  void s2(){
        System.out.println("I am In ParentClass  S2 Method ");

    }
    ParentClass(){
        System.out.println("I am In ParentClass Constructor ");
    }
    ParentClass(String name){
        System.out.println(" ParentClass Constructor  Name "+name);
    }
    ParentClass(int id,String companName){
        System.out.println(" ParentClass Constructor Id "+id);
        System.out.println(" ParentClass Constructor Company-Name "+companName);

    }
}
