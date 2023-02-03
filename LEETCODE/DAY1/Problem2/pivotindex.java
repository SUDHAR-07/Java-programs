import java.util.Scanner;

import arraybasics.print;

// Input: nums = [1,7,3,6,5,6]
// Output: 3
// Explanation:
// The pivot index is 3.
// Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
// Right sum = nums[4] + nums[5] = 5 + 6 = 11


class pivotIndex {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int n  =susan.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = susan.nextInt();
        }
        System.out.printn(pivotIndex(p));    
    }
    public int pivotIndex(int[] nums) {
        int ans = 0;
        int len = nums.length;

        int[] right = new int[len];
        int currentSum = 0;

        for (int i = len - 1; i >= 0; i--) {
            right[i] = currentSum + nums[i];
            currentSum = right[i];
        }
        // [28,27,20,17,11,6]
        currentSum = 0;
        for (int i = 0; i < len; i++ ) {
            if (right[i] == currentSum + nums[i]) {
                //28 == (0+1)
                //27 == (1+7)
                //20 == (8+3)
                //17 == 17
                return i;
            }
            currentSum += nums[i];
        }

        return -1;
    }
}