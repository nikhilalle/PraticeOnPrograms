package pratice.newJava.array;

public class AmstrongNo {
    public static void main(String[] args) {

        double sum=0;
        int no=153;
        int temp=no;
        int length=0;
        int a;
        int temp1=no;
        while (temp>0){
            temp1  =temp1/10;
            length=length+1;

        }
        System.out.println(length);
        while (no > 0) {

            a=no%10;
            no=no/10;
            sum=sum+(Math.pow(a,length));
        }
        if (temp==sum){
            System.out.println("Armstrong No :"+temp);
        }
        else {
            System.out.println("Not Armstrong No :"+temp);
        }
    }
}
