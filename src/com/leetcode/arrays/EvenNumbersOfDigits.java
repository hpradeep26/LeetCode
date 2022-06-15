package com.leetcode.arrays;

public class EvenNumbersOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {12,345,2,6,7896};
		//output = 2 12 and 7896 are only even number digits
		System.out.println(findNumbers(nums));

	}
	
	 public static int findNumbersUsingStringLength(int[] nums) {
		 int count =0;
	        for (int i : nums) {
				int length = String.valueOf(i).length();
				if (length % 2 ==0 ) 
					count++;
			}
	        return count;
	    }
	 	
	 public static int findNumbers(int[] nums) {
		 int count =0;
	        for (int i : nums) {
				int length = 0;
				while (i> 0) {
					i = i/10;
					length++;
				}
				if (length % 2 ==0 ) 
					count++;
			}
	        return count;
	    }

}
