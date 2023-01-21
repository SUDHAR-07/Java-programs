import java.io.*;
import java.util.*;

public class repearedele {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner susan = new Scanner(System.in);
        int a = susan.nextInt();
        int count = 0;
        int start = 1000;
        int end = 0;
        int[] b = new int[a];
        for(int i = 0; i < a; i++) {
            b[i] = susan.nextInt();
        }
        for(int i = 0; i < a/2; i ++) {
            for(int j = 0; j < a; j++){
                if(b[i] == b[j] && i != j){
                    // System.out.println(b[j]);
                    // System.out.println(j-i);
                    if((j-i) < start){
                        start = j - i;
                        end = i;
                    }
                    count++;
                }
            }
        }
        if(count == 0){
            System.out.println("No Element Is Repeated");
        } else {
            System.out.println(b[end]);
        }
    }
}