import java.io.*;
import java.util.*;

public class largest_word {

    public static void main(String[] args) {
    
 Scanner susan = new Scanner(System.in);
      String a = susan.nextLine();
      int len = get(a);
      int start = 0,end = 0,total = 0,i = 0, j =0;

        for(j = 0; j < len; j++){
            if(a.charAt(j) != ' '){
                total++;
            }
            else{
                if(total > end){
                    end = total;
                    start = j-end;
                }
                total = 0;
            }
        }
        if(total > end){
            end = total;
            start = len - end;
        }
        
    // System.out.println("i" + i + "j" + j + "total" + total + "start" + start + "end" + end);
    for(int k = start;k < end + start; k++){
        System.out.print(a.charAt(k));
    }
    System.out.println("\n" + end);
}
  public static int get(String a){
    int i = 0;
    try{
      for(i = 0;;i++){
        a.charAt(i);
      }
    }catch (Exception e){
      return i;
    }
 }
}