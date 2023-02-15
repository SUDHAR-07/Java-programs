import java.util.*;

public class FREQUENCY {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int n = susan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n;i++){
            a[i] = susan.nextInt();
        }
        sort(a);
        print(a);
        int f = FREQUENCY(a);
        System.out.print(f);
    }

    public static int[] sort(int[] a){
        for(int i = 0; i < a.length;i++){
            for(int j = i; j < a.length;j++){
                if(a[i] > a[j]){
                    swap(a,i,j);
                }
            }
        }
        return a;
    }

    public static int[] swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
        return a;
    }

    public static void print(int[] a){
        for(int i = 0; i < a.length;i++){
            System.out.print(a[i] + " ");
        }
    }

    public static int FREQUENCY(int[] a){
        int c = 0,m = 0,v = 0;
        int[] d = new int[3];
        for(int i = 0; i < a.length;i = i + c){
            c = 0;
            for(int j = i;j < a.length;j++){
                if(a[i] == a[j]){
                    c++;
                }
            }
            if(c > m){
                m = c;
                v= a[i];
            }
        }
        return v;
    }
}
