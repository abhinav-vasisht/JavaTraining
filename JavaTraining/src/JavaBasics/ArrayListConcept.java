package JavaBasics;

import java.util.ArrayList; 

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar = new ArrayList();
		
	   ar.add(100);
	   ar.add(200);
	   ar.add(true);
	   
	//   System.out.println(ar.size());
		
		ar.add("This");
		ar.add("Tom");
		ar.add(12.33);
		ar.add('a');
		
		ar.add(500);
		System.out.println(ar.size());
		
	 	ar.remove(7);
		
		System.out.println(ar.size());
		
		
	 
		 
		 System.out.println(ar.get(4));
		
		 //to print all the values of arraylist - for loop
		 
		 for(int i=0; i<ar.size(); i++) {
			 
			 System.out.println(ar.get(i) );
		 }
		  
		 
		 
		 ArrayList<Integer> ar1 = new ArrayList<Integer>();
		 
		 ar1.add(150);
		// ar1.add("Hardy"); 
		 

		 ArrayList<String> ar2 = new ArrayList<String>();

			 ar2.add("Hardy");
		//	 ar2.add(12.33);
		 
		
	}

} 
