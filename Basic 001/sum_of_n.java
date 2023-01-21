import java.io.*;
import java.util.*;

public class sum_of_n {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner susan = new Scanner(System.in);
      long a = susan.nextLong();
      long s = 0;
      for(int  i =0; i <= a; i++){
        s = s + i;
      }
      System.out.println(s);
    }
}