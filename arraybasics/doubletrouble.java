import java.io.*;
import java.util.*;

public class doubletrouble {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int n = susan.nextInt();
      int[] p = new int[n];
      for(int i = 0; i < n; i++){
        p[i] = susan.nextInt();
      }
      for(int i = 0; i < n-1; i++){
        if(p[i] == p[i+1]){
          p[i] = p[i] * 2;
          p[i+1] = 0;
        }
      }
      int c = 0;
      for(int j = 0; j < n-1;j++){
          if(p[j] == 0){
            for(int i = j; i < n;i++){
              if(p[i] != 0){
                p[i] ^= p[j];
                p[j] ^= p[i];
                p[i] ^= p[j];
                break;
              }
          }
        }
      }     
      print(p,n);
    }
  
  public static void print(int[] p , int len){
    for(int i = 0; i < len; i++){
      System.out.print(p[i] + " ");
    }
    System.out.println();
  }
}