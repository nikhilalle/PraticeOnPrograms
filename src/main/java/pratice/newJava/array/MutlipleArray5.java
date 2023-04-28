package pratice.newJava.array;

import org.testng.annotations.Test;

public class MutlipleArray5 {
    @Test
    public void arrayMultiple() {
        Object[][] strarr = {
                {"Shri", 101, "Alle"},
                {"Nikhil", 102, "Alle"},
                {"Pratham", 103, "Alle"},
                {"Rohit", 104, "Mykoti"},
                {"Rahul", 105, "Dasari"},
                {"Shrikant", 106, "Madgundi"},
                {"Balaji", 107, "Bomen"}

        };
        System.out.println("-----------String Array-------------");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(strarr[i][j]);
            }
        }

    }

    @Test
    public void arrayMultiple1() {
        Object[][] strarr = {
                {"Shri", 101, "Alle", "Senior Test Engineering", "Novartis", "Good Nature"},
                {"Nikhil", 102, "Alle", "Test Engineering", "TCs", "HardCore"},
                {"Pratham", 103, "Alle", "Technical", "Apollo", "Good Service"},
                {"Rohit", 104, "Mykoti", "Java Developer", "Infosys", "Self Motivator"},
                {"Rahul", 105, "Dasari", "MBBS", "Kems Hospital", "Excellent Communication"},
                {"Shrikant", 106, "Madgundi", "Test Engineering", "Tech Mahindra", "Quick Leaner"},
                {"Balaji", 107, "Bomen", "Technical", "Capgimini", "Honest Person"}
        };
        System.out.println("-----------String Array-------------");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(strarr[i][j]);

            }
        }
    }
}
