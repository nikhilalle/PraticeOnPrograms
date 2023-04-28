package programs;

import org.testng.annotations.Test;

public class ForLoop {
    @Test
    public void get() {
        int row=5;
        int column=5;
        int n=1;
        int [][] arr=new int[row][column];
        System.out.println("Rows   "+row+"   Columns  "+column);
        for(int i=1;i<row;i++){
            for (int j=1;j<column;j++){
                arr[i][j]=n;
                n++;

            }
        }
        for(int i=1;i<row;i++){
            for (int j=1;j<column;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
    @Test
    public void string2DArray(){
        java.lang.String [][] str={{"Nikhil","Pranali","Pooja"},{"Akhil","Shruti"},{"Pranav","Rakesh","Pranav"},{"Rohit","Shri","Anand"},{"Sudhir","Pankaj"}};
        System.out.println(str.length);

        for(int i=0;i<str.length;i++){
            for(int j=0;j<str[i].length;j++){
                System.out.println(" Array of [" + i + "][" + j + "] = "+str[i][j]);
            }
        }
    }

    @Test
    public  void loops()
    {
        int[][] arr = { { 1, 2 }, { 3, 4 } };
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++)
                System.out.println("arr[" + i + "][" + j + "] = "+ arr[i][j]);
    }

}