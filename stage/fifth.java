import java.util.*;

public class fifth {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int len = susan.nextInt();
        susan.close();
        String[] h = new String[len];
        for(int i = 0; i < len;i++){
            h[i] = susan.next();
        }
        // System.out.print();
        // for(int d = 0; d < len; d++){
        for(int k = 0; k < len;k++){
            int l = 0;
            int r = h[k].length();
            for(int y = 0; y < r; y++){
                // System.out.print();
                l +=(int)h[k].charAt(y);
            }
            System.out.print(l + " ");
        }
        // }
    }
}

