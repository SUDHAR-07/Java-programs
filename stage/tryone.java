import java.util.*;

class tryome {
    public static void main(String[] args){
        Scanner susan = new Scanner(System.in);
        String a = susan.nextLine();
        for(int i = 0; i < a.length();i++){
            for(int j = 1; j <= a.length(); j++){
                for(int k = j; k < a.length(); k = +j){
                    System.out.print(a.charAt(k));
                }
                System.out.println();
            }
        }
        susan.close();
    }
}