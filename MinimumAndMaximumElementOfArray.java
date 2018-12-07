package arrays;

import java.util.Arrays;
import java.util.Collections;

public class MinimumAndMaximumElementOfArray {

	public static void main(String[] args) {
		Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
		
		System.out.println("max is"+ Collections.max(Arrays.asList(numbers)));
		System.out.println("min is"+ Collections.min(Arrays.asList(numbers)));
	}
}
