import java.io.*;
import java.util.*;

public class odd_digit {
  public static void main(String[] args) {
//     System.out.println("Hello World");
     Scanner susan = new Scanner(System.in);
      int b = susan.nextInt();
      int s = 0,k = 0, a = 0;
      boolean flag = true;
      while(b > 0){
        a = a * 10 + (b % 10);
        b = b / 10;
      }
      while(a > 0){
          s = a % 10;
          if(k % 2 == 1 && s % 2 == 1){
              System.out.print(s);
              flag = false;
          }
          a = a / 10;
          k++;
      }
    if(flag == true){
      System.out.println("0");
    }
  }
}
