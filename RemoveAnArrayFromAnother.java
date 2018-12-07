package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAnArrayFromAnother {
	public static void main(String[] args) {

		String a[] = { "A", "E", "I" };
		String b[] = { "O", "U" };
		System.out.println("Merging two arrays using List");
		List<String> listOfArray = new ArrayList<>();
		listOfArray.addAll(Arrays.asList(a));
		listOfArray.addAll(Arrays.asList(b));
		System.out.println(Arrays.toString(listOfArray.toArray()));
      // removing array b
		
	}
}
