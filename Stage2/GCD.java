import java.io.*;
import java.util.*;

public class GCD {

    public static void main(String[] args) {
    Scanner su = new Scanner(System.in);    
    int a = su.nextInt();
    int[] b = new int[a];
    for(int i = 0; i < a; i++) {
        b[i] = su.nextInt();
    }
    int k = su.nextInt();
    int m=0;
    int gcd = 0;
    for(int i =0; i < a;i++){
        for(int h = k; h > 0; h --) {
        if((b[i] % h == 0 ) && (k % h == 0) ) {
            m = h;
         //  printf("the disvisaor %d\n",m);
        }
        if(m > gcd){
              gcd = m; 
            }
        //printf("%d",m);
        }
    }
    System.out.println(gcd);
}

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
}