import java.io.*;
import java.util.*;

public class middle {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int n = susan.nextInt();
      int[] p = new int[n];
      for(int i = 0; i < n;i++){
        p[i] = susan.nextInt();
      }
      System.out.print(p[n/2]);
  }
}