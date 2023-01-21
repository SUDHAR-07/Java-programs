import java.io.*;
import java.util.*;

public class reversestring {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      String a = susan.nextLine();
      int n = getLen(a);
      char[] aa =new char[n];
      for(int i = 0; i < n; i++){
        aa[i] = a.charAt(n - i - 1);
        System.out.print(aa[i]);
      }    
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