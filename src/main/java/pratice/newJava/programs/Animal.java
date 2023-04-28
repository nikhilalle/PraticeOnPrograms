package pratice.newJava.programs;

public class Animal {
    void eat() {
        System.out.println("I am in  Animal");   // Grand-Father of BabyDog
    }
}

class Dog extends Animal {
    void get() {
        System.out.println(" I am  In Dog");  // Father Of BabyDog
    }
}

class BabyDog extends Dog {
    void set() {
        System.out.println("I am in BabyDog"); // Main Class (Son-BabyDog)
    }


    public static void main(String[] args) {

        BabyDog obj = new BabyDog();
        obj.eat();
        obj.set();
        obj.get();

    }

}


