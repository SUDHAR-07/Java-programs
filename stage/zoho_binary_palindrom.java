import java.util.*;

public class zoho_binary_palindrom { 
	public static void main(String[] args) {
		Scanner susan = new Scanner(System.in);
		int n = susan.nextInt();
        susan.close();
		int s = 0;
		while(n != 0){
		    s = s * 10 + (n % 2);
		    n = n / 2;
		}
		if(n % 2 == 0){
		    s = s*10 + 0;
		}
		int b = s;
		int t = 0;
		while(s != 0){
		    t = t * 10 + (s % 10);
		    s = s / 10;
		}
		if(b == t){
		    System.out.println(b + "- Palindrome");
		} else {
		    System.out.println(b + "- Not a Palindrome");
		}
	}
}

