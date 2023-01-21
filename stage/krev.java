import java.util.*;

public class krev {
	public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int[] g = new int[]{8,4,5,6,7,2,9,7};
        int k = susan.nextInt();
        susan.close();
        int n = g.length;
        for(int i = 0; i < n; i=i + k){
            
            if(i + k <= n){
                System.out.println(i + " " + (i+k));
                split(g,i,i+k);
            }
            else if(i + k > n){
                System.out.println(i + " " + n);
                split(g,i,n);
            }
        }
        // split(g,0,n);
        print(g);
	}
	
	public static void split(int[] g,int start, int end){
	    int l = (start + end)/2; 
	    for(int i = start; i < l;i++){
	        g[end - 1] ^= g[i];
	        g[i] ^= g[end-1];
	        g[end - 1] ^= g[i];
	    }
	    for(int i = start; i < end;i++){
	        System.out.print(g[i]);
	    }
	    System.out.println();
	}
	
	public static void print(int[] g){
	    System.out.println();
	    for(int i = 0; i < g.length;i++){
	        System.out.print(g[i]);
	    }
	}
}

