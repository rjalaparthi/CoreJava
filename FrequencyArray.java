package com.jalaparthi.arrays;

import java.util.Arrays;

public class FrequencyArray {

	public static void main(String[] args) {
		int[] arr = {10,20,20,30,10,30,40};
		int leng = arr.length;
		elementCount(arr ,leng);
	}

	private static void elementCount(int[] arr, int leng) {
		
		boolean[] val= new boolean[leng];
		
		Arrays.fill(val, false);
		
		for(int i=0;i<arr.length;i++) {
			if(val[i]== true) {
				continue;
			}
			
			int count = 1;
			
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					val[j]=true;
					count++;
				}
				
			}
			
			System.out.println(" "  +arr[i] +" Occured " +count + " times ");
		}
		
		
	}

}
