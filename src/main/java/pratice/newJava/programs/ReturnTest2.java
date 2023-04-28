package pratice.newJava.programs;

public class ReturnTest2 {
    public  int get(int a,int b ){
      int sum=25+a+b;
        return sum;
    }
    public   String get(String name ){
        return name;
    }
    public  float get(int rollNo,int marks,float greade){
        System.out.println("Roll No");
       greade=marks/100;
        return greade;
    }

    public static void main(String[] args) {
        ReturnTest2 rtr=new ReturnTest2();
       String aa= rtr.get("Shti");
        System.out.println(aa);
        int bb=rtr.get(50,65);
        System.out.println(bb);
        float ft=rtr.get(101,95,5f);
        System.out.println(ft);
    }
}
