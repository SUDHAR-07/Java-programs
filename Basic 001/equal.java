import java.io.*;
import java.util.*;

public class equal {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      char a = susan.next().charAt(0);
      char b = susan.next().charAt(0);
      if(a == b){
        System.out.println("EQUAL");
      } else {
        System.out.println("NOT EQUAL");
      }
    }
}