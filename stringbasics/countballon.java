import java.io.*;
import java.util.*;

public class countballon {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int n = susan.nextInt();
      char[] a = new char[n];
      int[] b = new int[n];
      for(int i = 0; i < n; i++){
        a[i] = susan.next().charAt(0);
      }
      for(int i = 0; i < n; i++){
        int c = 0;
        for(int j = 0; j < n; j++){
          if(a[i] == a[j]){
            c++;
          }
        }
        b[i] = c;
      }
      for(int i = 0; i < n;i++){
        System.out.println(a[i] + "-" + b[i]);
      }
    }
}