package pratice.corejava.Constructor;

public class CopyConstructor {
        int age;
        String name;

    CopyConstructor(int age, String name) {
            this.age = age;
            this.name = name;
        }

    CopyConstructor(CopyConstructor obj) {

        }

        public void getDetails() {
            System.out.println("Age:" + age);
            System.out.println("Name:" + name);
        }

        public static void main(String[] args) {
           CopyConstructor obj =new CopyConstructor(29,"Nikhil");
           CopyConstructor  obj1=new CopyConstructor(obj);
           obj.getDetails();
                   }
}
