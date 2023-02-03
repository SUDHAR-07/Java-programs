package DAY1.Problem1;

public class runsum {
    class Solution {
        public int[] runningSum(int[] nums) {
            int[] a = new int[nums.length];
            for(int i = 0; i < nums.length;i++){
                for(int j = 0; j <= i; j++){
                    a[i] += nums[j];
                }
            }
            return a;
        }
    }
}
