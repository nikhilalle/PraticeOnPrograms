package AlleNikhil.TestAll.testNg.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderListIterator {
    // using String  data
    @Test(dataProvider = "data")
    public void login(String userName, String password) {
        System.out.println(userName);
        System.out.println(password);

        System.out.println("==============");
    }

    // using Object Array
    @Test(dataProvider = "data")
    public void objectData(Object[] obj) {
        System.out.println(obj[0]);
        System.out.println(obj[1]);
        System.out.println("==============");
    }

    @DataProvider(name = "data")
    public Iterator<Object[]> test() {
        List<Object[]> list = new ArrayList<Object[]>();

        String str1[] = {"Shriniwas", "Alle@123"};
        String str2[] = {"Nikhilesh", "Alle@456"};
        String str3[] = {"Prathamesh", "Alle@232"};
        list.add(str1);
        list.add(str2);
        list.add(str3);

        Iterator<Object[]> obj = list.iterator();
        return obj;
    }


}



