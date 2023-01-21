// package DAY 2;

import java.util.*;

public class SQRT_without_INBUILT {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int g = susan.nextInt();
        System.out.println("the Square root is :" + SQrt(g));
        System.out.println("the floor square root is :" + Floor_Sqrt(0,g,g));
        System.out.println("The SQRT using NEWTON method : " + newton(g));
    }

    public static double SQrt(double a){
        for(int j = 1;;j++){
            if(j * j == a){
                return j;
            }else if(j * j > a){
                double res = square(a,j-1,j);
                return res;
            }
        }
    }

    public static double square(double n, double start, double end){
        double mid = (start + end)/2;
        double mul = start * end;
        
        if((mul == n) || (Math.abs(mul - n) < 0.00001)){
            return mid;
        }else if(mul < n){
            return square(n, mid, end);
        }else{
            return square(n,start ,mid);
        }
    }

    
    public static double Floor_Sqrt(int start, int end, int n){
        
        if(start <= end){
            int mid = (int)(start + end)/2;
            // System.out.println("MId IS " + mid);
            if((mid* mid <= n) && ((mid + 1) * (mid + 1) > n)){
                return mid;
            }
            else if(mid * mid < n){
                return Floor_Sqrt(mid+1, end,n);
            }else{
                return Floor_Sqrt(start,mid-1,n);
            }
        }
        return start;
    }
    // formula  sqrtn+1=(sqrtn+(num/sqrtn))/2.0
    public static double newton(int n){
        double t;
        double sqrt = n /2;
        do{
            t = sqrt;
            sqrt = (t + (n /t))/2;
            // System.out.println("t " + t + " Sqrt " + sqrt);
        }
        while((t - sqrt)!= 0);
        return sqrt;
    }
}



// public int search(int[] nums, int target) {
//     int r = nums.length - 1;
//     int start = 0;
//     while(stAR <= r){
//         int m = l + (r - l)/2;
//         if(nums[m]==target){
//             return m;
//         }
//         else if(nums[m]>target){
//             r = m - 1;
//         }else{
//             l = m + 1;
//         }
//     }
//     return -1;
// }