import java.io.*;
import java.util.*;

public class primeno {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int n = susan.nextInt();
      if(n == 1){
        System.out.print("-1");
      }else if(isPrime(n)){
        System.out.print("1");
      }else{
        System.out.print("0");
      }
    }
  
  public static boolean isPrime(int n){
    double nn = Math.sqrt(n);
    for(int i = 2; i <= (int)nn; i++){
      if(isPrime(i)){
        if(n % i == 0){
          return false;
        }
      }
    }
    return true;
  }
}