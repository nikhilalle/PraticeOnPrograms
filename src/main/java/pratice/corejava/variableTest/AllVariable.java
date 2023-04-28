package pratice.corejava.variableTest;

public class AllVariable {
    int rollNo;
    String name;
    char div;
    float percentage;

    public void student(){
        rollNo=101;
        name="Pooja";
        div='A';
        percentage=  98.89f;
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(div);
        System.out.println(percentage);
    }

    public static void main(String[] args) {
        AllVariable all=new AllVariable();
        all.student();
    }
}
