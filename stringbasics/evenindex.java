import java.io.*;
import java.util.*;

public class evenindex{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      String a = susan.nextLine();
      int n = getLen(a);
      for(int i = 0; i < n; i++){
        if(i % 2 == 0)
          System.out.print(a.charAt(i));
        else
          System.out.print(" ");
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