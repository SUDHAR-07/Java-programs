import java.io.*;
import java.util.*;

public class vowles {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      String a = susan.nextLine();
      int n = getLen(a);
      for(int i = 0; i < n; i++){
          if(containsVowel(a.charAt(i)))
            System.out.print("*");
        else
          System.out.print(a.charAt(i));
      }
    }
  
  public static boolean containsVowel(char f){
    if(f == 'a' || f == 'e' || f == 'i' || f == 'o'|| f == 'u' || f == 'A'|| f == 'E' || f == 'I' || f=='O' || f=='U'){
      return true;
    }
    return false;
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