package com.leetcode.problems;

public class _09_Palindrome_Number {

	public static void main(String[] args) {
		int n =121;
		System.out.println( n + " is a palindrome - " + palindrome(n));

	}

	private static boolean palindrome(int n) {
		int temp = n;
		int sum =0;
		while ( n > 0) {
			int rem = n % 10;
			sum = (sum * 10) + rem;
			n = n / 10;
		}
		return sum == temp;
	}
	
	

}
