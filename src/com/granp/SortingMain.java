package com.granp;

public class SortingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchImpl bsi = new BinarySearchImpl(new SelectionSortAlgo());
		int[] number = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		int findNumber = 0;
		
		int key = bsi.binarySearch(number, findNumber);
		
		System.out.println(key);
	}

}
