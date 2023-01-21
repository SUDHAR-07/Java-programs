import java.io.*;
import java.util.*;

public class maxof2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int a = susan.nextInt();
      int b = susan.nextInt();
      if(a >= b){
        System.out.println(a);
      } else {
        System.out.println(b);
      }
    }
}