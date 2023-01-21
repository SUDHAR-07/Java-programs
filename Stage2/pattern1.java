import java.io.*;
import java.util.*;

public class pattern1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner susan = new Scanner(System.in);
        int n =susan.nextInt();
        
        for(int i = 0; i < n; i++){
            if(n % 2 == 0 && i == n/2){
                    continue;
                }
            for(int j = 0; j < n; j++){
                if(i == j || i+j == n-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}