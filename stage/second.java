import java.util.*;

public class second {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int n = susan.nextInt();
        susan.close();
        for(int i = 0; i <n;i++){
            for(int j = 0; j <n;j++){
                if(i + j < n){
                    System.out.print(i + j + 1 + " ");
                } else if (i + j >= n){
                    System.out.print((j + i - n + 1)+ " ");
                }
            }
            System.out.println();
        }
    }
}
