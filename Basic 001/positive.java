import java.io.*;
import java.util.*;

public class positive{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int a = susan.nextInt();
      if(a >=0) {
        System.out.println("Positive");
      } else {
        System.out.println("Negative");
      }
    }
}