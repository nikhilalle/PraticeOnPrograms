package pratice.corejava.allPrograms;

public class LeafYear {
    public static void main(String[] args) {
        int year=2020;
        System.out.println(year);
        if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){
            System.out.println("Leaf Year");

        }
        else {
            System.out.println("Common Year");
        }
    }
}
