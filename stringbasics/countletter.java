import java.io.*;
import java.util.*;

public class countletter{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      String a = susan.nextLine();
      int n = getLen(a);
      int alpha = 0, s = 0, d = 0;
      for(int i = 0; i < n; i++){
        if((a.charAt(i) >= 65 && a.charAt(i) < 91)||(a.charAt(i) >= 97 && a.charAt(i) < 123)){
          alpha++;
        }else if(a.charAt(i) >= 48 && a.charAt(i) <= 57){
          d++;
        }else{
          s++;
        }
      }
      System.out.println("Number of Alphabets in the string is : " + alpha);
      System.out.println("Number of Digits in the string is : " + d);
      System.out.println("Number of Special characters in the string is : "  + (s+1));
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