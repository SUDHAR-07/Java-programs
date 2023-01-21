import java.util.Scanner;

// package DAY 2;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int a = susan.nextInt();
        DecimalToBinary(a);
        DecimalToBinary2(a);
        reverse(DecimalToBinary3(a));
    }

    public static void DecimalToBinary(int a){
        int[] binaryNum = new int[32];
        int i = 0;
        while(a > 0){
            binaryNum[i] = a % 2;
            a /= 2;
            i++;
        }

        for(int j = i-1;j>=0;j--){
            System.out.print(binaryNum[j]);
        }
        System.out.println();
    }

    public static void DecimalToBinary2(int n){
        for (int i = 31; i >= 0; i--) {
            int k = n >> i;
            if ((k & 1) > 0)
                System.out.print("1");
            else
                System.out.print("0");
        }
        System.out.println();
    }

    public static String DecimalToBinary3(int num)
    {
      String str = "";
      while (num > 0) {
        if ((num & 1) == 1) // 1
          str += '1';
        else // 0
          str += '0';
        num >>= 1; // Right Shift by 1
      }
      return str;
    }
   
    // reverse the string
    public static void reverse(String str)
    {
      for (int i = str.length() - 1; i >= 0; i--)
        System.out.print(str.charAt(i));
    }
}
