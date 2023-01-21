import java.util.*;

public class sentenctetowordarray {
	public static void main(String[] args) {
// 		System.out.println("Hello World");{
        Scanner susan = new Scanner(System.in);
        String a = susan.nextLine();
        susan.close();
        int c = 0,w = 0,i =0;
        String[] d = new String[10];
        for(i = 0; i < a.length();i++){
            if(a.charAt(i) != ' '){
                c++;
            }
            if(a.charAt(i) == ' '){
                g(a,d,i-c,i,w);
                c = 0;
                w++;
            }
        }
        g(a,d,i-c,i,w);
        print(d,w+1);
	}
	public static void print(String[] a,int len){
	    for(int i = 0; i < len;i++){
	        System.out.print(a[i] + " ");
	    }
	}
	public static void g(String a,String[] b,int start, int end,int indexarray){
	    String t = "";
	    for(int i = start; i < end;i++){
	        t += a.charAt(i);
	    }
	    b[indexarray] = t;
	}
}