import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int a = susan.nextInt();
        int b = susan.nextInt();
        for(int i = b; i >= a;i--){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
	}
	
	public static boolean isPrime(int n){
	    int sq = (int) Math.sqrt(n);
        for (int j = 2; j <= sq; ++j) {
            if(isPrime(j)){
                if(n % j == 0){
                    return false;
                }
            }
        }
	    return true;
    }
}
