import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner susan = new Scanner(System.in);
		int n = susan.nextInt();
		int[] g = new int[n];
		for(int i = 0; i < n;i++){
		    g[i] = susan.nextInt();
		}
		System.out.println(solve(g,n));
	}
	public static String solve(int[] g,int n){
	    for(int i = 0; i < n; i++){
	        if(g[i] + g[i+1] != 0){
	            return "NO";
	        }
	    }
	        return "YES";
	}
}

