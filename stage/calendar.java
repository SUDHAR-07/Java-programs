import java.util.*;

public class calendar {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int a = susan.nextInt();
        susan.close();
        int h = 1;
        int[][] b = new int[a][a];
        for(int i =0; i < a; i++){
            for(int  j = 0; j <a;j++){
                b[i][j] = h;
                h++;
            }
        }

        for(int i = 0; i<a;i++){
            for(int j = 0; j <a;j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
