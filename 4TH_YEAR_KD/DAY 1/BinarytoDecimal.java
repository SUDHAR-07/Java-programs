import java.util.Scanner;

public class BinarytoDecimal{    
    public static void main(String args[]){     
        Scanner susan = new Scanner(System.in);
        int n = susan.nextInt();
        System.out.println(getDecimal(n));
    }

//     public static int getDecimal(int binary){  
//         int de = 0;  
//         int n = 0;  
//         while(true){  
//           if(binary == 0){  
//             break;  
//           } else {   
//               de += (binary % 10) * Math.pow(2, n);  
//               binary = binary/10;  
//               n++;  
//            }  
//         }  
//         return de;  
//     }  
// }    

// kd

// import java.util.*;
// public class BinarytoDecimal
// {
// 	public static int Decimal(int binary)
// 	{
		
// 		int decimal = 0;
// 		int base = 1;  
		
// 		while(binary > 0)
// 		{
// 			decimal += (binary%10);  
// 			binary = binary/10;  
// 			base *= 2;  
// 		}
// 		return decimal; 
// 	}
// 	public static void main(String args[]){
// 	    Scanner in = new Scanner(System.in);    
// 		int binary = in.nextInt();
// 		System.out.println(Decimal(binary));   
// 	}
// }



public static int getDecimal(int n)
{
    int num = n;
    int dec_value = 0;

    // Initializing base
    // value to 1, i.e 2^0
    int base = 1;

    int temp = num;
    while (temp > 0) {
        int last_digit = temp % 10;
        temp = temp / 10;

        dec_value += last_digit * base;

        base = base * 2;
    }

    return dec_value;
}
}