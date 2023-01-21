import java.util.*;

public class zoho_pattern4 {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int n = susan.nextInt();
        susan.close();
        for(int i = 1; i <= n;i++){
            int g = (i % 2 == 1) ? 1 : 2;
            for(int j = 1; j <= n;j++,g=g+2){
                if(i >= j){
                    System.out.print(g + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}