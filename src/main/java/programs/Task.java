package programs;

import org.testng.annotations.Test;

public class Task {
    @Test
    public void get(){
        int count=0;


        java.lang.String st="Nikhilesh Alle";
        java.lang.String str[]=st.split(" ");
        for(int j=0;j<= str.length-1;j++){
            System.out.println(str[j]);
            if(str[j].equals('i')){
                count++;

            }
            System.out.println(count);
        }

        
        
    }
}
