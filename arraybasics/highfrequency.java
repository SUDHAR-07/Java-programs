import java.io.*;
import java.util.*;

public class highfrequency {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int n = susan.nextInt();
      int[] p = new int[n];
      for(int i = 0; i < n;i++){
        p[i]=susan.nextInt();
      }    
      int min = getMin(p,n);
      int maxele = getMax(p,n);
      int m = 0,max = 0,count = 0,c =0;
      for(int i = 0; i < n; i++){
        c = 0;
        for(int j = i+1; j < n; j++){
          if(p[i] == p[j]){
            c++;
          }
        }
        if(c > max){
            m = i;
            max = c;
        }else if(c == max){
          count++; 
        }
      }
      if(max == 0){
        System.out.print(min);
      }else if(count == 0){
        System.out.print(max);
      }else
        System.out.print(p[m]);
    }
  
  public static int getMin(int[] p, int len){
    int s = p[0];
    for(int i = 0; i < len; i++){
      if(p[i] < s){
        s = p[i];
      }
    }
    return s;
  }
  
   public static int getMax(int[] p, int len){
    int s = p[0];
    for(int i = 0; i < len; i++){
      if(p[i] > s){
        s = p[i];
      }
    }
    return s;
  }
}