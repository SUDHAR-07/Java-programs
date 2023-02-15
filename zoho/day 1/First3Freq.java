import java.util.*;
// 6. Given an array of integers ( positive as well as negative ), find the 3 numbers which have high
// frequency( which occur the most number of times ).
// Input:
// 10
// 4 4 2 2 2 2 1 3 3 3
// Output:
// 2 3 4

public class First3Freq {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int n = susan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n;i++){
            a[i] = susan.nextInt();
        }
        sort(a);
        // print(a);
        FREQUENCY(a);
        // System.out.print(f);
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
        System.out.println();
    }

    public static void FREQUENCY(int[] a){
        int c = 0;
        int[] f = new int[a.length];
        int[] v = new int[a.length];
        for(int i = 0; i < a.length;i=i+c){
            c = 0;
            for(int j = i;j < a.length;j++){
                if(a[i] == a[j]){
                    c++;
                }
            }
            f[i] = c;
            v[i] = a[i]; 
        }
        comp(f,v);
        print(f);
        print(v);
        int n = v.length;
        for(int i = 0; i <3 ;i++){
            System.out.print(v[i]);
        }
    }

    public static int[] comp(int[] a,int[] b){
        for(int i = 0; i < a.length;i++){
            for(int j = i; j < a.length;j++){
                if(a[i] < a[j]){
                    swap(a,i,j);
                    swap(b, i, j);
                }
            }
        }
        return a;
    }
}

