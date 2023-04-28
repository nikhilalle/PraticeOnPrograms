package AlleNikhil.TestAll.testNg.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    @Test(dataProvider ="listArray")
    public void verifyLogin(String name,String surName){
        System.out.println(name);
        System.out.println(surName);
        System.out.println("---------");
    }
   @DataProvider(name="listArray")
    public Object [][] test(){
        Object [][] objArr={
                {"Shri","Alle"},
                {"Nikhil","Alle"},
                {"Pratham","Alle"},
                {"Rohit","Mykoti"},
                {"Harika","Machccha"},
                {"Rahul","Dasari"}
        };
        return objArr;

            }
        }
