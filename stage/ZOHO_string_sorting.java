import java.util.*;

public class ZOHO_string_sorting {
    public static void main(String[] args) {
    Scanner susan = new Scanner(System.in);
    String a = susan.nextLine();
    String[] b = new String[100];
    int len = wordarray(b,a);
    // printarray(b,len);
    sortarray(b,len);
    printarray(b,len);
    susan.close();
    }

    public static void sortarray(String[] a, int n){
        for(int i = 0; i < n-1;i++){
            for(int j = i+1; j < n;j++){
                if(isGreat(a[i],a[j])){
                    swap(a,i,j);
                }
            }
        }
    }

    public static boolean isGreat(String a, String b){
        if(a.length() > b.length()){
            return true;
        }
        if(b.length() > a.length()){
            return false;
        }
        for(int i = 0; i < a.length();i++){
            if(a.charAt(i) > b.charAt(i)){
                return true;
            } else if(a.charAt(i) < b.charAt(i)){
                return false;
            }
        }
        return false;
    }
    public static void swap(String[] a,int i,int j){
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }
    public static void printarray(String[] arr, int len){
        for(int i = 0; i < len;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int wordarray(String[] b,String a){
        int i = 0,c = 0,w = 0;
        for(i = 0; i < a.length();i++){
            if(a.charAt(i) != ' '){
                c++;
            }
            if(a.charAt(i) == ' '){
                storearray(a,b,i-c,i,w);
                c = 0;
                w++;
            }
        }
        storearray(a,b,i-c,i,w);

        return w+1;
    }

    public static void storearray(String a, String[] arr,int start,int end,int word){
        String t = "";
        for(int i = start; i <end;i++){
            t += a.charAt(i);
        }
        arr[word] = t;
    }
}
