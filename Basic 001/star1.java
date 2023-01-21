import java.io.*;
import java.util.*;

public class star1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner s = new Scanner(System.in);
      int a = s.nextInt();
      for(int i=0;i<a;i++){
        System.out.print(" ");
        for(int j=0;j<a;j++){
          if(i+j >= a-1)
            System.out.print("*");
          else 
            System.out.print(" ");
        }
      for(int k=a-1;k>0;k--){
        if(i < k)
          System.out.print("*");
        else 
          System.out.print(" ");
      }
      System.out.println();
      }
    }
}