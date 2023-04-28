package newJava.coreJava;

public class  MethodWithParameter {
    public void addiction(int a,int  b){

        int sum;
        sum=a+b;
        System.out.println(sum);
    }
    public  static  void subtration (int a,int  b){
        int sub;
        sub=a-b;
        System.out.println(sub);
        MethodWithParameter mn=new MethodWithParameter();
        mn.addiction(20,56);
    }

    public static void main(String[] args) {
      subtration(10,20);


    }
}
