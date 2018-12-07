package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArrays {
	public static void main(String[] args) {
		String a[] = { "A", "E", "I" };
		String b[] = { "O", "U" };
		String[] c = new String[a.length + b.length];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
			count++;
		}
		System.out.println("After first array c has");
		print(c);

		for (int j = 0; j < b.length; j++) {
			c[count++] = b[j];
		}
		System.out.println("After second array c has");
		print(c);

		System.out.println("lets remove b array");
		
		
		// way2
		System.out.println("Merging two arrays using List");
		List<String> listOfArray = new ArrayList<>();
		listOfArray.addAll(Arrays.asList(a));
		listOfArray.addAll(Arrays.asList(a));
		System.out.println(Arrays.toString(listOfArray.toArray()));

	}

	private static void print(String[] c) {
		// TODO Auto-generated method stub
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
