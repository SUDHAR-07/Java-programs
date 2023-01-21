import java.io.*;
import java.util.*;

public class maxmin {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int[] a = new int[100];
      int i = 0;
      while(susan.hasNext()){
        a[i]= susan.nextInt();
        if(a[i] == -1){
          break;
        }
        i = i + 1;
      }
      int m = a[0];
      int min = a[0];
      double s = 0;
      double d;
      for(int j = 0; j < i;j++) {
        if(a[j] > m){
          m = a[j];
        }
        if(min > a[j]){
          min = a[j];
        }
        s = s + a[j];
      }
      d = s / i;
      System.out.println("Min=" + min);
      System.out.println("Max=" + m);
      System.out.printf("Sum=%.0f" ,s);
      System.out.println();
      System.out.printf("Avg=%.6f",d);
      
    }
}