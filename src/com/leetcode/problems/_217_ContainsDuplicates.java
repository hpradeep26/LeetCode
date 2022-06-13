package com.leetcode.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _217_ContainsDuplicates {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(containDuplicatesUsingMap(nums));
	}
	
	public static boolean containDuplicatesUsingMap(int[] nums) {
		Map<Integer,Integer> countMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(countMap.containsKey(nums[i])){
				return true;
			}else {
				countMap.put(nums[i], 1);
			}
		}
		
		return false;
	}
	
	public static boolean containDuplicateUsingSet(int[] nums) {
		Set<Integer> numSet = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			numSet.add(nums[i]);
		}
		return numSet.size() == nums.length;
	}
}
