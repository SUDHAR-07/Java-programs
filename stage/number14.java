import java.util.*;

public class number14 {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int n = susan.nextInt();
        susan.close();
        int[][] b = new int[n][n];
        int start  = 0, end = n-1, h =n,j=0,k=0;
        for(int i = 0; i < n; i++,start++,end--,h--){
            for(j = end; j > start;j--){
                b[i][j] = h;
            }
            for(k = start; k < end; k++){
                b[k][j] = h;
            }
            if(start == end){
                b[start][end] = h;
            }
        }
        for(int  i = 0; i < n; i++){
            for(int  jj =0; jj <n; jj++){
                System.out.print(b[i][jj] + " ");
            }
            System.out.println();
        }
    }
}
