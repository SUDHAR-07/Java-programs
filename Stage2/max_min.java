import java.io.*;
import java.util.*;

public class max_min {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int a = susan.nextInt();
      int[] b = new int[a];
      for(int i = 0; i < a; i++) {
        b[i] = susan.nextInt();
      }
      int k = susan.nextInt();
      int s = 0, stop = 0;
      for(int i = 0; i < a; i+= k){
        if(i + k > a-1){
          stop = a;
        } else {
          stop = i + k;
        }
        if(s % 2 == 0){
          getMAX(b,i,stop);
          s = 1;
        } else {
          getMIN(b,i,stop);
          s = 0;
        }
      } 
    }
  public static void getMAX(int[] b,int start,int end){
    int max = b[start];
    for(int i = start;i < end;i++){
      if(b[i] > max){
        max = b[i];
      }
    }
    System.out.print(max + " ");
  }
    public static void getMIN(int[] b,int start,int end){
    int max = b[start];
    for(int i = start;i < end;i++){
      if(b[i] < max){
        max = b[i];
      }
    }
    System.out.print(max + " ");
  }
}