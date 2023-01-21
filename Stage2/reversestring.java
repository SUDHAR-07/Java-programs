import java.io.*;
import java.util.*;

public class reversestring {

    public static void main(String[] args) {
      Scanner susan = new Scanner(System.in);
      String a = susan.nextLine();
      int b = a.length();
      for(int i = 0; i < b; i++) {
        System.out.print(a.charAt(b-i-1));
      }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}