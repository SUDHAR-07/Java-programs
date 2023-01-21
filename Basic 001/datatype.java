import java.io.*;
import java.util.*;

public class datatype {

    public static void main(String[] args) {
      Scanner susan = new Scanner(System.in);
      int a = susan.nextInt();
      Float b = susan.nextFloat();
      Double c = susan.nextDouble();
      char d = susan.next().charAt(0);
      String e = susan.next();
      System.out.println(a);
      System.out.printf("%.6f",b);
      System.out.println();
      System.out.printf("%.6f",c);
      System.out.println();
      System.out.println(d + "\n" + e);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}