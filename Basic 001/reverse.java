import java.io.*;
import java.util.*;

public class reverse {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int a = susan.nextInt();
      int s = 0;
      while(a > 0){
        System.out.print(a % 10);
        a = a / 10;
        s = s + 1;
      }
    }
}