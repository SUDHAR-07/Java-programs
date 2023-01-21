import java.util.*;

public class zoho_pattern3 {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int n = susan.nextInt();
        susan.close();
        for(int i = 1; i <= n;i++){
            for(int j = 1; j <= n;j++){
                if(i >= j){
                    System.out.print(i + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        }
}