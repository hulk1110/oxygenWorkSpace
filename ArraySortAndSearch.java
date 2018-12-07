package arrays;

import java.util.Arrays;

public class ArraySortAndSearch {
	public static void main(String[] args) {
		// way1

		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		Arrays.sort(array);
		System.out.println("sorted array is");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		int index = Arrays.binarySearch(array,6);
		
		System.out.println("found at"+ index);
	}
}
