import java.io.*;
import java.util.*;

public class pattern{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner (System.in); 
      int a = susan.nextInt();
      for(int i = 0; i < a; i++){
        for(int j = 0; j < a; j++){
          System.out.print("* ");
        }
        System.out.println();
      }
    }
}