import java.io.*;
import java.util.*;

public class kvalue {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner susan = new Scanner(System.in);
    int a = susan.nextInt();
    int[] b = new int[a]; 
    for(int i = 0; i <a;i++){
        b[i] = susan.nextInt();
    }
    int y = 0;
    int k = 0;
    for(int i = 0; i < a-1; i++){
        if(b[i] > b[i+1]){
            y = y+1;
        } 
        if(b[i] < b[i+1]){
          break;
        }
    }
    System.out.println(y+1);  
    k = a % (y+1);
    if(k == 0){
        System.out.println("No Remaining Elements");
    } else {
        k = a - k;
        for(int i = k; i < a; i++){
            System.out.print(b[i] + " ");
        }
      }
    }
}