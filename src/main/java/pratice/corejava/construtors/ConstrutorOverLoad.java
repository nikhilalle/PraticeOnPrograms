package pratice.corejava.construtors;

public class ConstrutorOverLoad {
   public ConstrutorOverLoad(){
        System.out.println("No Parameters  ");
    }
    public ConstrutorOverLoad(String name){

        System.out.println("One Parameters  ");
        System.out.println(name);
        System.out.println("-------------------");
    }
    public ConstrutorOverLoad(int rollNo, String name){

        System.out.println("Two Parameters  ");
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println("-------------------");
    }
    public ConstrutorOverLoad(String name, int rollNo){
        System.out.println("Two  Parameters   ");
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println("-------------------");
    }
    public ConstrutorOverLoad(int id, char division, float grede){

        System.out.println("Three Parameters  ");
        System.out.println(id);
        System.out.println(division);
        System.out.println(grede);
        System.out.println("-------------------");

    }

    public static void main(String[] args) {
        new ConstrutorOverLoad();
        new ConstrutorOverLoad("Nikhil");
        new ConstrutorOverLoad(101,"Shri");
        new ConstrutorOverLoad("Nikhil",291);
        new ConstrutorOverLoad(501,'A',98.3f);
    }

}
