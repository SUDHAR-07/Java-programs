import java.io.*;
import java.util.*;

public class decimaltobinary {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int a = susan.nextInt();
      int[] b = new int[10];
      //int c = 0;
      int i = 0;
      while(a > 0) {
        b[i] = a % 2;
        a = a / 2;
        i= i + 1;
      }
      for(int j = 0; j < i; j++) {
        System.out.print(b[i-j-1]);
      }
      
    }
}