package com.onedymentionalarray;

public class ArrayDemo {

	
	public static void main(String[] args) {
		
		//Assigning values to Array
		int[] arr = new int[5];
		// 1 2 3 4 5-->elements
		// 0 1 2 3 4-->index
		
		/*
		 * arr[0]=1; arr[1]=2; arr[2]=3; arr[3]=4; arr[4]=5;
		 */
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i: arr) {
			System.out.println(i);
		}
	}
}
