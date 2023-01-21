import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner susan = new Scanner(System.in);
      int a = susan.nextInt();
      int g = a;
      int s = 0;
      int rem;
      while(a != 0){
        rem = a % 10;      
        s = (s * 10) + rem ;
        a = a / 10;
      }
     // System.out.println(s);
      if(s == g){
          System.out.println("Yes");
      } else {
          System.out.println("No");
      }
    }
}