package pratice.corejava.collectionConcept.linkedList;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class EmpLInkedList {
    public static void main(String[] args) {
        Employee emp1=new Employee(101,"Shri1","TCS");
        Employee emp2=new Employee(102,"Nikhil1","Wipro");
        Employee emp3=new Employee(103,"Shri2","Novartis");
        Employee emp4=new Employee(104,"Nikhil2","Capgimini");
        Employee emp5=new Employee(104,"Shruti","Hexanon");

        LinkedHashSet<Employee> list=new LinkedHashSet<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);

        System.out.println(list);
        Iterator<Employee> ltr= list.iterator();
        while (ltr.hasNext()){
Employee emp=ltr.next();
            System.out.println("   " +emp.id+"    "+emp.name+"    "+emp.companyName);

    }


}}
