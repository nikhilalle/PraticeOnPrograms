package pratice.newJava.array;

import org.testng.annotations.Test;

public class MutlipleArray3 {
    @Test
    public static String[][]  arrayMultiple() {
        String[][] strarr = {
                {"Shri", "Alle"},
                {"Nikhil", "Alle"},
                {"Pratham", "Alle"},
                {"Rohit", "Mykoti"},
                {"Rahul", "Dasari"},
                {"Shrikant", "Madgundi"},
                {"Balaji","Bomen"}

        };
        return strarr;

}
@Test
    public void methodCall(){
    String[][] stra= arrayMultiple();

    System.out.println("-----------By Iterating For Loop-------------");
    for (int i = 0; i < 7; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.println(stra[i][j]);
        }
    }

}
}
