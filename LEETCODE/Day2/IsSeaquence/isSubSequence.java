// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

// Example 1:

// Input: s = "abc", t = "ahbgdc"
// Output: true
// Example 2:

// Input: s = "axc", t = "ahbgdc"
// Output: false
import java.util.*;

class isSubSequence{
    public static void main(String[] args) {
    Scanner susan = new Scanner(System.in);
    String a = susan.next();
    String b = susan.next();
    System.out.println(isSubSeq(a,b));
}
public static boolean isSubseq(String s, String t) {
    if(s.length()==0) 
        return true;
    int ti=0;
    for(int i=0;i<s.length();i++){
       ti=t.indexOf(s.charAt(i),ti);
       if(ti<0) 
        return false;
       ti++;           
    }
    return true;
}
    
}