package pratice.newJava.overloading;

public class OverLoading {
    public void get(){
        System.out.println("Overloading Function");
    }
    public void get(int a,int b ){
        System.out.println("Sum :"+(a+b));
    }
    public void get(int [] a,int [] b ){
        for (int c:a)
              {
                  System.out.println("Value of A :"+c);
        }
        for (int d:b)
        {
            System.out.println("Value of A :"+d);
        }
    }

    public static void main(String[] args) {
        OverLoading obj=new OverLoading();
        obj.get();
        obj.get(20,50);
        int [] z={10,20,30};
        int [] x={40,50,60};
        obj.get(z,x);
    }
}
