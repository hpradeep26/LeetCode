package com.leetcode.problems;

public class _53_MaximumSubArray {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxArray(nums));
    }

    private static int maxArray(int[] nums) {
        int max = nums[0] , curMax = nums[0];
        for (int i = 1; i<nums.length ; i++) {
            curMax = Math.max(nums[i], curMax + nums[i]);
            max = Math.max(max, curMax);
        }
        return max;
    }
}
