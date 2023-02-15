import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        String a = susan.next();
        int n = getLen(a);
        permute(a,0,n-1);
    }

    public static int getLen(String a){
        int i = 0;
        try{
            while(true){
                a.charAt(i);
                i++;
            }
        }catch(Exception e){
            return i;
        }
    }

    public static void permute(String str,int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    } 
  
    /* Swap Characters at position 
       @param a string value @param 
       i position 1 @param j position 2 
       @return swapped string */
    public static String swap(String a, 
                       int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
} 

