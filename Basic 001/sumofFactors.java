import java.io.*;
import java.util.*;

public class sumofFactors {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int n = susan.nextInt();
      int s = 0;
      for(int i = 1; i <= n; i++){
        if(n % i == 0){
          s = s + i;
        }
      }
      System.out.println(s);
    }
}