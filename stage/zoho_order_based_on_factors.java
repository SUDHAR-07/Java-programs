import java.util.*;

public class zoho_order_based_on_factors {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int n = susan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n;i++){
            a[i] = susan.nextInt();
        }
        susan.close();
        sort(a,n);
        print(a,n);
	}

	public static void print(int[] a,int n){
	    for(int i = 0; i < n;i++){
	        System.out.print(a[i] + ",");
	    }
	}

	public static void sort(int[] a,int n){
	    for(int i = 0; i < n-1;i++){
	        for(int j = i + 1; j < n;j++){
	            if(fact(a[i],a[j])){
	                swap(a,i,j);
	            }
	        }
	    }
	}
	
	public static void swap(int[] a,int i, int j){
	    int temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	}
    
	public static boolean fact(int a,int b){
	    int fact1 = 0, fact2 = 0;
	    for(int i = 1; i <= a;i++){
	        if(a % i == 0){
	           fact1++; 
	        }
	    }
	    for(int i = 1; i <= b;i++){
	        if(b % i == 0){
	           fact2++; 
	        }
	    }
	    if(fact1 > fact2){
	        return false;
	    } else {
	        return true;
	    }
	}
}

