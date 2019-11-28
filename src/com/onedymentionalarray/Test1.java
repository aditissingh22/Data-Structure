package com.onedymentionalarray;

public class Test1 {

	
	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 4, 5, 2};
		
		for (int i = 0; i < arr.length; i++) {
			int n=1;
			
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					n++;
				}
			}
			
			System.out.println("Occurance of"+arr[i]+"is "+n);
			
		}
	}
}
