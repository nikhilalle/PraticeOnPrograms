package pratice.corejava.allPrograms;

public class MarksTest {
    public void result(String str,int marks){
        if(marks<50){
            System.out.println("fail");
        }
        else if(marks>=50 && marks<60){
            System.out.println("D grade "+str);
        }
        else if(marks>=60 && marks<70){
            System.out.println("C grade  "+str);
        }
        else if(marks>=70 && marks<80){
            System.out.println("B grade  "+str);
        }
        else if(marks>=80 && marks<90){
            System.out.println("A grade  "+str);
        }else if(marks>=90 && marks<100){
            System.out.println("A+ grade  "+str);
        }else{
            System.out.println("Invalid!");
        }

    }
    public static void main(String[] args) {
        MarksTest mn=new MarksTest();
        mn.result("Karthik",45);
        mn.result("Rakesh",55);
        mn.result("Santosh",65);
        mn.result("Sudhir",75);
        mn.result("Haarika",85);
        mn.result("Shruti",95);


    }
}

