package com.leetcode.arrays;

public class DVD_Main {

	public static void main(String[] args) {
		//Creating array
		DVD[] collectionDvd = new DVD[15];
		
		//Inserting into Array
		DVD d1=new DVD("KGF2",2022,"Neel");
		DVD d2=new DVD("RRR",2022,"RRR");
		collectionDvd[0] = d1;
		collectionDvd[1] = d2;
		
		//accessing element of array
		System.out.println(collectionDvd[0]);
		System.out.println(collectionDvd[1]);
	}

}
