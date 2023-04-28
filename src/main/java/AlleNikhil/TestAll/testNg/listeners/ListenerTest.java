package AlleNikhil.TestAll.testNg.listeners;

import com.matrix.shriniwas.testngconcepts.ListenersClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersClass.class)
public class ListenerTest {

    @Test
    public void test1(){
        System.out.println(" Test 1" );
    }
    @Test

    public void test2(){
        System.out.println(" Test 2 ");

    }
    @Test
    public void test3(){

        System.out.println(" Test 3 ");


    }
    @Test(dependsOnMethods = "test1")
    public void test4(){
        System.out.println(" Test 4 ");

    }
    @Test(dependsOnMethods = "test2")
    public void test5(){
        System.out.println(" Test 5 ");

    }
}
