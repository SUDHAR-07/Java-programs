// import java.io.*;
import java.util.*;

public class armstrong {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int g = susan.nextInt();
      int a = g,c = 0,j = g,ans = 0;
      while(g != 0){
        g /= 10;
        c++;
      }
      while(a != 0){
        ans += Math.pow((a % 10),c);
        a /= 10;
      }
      if(ans == j){
        System.out.print("Yes");
      }else{
        System.out.print("No");
      }
    }
}