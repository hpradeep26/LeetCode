package com.leetcode.arrays;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] arr = {1,0,1,1,0,1};
		System.out.println(maxConsecutiveOnes(arr));
	}
	
	public static int maxConsecutiveOnes(int[] nums) {
		int count = 0,max =0;
		
		for (int i = 0; i < nums.length; i++) {
				if(nums[i]==1) {
					count++;
				}else {
					count = 0;
				}
					
				if (count>max) {
					max = count;
				}
		}
		return max;
	}

}
