package pratice.newJava.newProgrmas.overRiding2;

public class Child extends  Father {


    public void m1() {
        System.out.println("I am m1  Child ");
    }

    public void m2() {
        System.out.println("I am m2  Child");
    }

    public void childCh() {
        System.out.println("I am m3  ChildCh  Child ");
    }


    public static void main(String[] args) {
        Child ch =new Child();
        ch.m1();                                    // I am m1  Child
        ch.m2();                                    // I am m2  Child
        ch.childCh();                               // I am m3  ChildCh  Child
        ch.fatherCh();                              // I am  fatherCh  Father
        System.out.println("---------------------------------------------------------------------");
        Father father =new Child();
        father.m1();                               //  I am m1  Child
        father.m2();                               //  I am m2  Child
        father.fatherCh();                        //   I am  fatherCh  Father
        // father.childCh();                      //   Not Taking
        System.out.println("---------------------------------------------------------------------");
        Father father1 =new Father();
        father1.m1();                           //  I am m1  Father
        father1.m2();                           //  I am m2  Father
        father1.fatherCh();                     //  I am  fatherCh  Father
        // father1.childCh();                   //  Not Taking
        System.out.println("---------------------------------------------------------------------");
       // Child ch1=new Father();

    }
}



