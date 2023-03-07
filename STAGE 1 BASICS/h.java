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
		String k = susan.next();
		String m = cut(k);
		System.out.println(m);
	}
	
	public static String cut(String a){
	    char[] h = a.toCharArray();
	    int len = h.length;
	    String g = "";
	    for(int i = 0; i < a.length() - 1;i++){
	        if((h[i] == 'A' &&  h[i+1] == 'B')||(h[i] == 'B' && h[i] == 'B')){
	            remove(h,i);
	            remove(h,i+1);
	            len = len - 2;
	        }
	    }
	    for(int i = 0; i < len;i++){
	        g += h[i];
	    }
	    return g;
	}
	
	public static char[] remove(char[] a,int start){
	    for(int i = start; i < a.length-1;i++){
	        a[i] = a[i+1]; 
	    }
	    return a;
	}
}

