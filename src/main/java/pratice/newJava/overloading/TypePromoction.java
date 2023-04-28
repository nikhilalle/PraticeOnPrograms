package pratice.newJava.overloading;

public class TypePromoction {


        public void m1(long c, long d) {
            System.out.println("Long  "+c + d);
        }
    public void m1(char d, char f) {
        System.out.println("Char  "+d + f);
    }

        public static void main(String[] args) {
         TypePromoction obj = new TypePromoction();
            obj.m1(10, 10);
            obj.m1(12,45);



        }

    }

