package com.granp;

public class BinarySearchImpl {

	private SortAlgo sortAlgo;

	public BinarySearchImpl(SortAlgo sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
	}
	
	public int binarySearch(int[] number, int findNumber) {
		
		int[] sortedNumbers = sortAlgo.sort(number);
		
		printNumbers(sortedNumbers);
		
		int start = 0;
        int end = sortedNumbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (findNumber == sortedNumbers[mid]) {
                return mid;
            }
            if (findNumber < sortedNumbers[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return -1;
	}
	
	private static void printNumbers(int[] input) {
        
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
}
