import java.util.*;


public class spiral {
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        Scanner susan = new Scanner(System.in);
        int n = susan.nextInt();
        susan.close();
        int[][] s = new int[n][n];
        int j=0,k=0,l=0,m=0,h=1,start=0,end=n-1;
        for(int i = 0; i<= n/2; i++,start++,end--){
            for(j = start; j < end; j++,h++){
                s[i][j] = h;
            }
            for(k = start; k <end;k++,h++){
                s[k][j] = h;
            }
            for(l = end; l > start;l--,h++){
                s[k][l] = h;
            }
            for(m = end; m > start; m--,h++){
                s[m][l] = h;
            }
            if(end == start){
                s[start][end] = h;
                h++;
            }
        }
        for(int y = 0; y < n;y++){
            for(int t = 0; t < n; t++){
            System.out.print(s[y][t]);
            }
            System.out.println();
        }
	}
}
