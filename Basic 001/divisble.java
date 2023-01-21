import java.io.*;
import java.util.*;

public class divisble {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int a = susan.nextInt();
      if(a % 3 == 0 && a % 5 == 0) {
        System.out.println("HiHello");
      } else if(a % 3 == 0) {
        System.out.println("Hi");
      } else if (a % 5 == 0){
        System.out.println("Hello");
      }
    }
}