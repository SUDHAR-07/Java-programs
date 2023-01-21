import java.io.*;
import java.util.*;

public class stringpattern {

    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        String a = susan.next();
        int count = 0;
        int h = a.length();
        for(int i  = 0; i < h; i++) {
            for(int j = 0; j < h; j++) {
                if(i == h/2 && h % 2 == 0) {
                    break;
                }
                else if(i == j){
                    System.out.print(a.charAt(i));
                } else if(i + j == h-1) { 
                    System.out.print(a.charAt(h-i-1));
                } else {
                    System.out.print(" ");
                }
            }
            if((h % 2 != 0)||(h % 2 == 0 && i != h/2)){
                System.out.println();
            }
        }
    }
}

