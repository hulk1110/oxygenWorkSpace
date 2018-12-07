package arrays;

import java.util.Arrays;

public class SortAnArrayAndInsertAnElement {
	public static void main(String[] args) {
		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		Arrays.sort(array);
		printArray("Sorted array", array);

		int index = Arrays.binarySearch(array, 1);
		System.out.println("Didn't find 1 @ " + index);

		int newIndex = -index - 1;
		array = insertElement(array, 1, newIndex);
		printArray("With 1 added", array);
	}

	private static int[] insertElement(int[] array, int item, int newIndex) {
		// TODO Auto-generated method stub

		int length = array.length;
		int destination[] = new int[length + 1];
		System.arraycopy(array, 0, destination, 0, newIndex);
		destination[newIndex] = item;
		System.arraycopy(array, newIndex, destination, newIndex + 1, length - newIndex);
		return destination;
	}

	private static void printArray(String string, int[] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
