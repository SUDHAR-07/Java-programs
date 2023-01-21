import java.io.*;
import java.util.*;

public class product {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      long a = susan.nextInt();
      long s = 1;
      for(int i =1; i <= a; i++){
        s = s * i;
      }
      System.out.println(s);
    }
}