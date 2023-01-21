import java.util.*;

public class Binary_ADD {
    public static void main(String[] args) {
    Scanner susan = new Scanner(System.in);
    System.out.println("Enter 1st bInary No");
    long a = susan.nextLong();
    System.out.println("Enter 2nd bInary No");
    long b = susan.nextLong();
    int[] ans = new int[100];
    int c = 0,rem = 0;
    while(a != 0 || b != 0){
        ans[c++] = (int)((a % 10 + b % 10 + rem )% 2);
        rem = (int)((a % 10 + b % 10 + rem) / 2);
        a /= 10;
        b /= 10;
    }
    if(rem != 0){
        ans[c++] = rem;
    }
    System.out.println(c);
    while(c >= 0){
        System.out.print(ans[c--]);
    }
        // System.out.println((a ^ b));
}
}

