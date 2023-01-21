import java.io.*;
import java.util.*;

public class fibonacci {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner susan = new Scanner (System.in);
    int a = susan.nextInt();
    int b = 0;
    int c = 1;
    int t = 0;
    int sum = 0;
    for(int i = 2; i < a; ++i){
        t = b + c;
        sum = sum + t;
        b = c;
        c = t;
      //  System.out.print(b + " " + c + "\n");
    }
    System.out.println(sum+1);
    }
}