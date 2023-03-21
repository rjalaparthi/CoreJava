package com.jalaparthi.arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {


		int twoDArrays[][] = {{1,2,3,4,5},{4,5,6,5,4},{7,8,9,20,22}};
		

		for(int row=0; row<twoDArrays.length; row ++) {
			
			for(int col =0; col < twoDArrays[row].length; col++) {
				
				System.out.print(twoDArrays[row][col] + " ");
				
			}
			System.out.println();
		}

	}

}
