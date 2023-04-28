package AlleNikhil.TestAll.testNg.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest2 {
    @Test(dataProvider ="listArray")
    public void verifyLogin(String name,int I_D,String surName,String roll,String companyName,String feedBack){
        System.out.println(name);
        System.out.println(I_D);
        System.out.println(surName);
        System.out.println(roll);
        System.out.println(companyName);
        System.out.println(feedBack);
        System.out.println("---------");
    }
   @DataProvider(name="listArray")
    public Object [][] test() {
       Object[][] strarr = {
               {"Shri", 101, "Alle", "Senior Test Engineering", "Novartis", "Good Nature"},
               {"Nikhil", 102, "Alle", "Test Engineering", "TCs", "HardCore"},
               {"Pratham", 103, "Alle", "Technical", "Apollo", "Good Service"},
               {"Rohit", 104, "Mykoti", "Java Developer", "Infosys", "Self Motivator"},
               {"Rahul", 105, "Dasari", "MBBS", "Kems Hospital", "Excellent Communication"},
               {"Shrikant", 106, "Madgundi", "Test Engineering", "Tech Mahindra", "Quick Leaner"},
               {"Balaji", 107, "Bomen", "Technical", "Capgimini", "Honest Person"}
       };
       return strarr;


       }

   }