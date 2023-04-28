package pratice.programs;

public class Values {
    public void get(int a,int b){
        int sum;
        sum=a+b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Values val=new Values();
        val.get(12,89);
    }
}
