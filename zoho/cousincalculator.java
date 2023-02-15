import java.util.*;

public class cousincalculator {
    String family(String[] arr){
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        return arr[0];
    } 
     
    public static void main(String[] args) {
        cousincalculator a = new cousincalculator();
        Scanner susan = new Scanner(System.in);
        // int n = susan.nextInt();
        String[] fam = new String[1];
        for(int i = 0; i < 1;i++){
            fam[i] = susan.nextLine();
            System.out.println(a.family(fam[i].split("")));
        }
    }   

}
