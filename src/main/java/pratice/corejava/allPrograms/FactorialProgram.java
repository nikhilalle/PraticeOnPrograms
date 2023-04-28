package pratice.corejava.allPrograms;

public class FactorialProgram {
    public static void main(String[] args) {
        int i,fact=1;
        int no=5;
        for (i=1;i<=no;i++)
        {
            fact=fact*i;
        }
        System.out.println("fact of "+no+"  is "+fact);
        System.out.println(fact);
    }

}
