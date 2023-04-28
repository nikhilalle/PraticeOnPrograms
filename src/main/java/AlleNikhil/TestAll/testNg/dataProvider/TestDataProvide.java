package AlleNikhil.TestAll.testNg.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvide {
    @Test(dataProvider = "Pankaj")
    public void getDetails(String name,String surname){
        System.out.println(name);
        System.out.println(surname);
    }
@DataProvider(name = "Pankaj")
    public Object[][] inputDetails(){
        Object  [][] objects={
                {"Shri","Alle"},
                {"Pankaj","Khobhargade"},
                {"Nikhil","Alle"},
                {"Rahul","Yellageti"}
        };

        return objects;
    }
}
