import java.io.*;
import java.util.*;

public class day {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int a = susan.nextInt(); 
      String[] b = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THRUSDAY","FRIDAY","SATURDAY"};
      if(a >= 0 && a < 7) {
        System.out.println(b[a]);
      } else {
        System.out.println("INVALID");
      }
    }
}