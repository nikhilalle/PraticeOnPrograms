package pratice.newJava.Methods;

public class ReturnMethod {
    public int add(){
        int c;
        c=50+50;
        return c;
    }
    public int mutl(){
        int c;
        c=50*50;
        return c;
    }
    public int sub(){
        int c;
        c=50-50;
        return c;
    }
    public int div(){
        int c;
        c=50/50;
        return c;
    }
    public float modul(){
        float c;
        c=50%50;
        return c;
    }

    public static void main(String[] args) {
        ReturnMethod value=new ReturnMethod();
        System.out.println(value.add());
        System.out.println(value.mutl());
        System.out.println(value.sub());
        System.out.println(value.div());
        System.out.println(value.modul());

    }
}
