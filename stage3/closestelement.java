import java.io.*;
import java.util.*;

public class closestelement {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
    int a = susan.nextInt();
    int[] b = new int[a]; 
    int sum = 0;
    for(int i = 0; i <a;i++){
        b[i] = susan.nextInt();
        sum += b[i]; 
    }
    int y = sum / a;
        int count = 0;
        int index = 0;
    Arrays.sort(b);
    for(int i=0; i < a; i++){
        if(b[i] == y){
            System.out.println(b[i]);
            count++;
            break;
        }
    }
    if(count == 0){
        b[0] = y;
        Arrays.sort(b);
        for(int i=0; i < a; i++){
        if(b[i] == y){
            index = i;
            }
        }
        if(b[index] - b[index -1] > b[index + 1] - b[index]){
            System.out.println(b[index+1]);
        } else if(b[index] - b[index -1] <= b[index + 1] - b[index]) {
            System.out.println(b[index-1]);
        }
    }
    
    
    }
}