import java.util.*;

public class ZOHOPATTERN {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        String str = susan.nextLine();
        int n = getLength(str);
        susan.close();
        for(int i = 0; i < n; i++){
            if((n % 2) == 0 && i == n/2){
                    continue;
                }
            for(int j = 0; j < n; j++){
                if(i == j || i + j == n -1){
                    System.out.print(str.charAt(j) + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static int getLength(String str){
        int count = 0;
        try{
            while(true){
                str.charAt(count++);
            }
        }catch(Exception e){
            return count - 1;
        }
    }
}
// 		System.out.println("Hello World");
        // Scanner susan = new Scanner(System.in);
        // String a = susan.next();
        // susan.close();
        // int len = a.length();
        // for(int i = 0; i <= len/2;i++){
        //     for(int j = 0; j < len/2;j++){
        //         if(i == j){
        //             System.out.print(a.charAt(i)+" ");
        //         }else {
        //             System.out.print("  ");
        //         }
        //     }
        //     for(int k = len/2;k < len;k++){
        //         if(i + k == len-1){
        //             System.out.print(a.charAt(k) + " ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // for(int i = len/2+1; i < len;i++){
        //     for(int y = 0; y < len/2;y++){
        //         if(i + y == len -1){
        //             System.out.print(a.charAt(y) + " ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     for(int z = len/2; z < len;z++){
        //         if(i == z){
        //             System.out.print(a.charAt(z) + " ");
        //         } else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // System.out.println("heyy");
// 	}
// }

