package AlleNikhil.TestAll.testNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertionSoftHard {
    @Test
    public void asserHard(){
        System.out.println("Hard  Aertion");
      Assert.assertTrue(true);  // Pass
        Assert.assertEquals(12,12);  // Pass
        Assert.assertTrue(true);  // Pass
        Assert.assertEquals(12,12);  // Pass
        //        Assert.assertEquals(16,12);  // Fail
        Assert.assertEquals(12,12);  // Pass


    }
    @Test
    public void asserSoft(){
        System.out.println("Soft  Assertion");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(true);  // Pass
        softAssert.assertEquals(12,12);  // Pass
        softAssert.assertTrue(true);  // Pass
        softAssert.assertEquals(12,12);  // Pass

        softAssert.assertEquals(16,12);  // Fail
        softAssert.assertEquals(12,12);  // Pass
        softAssert.assertEquals(16,12);  // Fail
        softAssert.assertEquals(16,16);  // Pass
        softAssert.assertTrue(false);  //Fail


    }
}
