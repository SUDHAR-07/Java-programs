import java.util.*;

class Try {
    public static void main(String[] args){
        Scanner susan = new Scanner(System.in);
        String a = susan.nextLine();
        for(int i = 0; i < a.length();i++){
            for(int j = 1; j <= a.length(); j++){
                int start = 0;
                int end = 0;
                for(int k = start; k <= end; k = +j){
                    System.out.print(a.charAt(j));
                }
                System.out.println();
            }
        }
        susan.close();
    }
}