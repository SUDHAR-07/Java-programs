import java.io.*;
import java.util.*;

public class merge_sort {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int n = susan.nextInt();
      int[] p = new int[n];
      for(int i = 0; i < n;i++){
        p[i] = susan.nextInt();
      }
      int h = susan.nextInt();
      int[] k = new int[h];
      for(int i = 0; i < h;i++){
        k[i] = susan.nextInt();
      }
      int[] l = new int[n + h];
      for(int i = 0; i < n + h; i++){
          if(i < n)
            l[i] =p[i];
          else
            l[i] = k[i - n];
      }
      Sort(l, n + h);
      print(l,n+h);
    }
  
  public static void Sort(int[] l, int len){
    // int n = -100000;
    for(int i = 0; i < len; i++){
      for(int j = i+1; j < len; j++){
      if(l[i] < l[j]){
        l[i] ^= l[j];
        l[j] ^= l[i];
        l[i] ^= l[j];
      }
      }
    }
  }
  public static void print(int[] l, int len){
    for(int i = 0; i < len; i++){
      System.out.print(l[i] + " ");
    }
  }
}