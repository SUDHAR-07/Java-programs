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
// 		 public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int len = susan.nextInt();
        int[] a = new int[len];
        for(int i = 0; i < len;i++){
            a[i] = susan.nextInt();
        }
        int n = susan.nextInt();
        int index = getIndex(a,n);
        print(a,index,n);
	}
	
	public static void print(int[] a,int index,int n){
	    if(a[index + 1] != n){
	        System.out.println(index + 1);
	        return;
	    } else{
	        print(a,index+1,n);
	    }
	}
	
	public static int getIndex(int[] a,int n){
	    int start = 0,end = a.length-1;
	    for(int i = 0; i < a.length;i++){
            int middle = (start + end)/ 2;
            if(a[middle] == n){
                // S/ystem.out.println(middle);
                return middle;
            } else if(a[middle] < n){
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return 0;
	}
}

