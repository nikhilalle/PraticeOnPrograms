package pratice.programs;

import org.testng.annotations.Test;

public class TwoDLoop {
    @Test
    public  void m3() {
        int j;

        String[] []name={{"Pooja" ,"Pranali"},{"Nikhil", "Chaku"}};

        for(int i=0;i<=1;i++){
           // System.out.println(name[i]);
            for( j=i;j<1;j++){
                System.out.println(name[j]);
            }
            for (String str:name[j]
                 ) {
                System.out.println(str);
            }
        }


    }
}
