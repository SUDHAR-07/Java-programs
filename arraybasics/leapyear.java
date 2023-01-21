import java.io.*;
import java.util.*;

public class leapyear {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int n = susan.nextInt();
      if((n % 4 == 0 && n % 100 != 0)||(n % 400 == 0 && n%100 == 0)){
        System.out.print("Leap year");
      }else{
        System.out.print("Not a leap year");
      }
    }
}