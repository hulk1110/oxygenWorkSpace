package arrays;

import java.util.Arrays;

public class ComparingTwoArrays {
	public static void main(String[] args) {

		int[] ary = { 1, 2, 3, 4, 5, 6 };
		int[] ary1 = { 1, 2, 3, 4, 5, 6 };

		if (Arrays.equals(ary, ary1)) {
			System.out.println("they are equals");
		} else {
			System.out.println("they are not equals");
		}

		System.out.println("in case of multidimentional array");
		int a1[][] = { { 10, 20 }, { 40, 50 }, { 60, 70 } };

		int a2[][] = { { 30, 20 }, { 10, 0 }, { 60, 80 } };

		int a3[][] = { { 10, 20 }, { 40, 50 }, { 60, 70 } };
		
		

		if (Arrays.equals(a1, a2)) {
			System.out.println("they are equals");
		} else {
			System.out.println("they are not equals");
		}
		
		
		if(Arrays.deepEquals(a1, a3)){
			System.out.println("they are equals");
		} else {
			System.out.println("they are not equals");
		}
	}
}