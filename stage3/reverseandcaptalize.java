import java.io.*;
import java.util.*;

public class reverseandcaptalize {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner susan = new Scanner(System.in);
        String a = susan.nextLine();
        String[] b = a.split(" ");
        int o = 0;
        char[] end = a.toCharArray();
        for(int i = 0; i < b.length; i++) {
            if(i % 2 != 0){
                String g = b[i].toUpperCase();
                System.out.print(g + " ");
            } else if (i % 2 == 0){
                String j = b[i].toLowerCase();
                String[] k = j.split("[\\s?!.,]+");
                StringBuffer h = new StringBuffer(k[0]);
                h.reverse();
                if(i == b.length-1) {
                    System.out.print(h);
                    o++;
                } else {
                    System.out.print(h + " ");
                }
            }
        }
        if(o != 0){
            System.out.print(end[end.length-1]);
        }
    }
}