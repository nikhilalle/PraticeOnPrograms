package forLoop;

import org.testng.annotations.Test;

public class TwoDMatrix {
    @Test
    public void get(){
        int [] [] a ={{1,2,3},{4,5,6},{7,8,9}};
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               System.out.print(a[i][j]);
           }
           System.out.println();
       }
    }
    @Test
    public void get1(){
        int Table=0;
        int [] a ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                Table=a[i]*a[j];
                System.out.print("  "+Table);
            }
            System.out.println("  ");
        }
    }
}
