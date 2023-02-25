/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        Scanner susan = new Scanner(System.in);
        int a = susan.nextInt();
        long h = 0;
        int one = 0,max = 0;
        while(a != 0){
            h = h * 10 + (a % 2);
            a = a / 2;
        }
        // h = h * 10 + (a % 2);
        // System.out.println(h);
        while(h != 0){
            if(h % 10 == 1){
                one++;
            } else if ( h % 10 == 0){
                if(one > max){
                    max = one;
                }
                one = 0;
            }
            h = h / 10;
        }
        if(one > max){
            max = one;
        }
        System.out.println(max);
	}
}

