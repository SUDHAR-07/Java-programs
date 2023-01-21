// public import java.io.*;
import java.util.*;

public class pattern1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int n = susan.nextInt();
      for(int i = n; i > 0; i--){
        for(int j = 0; j < i;j++){
          System.out.printf("%c",j+97);
        }
        System.out.println();
      }
    }
} 
