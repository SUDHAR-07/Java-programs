// package DAY 1;
import java.util.*;

public class First_n_Prime {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int n = susan.nextInt();
        for(int i = 1; i <= n;i++){
            if(isPrime(i)){
                System.out.println("THE Number is " + i);
            }
        }
    }

    public static boolean isPrime(int n){
        int sq = (int)Math.sqrt(n);
        for(int i = 2; i <= sq;i++){
            if(isPrime(i)){
                if(n % i == 0){
                    return false;
                }
            }
        }
        return true; 
    }
}
