import java.io.*;
import java.util.*;

public class stringpattern2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner susan = new Scanner(System.in);
        String a = susan.next();
        int b = a.length();
        int h = b / 2;
        int g = 0;
        for(int i = 0; i < b; i ++){
            for(int j= 1; j < b-i;j++){
                    System.out.print(" ");
            }
            for(int j= 0; j <=i; j++){
                if(j + h < b)
                {
                    System.out.print(a.charAt(j + h));
                } else {
                    System.out.print(a.charAt(g));
                    g++;
                }
            }
            g = 0;
            System.out.println();
        }
    }
}