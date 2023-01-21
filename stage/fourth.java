import java.util.*;

public class fourth {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int len = susan.nextInt();
        int[] a = new int[len];
        for(int j = 0; j < len;j++){
            a[j] = susan.nextInt();
        }
        susan.close();
        int MAX = 100000,h = MAX;
        for(int i = 0; i < len; i++){
            int y = a[i];
            h = MAX;
            for(int k = i; k < len; k++){
                if(a[k] > y && a[k] < h){
                    h = a[k];
                }
            }
            a[i] = h != MAX ? h : -1;
        }
        for(int g = 0; g < len;g++){
            System.out.print(a[g] + " ");
        }
    }
}

