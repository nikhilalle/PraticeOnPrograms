package pratice.corejava.collectionConcept.linkedList;

public class Employee {
    int id;
    String name;
    String companyName;

    public Employee(int id, String name, String companyName) {
         this.id=id;
         this.name=name;
         this.companyName=companyName;
    }
    private void details(){
        System.out.println("Employee ID "+id);
        System.out.println("Employee Name "+name);
        System.out.println("Company Name "+companyName);

    }


    }

