import java.util.*;

public class zoho_pattern2 {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int n = susan.nextInt();
        susan.close();
        for(int i = 1; i <= n;i++){
            for(int j = i; j <= n;j++){
                if(i <= j){
                    System.out.print(j + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        }
}