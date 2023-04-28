package pratice.newJava.programs;

public class TestReturn {
    public int get(int a,int b){
       int  sum=a+b;
        return sum;
    }
    public int get1(int a,int b){
       int div=a/b;
        return div;
    }
    public int get2(int a,int b){
      int  mutliply=a*b;
        return mutliply;
    }
    public int get4(int a,int b){
      int  sub=a-b;
        return sub;
    }

    public static void main(String[] args) {
        TestReturn obj=new TestReturn();
       int c= obj.get(20,30);
        System.out.println(c);
       int d= obj.get1(10,20);
        System.out.println(d);
       int e= obj.get2(40,80);
        System.out.println(e);
      int  f= obj.get4(50,25);
        System.out.println(f);
    }

}
