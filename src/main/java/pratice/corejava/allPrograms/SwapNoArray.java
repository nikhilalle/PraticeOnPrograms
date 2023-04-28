package pratice.corejava.allPrograms;

public class SwapNoArray {

        public static void main(String[] args) {

            int a[] = {6, 5, 4};
            int b[] = {7, 8, 9};
            for (int q:a){
                System.out.print(q);
            }
            for (int w:b){
                System.out.print(w);
            }
            System.out.println();
            System.out.println("a[]");
            for (int i = 0; i <= a.length - 1; i++) {
                System.out.print(b[i]);
            }
            System.out.println();
            System.out.println("b[]");
            for (int i = 0; i <= b.length - 1; i++) {
                System.out.print(a[i]);
            }
        }
    }

