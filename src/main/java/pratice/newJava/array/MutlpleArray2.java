package pratice.newJava.array;

import org.testng.annotations.Test;

public class MutlpleArray2 {
    @Test
    public void arrayMultiple() {
        String[][] strarr = {
                {"Shri", "Alle"},
                {"Nikhil", "Alle"},
                {"Pratham", "Alle"},
                {"Rohit", "Mykoti"},
                {"Rahul", "Dasari"},
                {"Shrikant", "Madgundi"},
                {"Balaji","Bomen"}

        };
        System.out.println("-----------By Manual Get All Data-------------");
        System.out.println(strarr[0][0]);
        System.out.println(strarr[0][1]);
        System.out.println(strarr[1][0]);
        System.out.println(strarr[1][1]);
        System.out.println(strarr[2][0]);
        System.out.println(strarr[2][1]);
        System.out.println(strarr[3][0]);
        System.out.println(strarr[3][1]);
        System.out.println(strarr[4][0]);
        System.out.println(strarr[4][1]);
        System.out.println(strarr[5][0]);
        System.out.println(strarr[5][1]);
        System.out.println(strarr[6][0]);
        System.out.println(strarr[6][1]);


        System.out.println("-----------By Iterating For Loop-------------");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                 System.out.println(strarr[i][j]);
            }
        }


    }
    }