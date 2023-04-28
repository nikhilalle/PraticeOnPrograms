package programs;

import org.testng.annotations.Test;

public class ForLoop1 {
    @Test
    public void get(){
int r=5;
int c=5;
int n=2;
int z=2;
int[][] arrayValue=new int[r][c];

for(int i =0;i<r;i++){
    for(int j=0;j<c;j++){
        arrayValue[i][j] =  n*z;
        n++;
    }
}
for(int i=0;i<r;i++){
    for (int j=0;j<c;j++){
        System.out.print(+arrayValue[i][j]+" "  );
    }
    System.out.println();
}



    }
}
