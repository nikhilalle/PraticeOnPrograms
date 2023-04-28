package AlleNikhil.selenium.selenium;

public class BoxingConcept {

    public void box(){

// Boxing
        int q=12;
        Integer t=q;
        System.out.println(t);


        int a=t;
        System.out.println(a);


//Un Boxing
        Integer c= 209;
        int w=c;
        System.out.println(c);

    }
    public void box1(){
        String str1 = "100";
        String str2 = "200";
        int sum;
        System.out.println(str1+str2);
        Integer a=Integer.valueOf(str1);
        System.out.println(a);

        Integer x=Integer.valueOf(str2);
        System.out.println(x);
        System.out.println(sum=a+x);


//        Integer b=Integer.parseInt(str1);
//         int s=Integer.parseInt(str1);
    }


    public static void main(String[] args) {

        BoxingConcept box=new BoxingConcept();
       // box.box();
        box.box1();
        String str1 = "100";
        String str2 = "200";

        int o = Integer.parseInt(str1);
        System.out.println(o);
        Integer o1 = Integer.valueOf(str1);
        System.out.println(o1);
        System.out.println("___________");
        int n = Integer.parseInt(str2);
        Integer n1 = Integer.valueOf(str2);

        System.out.println(str1+str2);
        System.out.println(o+n);
        System.out.println(o1+n1);

    }
}
