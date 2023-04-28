package pratice.newJava.array;

public class Array1 {
    public void get(int [] a,int [] b,String[] str){
        for (int x:a)
             {
                 System.out.println("1st Year Marks : "+x);
        }
        for (int y:b){
            System.out.println("2nd Year Marks : "+y);
        }
        for (String z:str) {
            System.out.println("Name of Student :"+z);
        }
    }
    public void get1(int [] a,int [] b,String[] str){
        for (int x:a)
        {
            System.out.println("3rd Year Marks : "+x);
        }
        for (int y:b){
            System.out.println("4th Year Marks : "+y);
        }
        for (String z:str) {
            System.out.println("Name of Student :"+z);
        }
    }

    public static void main(String[] args) {
Array1 obj=new Array1();
int [] a={97,95,78,56,100};
        int [] b={90,95,81,96,90};
        int [] c={95,94,78,76,10};
        int [] d={97,75,78,56,70};
        String [] x={"Shri","Nikhil","Nagesh","Prathan"};
        String [] y={"Ashwini","Pinki","Pranothi","Anil"};
        String [] z={"Aparna","Ashok","Rajesh","Ankhita"};
        String [] w={"Avanti","Anil","Supriya","Narmada"};
        obj.get(a,b,x);
        obj.get1(c,d,y);
        obj.get(a,b,z);
        obj.get1(c,d,w);
    }
}
