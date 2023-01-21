// package STAGE 1 BASICS;
import java.io.*;
    import java.util.*;

public class Product_of_digits {
        public static void main(String args[] ) throws Exception {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT */
          Scanner susan = new Scanner(System.in);
          int a = susan.nextInt();
          int s = 1;
          while(a != 0){
            s *= (a % 10);
            a /= 10;
          }
          System.out.print(s);
        }    
}
