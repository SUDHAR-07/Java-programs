// import java.util.*;

// public class NumberPalindrome {
//     public static void main(String[] args) {
//         Scanner susan = new Scanner(System.in);
//         int n = susan.nextInt();
//         if(isPalindrome(n)){
//             System.out.println("The number is palindrome");
//         }else{
//             System.out.println("The number is not palindrome");
//         }
//     }

//     public static boolean isPalindrome(int a){
//         int s = 0,org = a;
//         while(a != 0){
//             s = (s * 10) + (a % 10);
//             a /= 10;
//         }
//         // System.out.println(s);
//         if(org == s){
//             return true;
//         }
//         return false;
//     }
// }


import java.util.*;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int n = susan.nextInt();
        if(Rev(n) == n){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("The number is not palindrome");
        }
    }

public static int Rev(int a){
    int rev = 0;
    while(a != 0){
        rev = (rev * 10) + (a % 10);
        a /= 10;
    }
    return rev;
}
}
