// package DAY 2;

import java.util.*;

public class String_Elem_Count {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        String p = susan.nextLine();
        int Num = 0 , letter = 0, space = 0, other = 0;
        for(int i = 0; i < p.length(); i++){
            if(isNum(p.charAt(i))){
                Num++;
            } else if(isChar(p.charAt(i))){
                letter++;
            } else if(p.charAt(i) == ' '){
                space++;
            }else{
                other++;
            }
        }
        System.out.println("String is " + p);
        System.out.println("Numbers " + Num);
        System.out.println("LETTERS " + letter);
        System.out.println("space " + space);
        System.out.println("other " + other);
    }
    
    public static boolean isChar(char a){
        int b = (int)a;
        if((b >= 65 && b <= 90) || (b >= 97 && b <= 122)){
            return true;
        }
        return false;
    }
    public static boolean isNum(char a){
        int b = (int)a;
        if(b >= 48 && b <= 57){
            return true;
        }
        return false;
    }
}
