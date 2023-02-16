import java.util.*;

public class median {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int n = susan.nextInt();
        int[] a = new int[n];
        System.out.println(get(a) / n);
    }    

    public static float get(int[] a){
        float c = 0;
        Scanner susan = new Scanner(System.in);
        for(int i = 0; i < a.length;i++){
            a[i] = susan.nextInt();
            c += a[i];
        }
        return c;
    }
}
