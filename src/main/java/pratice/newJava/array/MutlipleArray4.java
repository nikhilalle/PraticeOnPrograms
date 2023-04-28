package pratice.newJava.array;

import org.testng.annotations.Test;

public class MutlipleArray4 {
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
    public static Object[][]  arrayMultiple1() {
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

public static void main(String[] args) {
    String[][] stra= arrayMultiple();
    System.out.println("-----------String Array-------------");
    for (int i = 0; i < 7; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.println(stra[i][j]);
        }
    }

    System.out.println("-----------------Object Array------------");
    Object[][] objects= arrayMultiple1();
    for (int i = 0; i < 7; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.println(objects[i][j]);
        }
    }
    }

}
