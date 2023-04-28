package AlleNikhil.TestAll.testNg.testNgAllCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalTestCase {
    @Parameters({" rollnumber ","fullname","divsion","maths_marks"})
    @Test
    public void add( int rollnumber, String fullname,char divsion, int maths_marks){
        System.out.println(rollnumber);
        System.out.println(fullname);
        System.out.println(divsion);
        System.out.println(maths_marks);

    }
}
