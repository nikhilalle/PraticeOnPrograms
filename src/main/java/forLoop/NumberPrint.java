package forLoop;

import org.testng.annotations.Test;

public class NumberPrint {
    @Test
    public void get(){
        for(int i=1;i<=5;i++){
            System.out.println("Value of  I                                        "+i);
            System.out.println("-----------------------");
            for(int j=1;j<=5;j++){
                System.out.println("Value of J "+j);
            }
        }
    }
    @Test
    public void get1(){
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.println(j);
            }
        }
    }
}
//11111
//22222
//33333
//44444
//55555