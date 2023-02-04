import java.util.*;

public class ISOMORPHOIC{
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        String a = susan.next();
        String b = susan.next();
        System.out.println(isISO(a,b));
    }
    public static boolean isISO(String a , String b){
        char arr[] = new char[257];
        boolean cas[] = new boolean[257];
        char c1[] = a.toCharArray();
        char c2[] = b.toCharArray();
        for(int i = 0; i < c1.length;i++){
            if(arr[c1[i]] == 0 && cas[c2[i]] == false){
                arr[c1[i]] = c2[i];
                cas[c2[i]] = false;
            }else if(arr[c1[i]] != c2[i]){
                return false;
            }
        }
        return true;
    }
}

// Input: s = "egg", t = "add"
// Output: true
// Example 2:

// Input: s = "foo", t = "bar"
// Output: false
// Example 3:

// Input: s = "paper", t = "title"
// Output: true

// Given two strings s and t, determine if they are isomorphic.

// Two strings s and t are isomorphic if the characters in s can be replaced to get t.

// All occurrences of a character must be replaced with another character 
// while preserving the order of characters. No two characters may map to 
// the same character, but a character may map to itself.
