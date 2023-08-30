package ArrayListCollectionConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,3,1,4,5,6,1,7,8,9,10,7,8,7,9,10));
		
		//1. LinkedHashSet
		
		LinkedHashSet<Integer> num = new LinkedHashSet<Integer>(number);
		
		
		ArrayList<Integer> numberListWODup = new ArrayList<Integer>(num);
		
		
		System.out.println(numberListWODup);
		
		System.out.println("&&&&&&&&&&&");
		
		
		//2. JDK 1.8 - stream
		
		
		ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,3,1,4,5,6,1,7,8,9,10,7,8,7,9,10));
		
		
		List<Integer> uniqueMarks = marksList.stream().distinct().collect(Collectors.toList());
		
		System.out.println(uniqueMarks);
		
	}

}
