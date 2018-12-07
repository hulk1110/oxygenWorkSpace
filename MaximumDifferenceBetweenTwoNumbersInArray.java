package arrays;

import java.util.Scanner;

public class MaximumDifferenceBetweenTwoNumbersInArray {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		int diff = 0, maxDiff = 0, a1 = 0, a2 = 0;
		for (int j = 0; j < n; j++) {
			for (int k = j + 1; k < n; k++) {

				diff = Math.abs(a[j] - a[k]);

				if (diff > maxDiff) {
					maxDiff = diff;
					a1 = j;
					a2 = k;
				}
			}

		}
		System.out.println("Maximum difference is " + maxDiff);
		System.out.println("two elements with largest difference are "+"" + a[a1] + "and" +""+ a[a2]);
	}
}
