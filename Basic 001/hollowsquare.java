import java.io.*;
import java.util.*;

public class hollowsquare {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner n = new Scanner(System.in);
      int a = n.nextInt();
      for(int i =0; i < a; i++){
        for(int j =0; j<a; j++){
          if(i == 0 || j == 0 || i == a-1 || j==a-1 || i == j || i + j == a-1)
            System.out.print("* ");
          else
            System.out.print("  ");
        }
        System.out.println();
      }
    }
}