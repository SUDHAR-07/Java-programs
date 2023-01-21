import java.util.*;

public class zoho_pattern5 {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int n = susan.nextInt();
        susan.close();
        for(int i = n; i >= 0;i--){
            for(int j = 0; j < n;j++){
                if(i < j){
                    System.out.print(j + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}