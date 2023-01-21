import java.io.*;
import java.util.*;

public class count_prime {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int s = susan.nextInt();
      int c = 0;
      int t = 0;
      while(s != 0) {
        t = s % 10;
        if(t == 1 || t== 2 || t==3 || t==5 || t==7) {
          c = c + 1;
        }
        s = s / 10;
      }
      System.out.println(c);
    }
}