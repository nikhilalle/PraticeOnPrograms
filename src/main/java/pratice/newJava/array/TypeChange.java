package pratice.newJava.array;

public class TypeChange {
    public static void main(String[] args) {
        String nub1="400";
        String nub2="500";
        System.out.println(nub1);
        System.out.println(nub2);
        System.out.println(nub1+nub2);
        System.out.println("-------------------------");
        //  String Value Change to Integer
        int n1=Integer.parseInt(nub1);
        int n2=Integer.parseInt(nub2);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println("Sum of "+(n1+n2));
        System.out.println("-------------------------");
        //  Integer Value Change to String
        String s1=String.valueOf(n1);
        String s2=String.valueOf(n2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("-------------------------");
        int a=100;
        Integer b=a;
        System.out.println(a);
        System.out.println(b);
    }
}
