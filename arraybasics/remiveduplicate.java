import java.io.*;
import java.util.*;

public class remiveduplicate {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int n = susan.nextInt();
      int[] p = new int[n];
      for(int i = 0; i < n;i++){
        p[i] = susan.nextInt();
      }
      int g = remove(p,n);
      print(p,g);
    }
  public static int remove(int[] l , int len){
    int g = 0;
    for(int i = 0; i < len; i++){
      for(int j = i+1; j < len;j++){
        if(l[i] == l[j]){
          for(int h = j; h < len-1;h++){
            l[h] = l[h+1];
          }
          len--;
        }
      }
    }
    return len;
  }
  public static void print(int[] l, int len){
    for(int i = 0; i < len; i++){
      {
        System.out.print(l[i] + " " );
      } 
    }
  }
}