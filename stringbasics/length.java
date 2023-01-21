import java.io.*;
import java.util.*;

public class length {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      String a = susan.nextLine();
      System.out.println(getLen(a));
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