package pratice.newJava.array;

public class ArrayTEst {
    public static void main(String[] args) {
        int [] ar=new int[5];
        ar[0]=20;
        ar[1]=42;
        ar[2]=32;
        ar[3]=50;
        ar[4]=67;

        for (int no:ar ) {
            System.out.println(no);
        }
        System.out.println("_____________________");
for (int i=0;i<ar.length;i++){
    System.out.println(ar[i]);
}
    }
}
