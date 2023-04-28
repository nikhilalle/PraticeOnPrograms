package pratice.corejava.collectionConcept.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLIstEmpClass {
    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Shri", "Tcs");
        Employee emp2 = new Employee(102, "Shruti", "Wipro");
        Employee emp3 = new Employee(103, "Nikhil", "Capgimini");
        Employee emp4 = new Employee(104, "Ankhita", "TCS");
        Employee emp5 = new Employee(105, "Avanti", "Wipro");


        LinkedList<Employee> list = new LinkedList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
//list.sort(<emp1>);

        ListIterator<Employee> lte = list.listIterator();
        while (lte.hasNext()) {
            Employee emp=lte.next();

            System.out.println(emp.id+ "   "+emp.name+"   "+emp.companyName);

        }


    }
}

