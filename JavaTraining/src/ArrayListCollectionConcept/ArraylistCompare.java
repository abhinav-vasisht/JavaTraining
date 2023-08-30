package ArrayListCollectionConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistCompare {

	public static void main(String[] args) {

		
	// 1. Sorting and then equals 
		
		ArrayList<String> arr1 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		ArrayList<String> arr2 = new ArrayList<String>(Arrays.asList("B","D","C","A","E"));
		
		ArrayList<String> arr3 = new ArrayList<String>(Arrays.asList("B","D","C","A","E"));
		
		
		Collections.sort(arr1);
		Collections.sort(arr2);
		Collections.sort(arr3);
		
		// System.out.println(arr2);
		
		System.out.println(arr1.equals(arr2)); //false
		
		System.out.println(arr2.equals(arr3));  // true
		
		
		
		//2. compare 2 lists and find out the additional element
		
		
        ArrayList<String> arr4 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		ArrayList<String> arr5 = new ArrayList<String>(Arrays.asList("B","D","C","A","E"));
		
		
//		arr4.removeAll(arr5);
//		
//		System.out.println();
		
		
		
		//3. find out the missing elements
		
		
		arr5.removeAll(arr4);
		
		System.out.println(arr5);
		
		
		//4. Find out the common elements
		
		 ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
			
			ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("B","D","C","A","E"));
			
		
		l4.retainAll(l5);
		System.out.println(l4);
		
		
		
		
		
		
	}

}
