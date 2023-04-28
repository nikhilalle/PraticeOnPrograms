package programs;

import org.testng.annotations.Test;

public class String {
    java.lang.String str = "Nikhilesh is My Name";
    java.lang.String[] st = str.split(" ");

    @Test
    public void stringTest() {
        System.out.println(str);
        System.out.println(st);
        for (int i = 0; i <= st.length - 1; i++) {
            System.out.println(st[i]);
        }
    }
    @Test
    public void reverseString(){
        for(int i=st.length-1;i>=0;i--){
            System.out.println(st[i]);
        }
    }



}
