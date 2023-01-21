import java.util.*;

public class zoho22 {
	public static void main(String[] args) {
		Scanner susan = new Scanner(System.in);
		int len = susan.nextInt();
		int[] a = new int[len];
		for(int i = 0; i < len; i++){
		    a[i]= susan.nextInt();
		}
        susan.close();
		int[] we = new int[len];
	    int c = 0;
	    for(int i = 0; i < a.length;i++){
	        c = 0;
	        if(isPerfectSquare(a[i])){
	            c += 5;
	        }
	        if(isevenNo(a[i])){
	            c+= 3;
	        }
	        if(muldiv(a[i])){
	            c+=4;
	        }
	       // System.out.println(a[i] + " " + c);
	        we[i] = c;
	    }
	    sort(a,we,len);
	    print(a,we,len);
	}
	
	public static void print(int[] a,int[] we,int len){
	    for(int i = 0; i < len;i++){
	        if(i == len - 1){
	            System.out.print("<" + a[i] + "," + we[i] + ">");
	        } else{
	            System.out.print("<" + a[i] + "," + we[i] + ">,");
	        }
	    }
	}
	public static void sort(int[] a,int[] we,int len){
	    for(int i = 0; i < len;i++){
	        for(int j = i + 1; j < len;j++){
	            if(we[i] > we[j]){
	                we[j] ^= we[i];
	                we[i] ^= we[j];
	                we[j] ^= we[i];
	                a[i] ^= a[j];
	                a[j] ^= a[i];
	                a[i] ^= a[j];
	            }
	        }
	    }
	}
	
	public static boolean isPerfectSquare(int a){
	    for(int i = 1; i <= a/2;i++){
	        if(a / i == i && a % i == 0){
	            return true;
	        }
	    }
	    return false;
	}
	
	public static boolean isevenNo(int a){
	    if(a % 2 == 0){
	        return true;
	    } else {
	        return false;
	    }
	}
	
	public static boolean muldiv(int a){
	    if(a % 4 == 0 && a % 6 == 0){
	        return true;
	    } else {
	        return false;
	    }
	}
}


