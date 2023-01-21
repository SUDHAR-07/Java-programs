import java.util.*;

public class zoho_mismatched_char {
    public static void main(String[] args) {
		Scanner susan = new Scanner(System.in);
		String a = susan.next();
		String b = susan.next();
		compare(a,b);
        susan.close();
	}
	
	public static void compare(String a, String b){
	    int i = 0,c = 0;
	    for(i =0; i < a.length();i++){
	        if(a.charAt(i) != b.charAt(i)){
	            c++;
	        } else if(a.charAt(i) == b.charAt(i)){
	            print(a,b,i-c,i);
	            c = 0;
	        }
	    }
		print(a,b,i-c,i);
	}
	
	public static void print(String a, String b, int Start,int end){
	    for(int i = Start; i < end;i++){
	        System.out.print(a.charAt(i));
	    }
	    if(Start != end){
	        System.out.print(",");
	    }
	    for(int i = Start; i < end;i++){
	        System.out.print(b.charAt(i));
	    }
	    if(Start != end){
	        System.out.println();
	    }
	}
}


