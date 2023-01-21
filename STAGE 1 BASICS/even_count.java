import java.io.*;
import java.util.*;

public class even_count {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int n = susan.nextInt();
      int s = 0;
      while(n != 0){
        if((n % 10)%2==0){
          s++;
        }
        n = n / 10;
      }
      System.out.print(s);
    }
}