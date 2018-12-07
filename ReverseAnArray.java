package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseAnArray {
public static void main(String[] args) {
	 int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
     System.out.println("Array before reverse:");
     for (int i = 0; i < numbers.length; i++) {
		System.out.println(numbers[i]);
	}
     
     System.out.println("Array After reverse:");
     for (int i = numbers.length-1; i >=0 ; i--) {
		System.out.println(numbers[i]);
	}
     
     // way 2
     
     List<Integer> integerList= new ArrayList<>();
     for (int i = 0; i < numbers.length; i++) {
    	 integerList.add(numbers[i]);
 	}
     
     Collections.reverse(integerList);
     System.out.println("Array After reverse using array list:");
     for (Integer integer : integerList) {
		System.out.println(integer);
	}
}
}
