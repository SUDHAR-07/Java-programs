import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner susan = new Scanner(System.in);
        int n = susan.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i + j == n-1){
                    System.out.print("*");
                }else{
                     System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
