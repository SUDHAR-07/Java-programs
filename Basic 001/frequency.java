/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner susan = new Scanner(System.in);
		String a = susan.next();
		int result = MostFrequentCharacter(a);
		System.out.println(result);
	}

    public static int MostFrequentCharacter(String a){
		int n = a.length();
		int[] count = new int[26];
		for(int i = 0; i < n;i++){
		    count[a.charAt(i) - 'a']++;
		}
		int max = count[0];
		for(int i = 0; i < 26;i++){
		    if(count[i] > max ){
		        max = count[i];
		    }
		}
		return max;
	}
}

