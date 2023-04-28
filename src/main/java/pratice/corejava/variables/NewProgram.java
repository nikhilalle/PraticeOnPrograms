package pratice.corejava.variables;

public class NewProgram {
    public String getdata(String s){
        System.out.println("I am in Method");

        System.out.println("I am parameters Method");

        return s;
    }


    public static void main(String[] args) {
        NewProgram obj=new NewProgram();
        String ab=obj.getdata("Shriniwas");
        System.out.println(ab);

    }
}
