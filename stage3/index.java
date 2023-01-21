import java.io.*;
import java.util.*;

public class index {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner susan = new Scanner(System.in);
    int a = susan.nextInt();
    int[] b = new int[a];
    for(int i = 0; i < a; i++) {
        b[i] = susan.nextInt();
    }
    for(int i = 0; i < a; i++) {
        for(int j = 0; j < a; j++){
            if(b[j] == i){
                System.out.print(j + " ");
            }
        }
    }
    }
}