package AlleNikhil.TestAll.testNg.testNgAllCases;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaMeterCaseTest {
    @Parameters({"rollNo","name","div","marks"})
    @Test
    public void add(int rollnumbero,String fullname,char divsion,int maths_marks){
        System.out.println(rollnumbero);
        System.out.println(fullname);
        System.out.println(divsion);
        System.out.println(maths_marks);

    }
}
