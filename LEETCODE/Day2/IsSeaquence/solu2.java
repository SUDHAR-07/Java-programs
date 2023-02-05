// package Day2.IsSeaquence;
import java.util.*;
public class solu2 {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        String a = susan.next();
        String b = susan.next();
        System.out.println(isSub(a,b));

    }
    public static boolean isSub(String s, String t) {
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
                if(t.charAt(j)==s.charAt(i))
                     i++;
                j++;
            }
            if(i==s.length()) return true;
            return false;
        }
}
