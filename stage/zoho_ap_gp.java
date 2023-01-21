import java.util.*;

public class zoho_ap_gp {
	public static void main(String[] args) {
	    Scanner susan = new Scanner(System.in);
	    int n = susan.nextInt();
	    int s = susan.nextInt();
	    int d = susan.nextInt();
	    String w = susan.next();
	    susan.close();
	    if(w.equals("AP")){
	        Ap(n,s,d);
	    } else {
	        Gp(n,s,d);
	    }
	}
	
	public static void Ap(int n, int s, int d){
	    for(int i =0; i < n;i++){
	        if(i != n-1){
	          System.out.print(s + ", ");  
	        } else{
	            System.out.print(s);
	        }
	        s += d;
	    }
	}
	
	public static void Gp(int n, int s, int d){
	    for(int i =0; i < n;i++){
	        if(i != n-1){
	          System.out.print(s + ", ");  
	        } else{
	            System.out.print(s);
	        }
	        s *= d;
	    }
	}
}
    
