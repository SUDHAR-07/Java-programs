import java.util.*;

public class binary_sort {
    public static void main(String[] args) {
    Scanner susan = new Scanner(System.in);
    int len = susan.nextInt();
    int[] a = new int[len];
    int n = susan.nextInt();
    susan.close();
    int start = 0, end = 5;
    for(int i = 0; i < 6;i++){
        int middle = (start + end)/ 2;
        if(a[middle] == n){
            System.out.println(middle);
            return;
        } else if(a[middle] < n){
            start = middle + 1;
        } else {
            end = middle - 1;
        }
    }
    System.out.println("can;t find");
}
}

