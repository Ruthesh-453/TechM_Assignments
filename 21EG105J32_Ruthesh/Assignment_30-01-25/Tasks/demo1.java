package org1;

public class demo1 {
	public static void main(String args[]) {
		int arr1[]= {1,2,3,4,5,6,7};
		int newSize = (arr1.length + 1) / 2;
	    int[] destArray = new int[newSize];
		
		for(int i=0,j=0; i<arr1.length;i+=2,j++) {
			System.arraycopy(arr1, i, destArray, j, 1);
		}
		System.out.print("Destination Array: ");
		for(int num:destArray) {
			System.out.print(num + " ");
		}
	}
}
