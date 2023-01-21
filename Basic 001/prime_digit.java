import java.io.*;
import java.util.*;

public class prime_digit {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner ga =  new Scanner(System.in);
      int a = ga.nextInt();
      int s = 0;
      int y = 0;
      while(a > 0) {
        y = a % 10;
        s = (s * 10) + y ;
        a = a / 10;
      }
      int g = 0;;
      while (s > 0) {
        g = s % 10;
        if( (g == 2) || (g==3) || (g==5) || (g==7)){
          System.out.print(g + " ");
        }
        s = s / 10;  
        }
    }
}