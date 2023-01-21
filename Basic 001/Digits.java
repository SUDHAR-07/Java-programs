import java.io.*;
import java.util.*;

public class Digits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int a = susan.nextInt();
      int s = 0;
      while(a > 0){
        a = a / 10;
        s = s + 1;
      }
      System.out.println(s);
    }
}