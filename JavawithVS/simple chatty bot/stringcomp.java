import java.util.*;

public class stringcomp {
    public static void main(String[] args) {
    Scanner susan = new Scanner(System.in);
    String a = susan.nextLine();
    String b = susan.nextLine();
    susan.close();
    int i = 0,j = 0;
    try {
        for(i = 0;;i++){
            a.charAt(i);
        }
    } catch(Exception e) {
        
    }
    try {
        for(j = 0;;j++){
            b.charAt(j);
        }
    } catch(Exception e) {
        
    }
    int len1 = i;
    int len2 = j;
  //  System.out.println(len1 + " " + len2);
    String n1 = "";
    String n2 = "";
    char t = ' ';
    int w1 = 0, w2 = 0;
    for(int y = 0; y < len1; y++){
        if(a.charAt(y) != t){
            w1++;
            n1 += a.charAt(y);
        }
    }
    for(int y = 0; y < len2; y++){
        if(b.charAt(y) != t){
            w2++;
            n2 += b.charAt(y);
        }
    }
  //  System.out.println(n1 + " " + n2);
 //   System.out.println(w1 + " " + w2);
    if(w1 == w2){
        for(int w = 0; w < w1; w++){
            if(n1.charAt(w) != n2.charAt(w)){
                System.out.println("false");
                return;
            }
        }
    } else if (w1 != w2){
        System.out.println("false");
        return;
    } 
    System.out.println("true");
    }
}
