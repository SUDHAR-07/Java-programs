import java.util.Scanner;

public class Reverse_A_NO {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int n = susan.nextInt();
        Rev(n);
    }

//     public static int Rev(int a){
//         int rev = 0;
//         while(a != 0){
//             rev = (rev * 10) + (a % 10);
//             a /= 10;
//         }
//         return rev;
//     }
// }

public static void Rev(int number) {
    if (number < 10) {
        System.out.println(number);
        return;
    } else {
        System.out.print(number % 10);
        Rev(number / 10);
    }
}
}