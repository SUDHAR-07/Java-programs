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

public static void permute(String str,int Start, int end) 
    { 
        if (Start == end) 
            System.out.println(str); 
        else
        { 
            for (int i = Start; i <= end; i++) 
            { 
                str = swap(str,Start,i); // 
                // System.out.println(str);
                permute(str, Start+1, end); 
                str = swap(str,Start,i); 
            } 
        } 
    } 

public static String swap(String a,int i, int j) 
    { 
        // System.out.print("  i  " + i + "   j  " + j + "  ");
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; // AD    = A   // 1 , 1
        charArray[i] = charArray[j]; // = A
        charArray[j] = temp; // = A
        return String.valueOf(charArray); 
    } 
} 

