import java.io.*;
import java.util.*;

public class decimal_to_binary {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int[] a = new int[10];
      int g = susan.nextInt();
      int i = 0;
      for(i=0;g > 0;i++) {
        a[i] = g % 2;
        g = g / 2;
      }
      for(int j = 0; j < i; j++) {
        System.out.print(a[i-j-1]);
      }
    }
}