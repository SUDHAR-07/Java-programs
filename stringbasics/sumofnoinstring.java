import java.io.*;
import java.util.*;

public class sumofnoinstring {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      String a = susan.nextLine();
      int n = getLen(a);
      int s = 0;
      for(int i = 0; i < n; i++){
        if(a.charAt(i) >= 48 && a.charAt(i) <= 57){
          s += (a.charAt(i) - '0');
        }
      }
      System.out.println(s);
    }
  public static int getLen(String a){
    int i = 0;
    try{
      while(true){
      a.charAt(i);
      i++;
      }
    } catch(Exception e){
      return i;
    }
  }
}
