package com.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class _01_TwoSum {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(twoSumUsingArray(nums,6));

	}
	
	public static int[] twoSumUsingArray(int[] nums,int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}
	
	public static int[] twoSumUsingMap(int[] nums,int target) {
		int[] arr = new int[2];
		Map<Integer,Integer> sumMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int temp = target - nums[i];
			
			if(sumMap.containsKey(nums[i])) {
				arr[0] = sumMap.get(nums[i]);
				arr[1] = i;
				break;
			}else {
				sumMap.put(temp, i);
			}
		}
		return arr;
	}

}
