import java.io.*;
import java.util.*;

public class delete_consective_ele {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner susan = new Scanner(System.in);
        int a = susan.nextInt();
        int[] b = new int[a];
        for(int i = 0; i< a;i++){
            b[i] = susan.nextInt();
        }
      int g = 0;
      int start = 0, end = 0, count = 0, c = 0, m =0;
      for(int y = 0; y< a*a; y++) {
          start = 0;
          end = 0;
          count = 0;
          m = 0;
          c = 0;
          for(int i = 0; i < a; i++){
            for(int r = i+1; r < a;r++){
                if(b[i] == b[r]){
                    m++;
                    count ++;
                    start = i;
                    end = r;
                }
                if(b[i] != b[r]){
                    break;
                }
            }
            if(m != 0){
                count = count + 1;
                break;
            }
        }
        // System.out.println("start" + start + "end" + end + "count" + count);
            for(int j = start; j < a; j++){
                if(j + count < a){
                    c++;   
                    b[j] = b[j + count];
                }   
            }
                a = a - count;
                // a = a - c;
                // System.out.println("count" + count + "c" + c + "a" + a);
            // for(int t =0; t < a; t++){
            //     System.out.print(b[t] + " ");
            // }
            if (a == 1 || count == 0){
                    g++;
                    // System.out.println("end");
                    for(int t =0; t < a; t++){
                        System.out.print(b[t] + " ");
                    }
                    break;
                }
      }
            if(g == 0){
        System.out.println("No Elements");
      }
      
  }
}


