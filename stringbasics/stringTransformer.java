import java.io.*;
import java.util.*;

public class  stringTransformer{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      String h = susan.next();
      int n = h.length();
      char[] a = new char[n];
      for(int i = 0; i < n; i++){
        a[i] = h.charAt(i);
      }
      for(int i = 0; i < n; i++){
        char g = a[i];
        System.out.print((char)(90 - (g - 'A')));
      }
    }
}
