import java.util.*;

public class check {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int n = susan.nextInt();
        susan.close();
        for(int i = 0; i <n;i++){
            for(int j = 0; j <n;j++){
                if(i + j >= n-1){
                    System.out.print(n- j + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
