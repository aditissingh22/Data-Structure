package com.onedymentionalarray;

import java.util.Random;

public class RandomArray {

	public static void main(String[] args) {

		int[] arr = new int[50];

		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
		}
		
		
		try {
		System.out.println(arr[60]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Maximum index is 49.");
		}

		//Advance for loop
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
