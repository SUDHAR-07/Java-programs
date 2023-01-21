import java.io.*;
import java.util.*;

public class product_no {
  
    public static void main(String[] args) {
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int a = susan.nextInt();
      int s = 1;
      int r;
      while(a != 0){
        r = a % 10;
        s = s * r;
        a = a / 10;
      }
      System.out.println(s);
    }
}