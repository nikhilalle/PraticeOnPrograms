package pratice.newJava.array;

import org.testng.annotations.Test;

public class MutlipleArrayObject {
    @Test
    public static Object[][]  arrayMultiple() {
        Object[][] strarr = {
                {"Shri", 101},
                {"Nikhil", 102},
                {"Pratham", 103},
                {"Rohit", 104},
                {"Rahul", 105},
                {"Shrikant", 106},
                {"Balaji",107}

        };
        return strarr;

}
@Test
    public void methodCall(){
    Object[][] objects= arrayMultiple();
   
    System.out.println("-----------By Iterating For Loop-------------");
    for (int i = 0; i < 7; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.println(objects[i][j]);
        }
    }

}
}
