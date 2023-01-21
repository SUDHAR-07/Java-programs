import java.util.Scanner;

// package DAY 2;

public class GCD_HCF {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int a = susan.nextInt();
        int b = susan.nextInt();
        System.out.print(gcd(a,b));
    }
    
    public static int gcd(int a , int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}
