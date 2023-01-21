import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class perfectSQ {

    public static void main(String[] args) {
      Scanner susan= new Scanner(System.in);
      double a=susan.nextDouble();
      double b=Math.sqrt(a);
      double c=Math.floor(b);
      if((b-c)==0){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}