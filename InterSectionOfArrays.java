package arrays;

public class InterSectionOfArrays {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 4, 5, 6 };
		int arr2[] = { 2, 3, 5, 7 };
		int m = arr1.length;
		int n = arr2.length;
		printIntersection(arr1, arr2, m, n);
	}

	private static void printIntersection(int[] arr1, int[] arr2, int m, int n) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;

		while (i < m) {
			if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				System.out.println(arr1[i] + "");
				j++;
			}
		}

	}
}
