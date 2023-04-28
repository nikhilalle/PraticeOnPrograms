package pratice.corejava.classVariable;

public class RetrunProgram {
    public int get(int a, int b) {
        int c = a + b;
        return c;

    }

    public String set(String str, int roll) {
        System.out.println(roll);
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        RetrunProgram obj = new RetrunProgram();
        int x = obj.get(20, 30);
        System.out.println("Additional :" + x);
        String str = obj.set("Shriniwas", 101);

        System.out.println("This is Return Name :" + str);
    }
}
