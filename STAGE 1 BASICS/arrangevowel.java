import java.io.*;
import java.util.*;

public class arrangevowel {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner susan = new Scanner(System.in);
      String str = susan.nextLine();
      int count = str.length();
    char ch[] = {'a','e','i','o','u'};
    for(int i=0;i<5;i++){
        for(int j=0;j<count;j++){
            if(str.charAt(j) == ch[i])
               System.out.printf("%c",str.charAt(j));
        }
    }
    }
}