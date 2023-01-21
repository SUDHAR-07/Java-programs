import java.io.*;
import java.util.*;

public class alternatesort {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner susan = new Scanner(System.in);
    int a = susan.nextInt();
    int[] b = new int[a]; 
    int max = 0, min = 0;
    for(int i = 0; i <a;i++){
        b[i] = susan.nextInt();
    }
    for(int i = 0; i < a; i++){
        for(int j=i+1; j<a;j++){
            if(i % 2 != 0) {
                if(b[i] < b[j]){
                        min = b[i];
                        b[i] = b[j];
                        b[j] = min;
                    }
                } else if (i % 2 == 0) {
                    if(b[i] > b[j]){
                        max = b[i];
                        b[i] = b[j];
                        b[j] = max;
                    }
                }
            }
        }
        for(int i=0; i <a; i++){
            System.out.print(b[i] + " ");
        }
    }
}