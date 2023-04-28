package pratice.corejava.construtors;

public class ConstructorChain {

    public ConstructorChain(String name){
this(101,'A',87.5f);
        System.out.println("One Parameters  ");
        System.out.println(name);
        System.out.println("-------------------");
    }
    public ConstructorChain(int rollNo, String name){

        System.out.println("Two Parameters  ");
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println("-------------------");
    }
    public ConstructorChain(String name, int rollNo){
        this(21,"Anil");

        System.out.println("Two  Parameters   ");
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println("-------------------");
    }
    public ConstructorChain(int id, char division, float grede){
        this("NIKHIL",121);

        System.out.println("Three Parameters  ");
        System.out.println(id);
        System.out.println(division);
        System.out.println(grede);
        System.out.println("-------------------");

    }

    public static void main(String[] args) {
        new ConstructorChain("rahul");
    }
}
