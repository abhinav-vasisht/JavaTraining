package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {

		
		Hashtable h = new Hashtable();
		
		h.put("A","Hello");
		h.put('B', "World");
		h.put(100, 100.33);
		h.put(true, 'a');
		 
		
		System.out.println(h.size());
		
		System.out.println(h.get(100));
		
		
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		h1.put(1, 100);
		 
		
		Hashtable<Integer,String> h2 = new Hashtable<Integer,String>();
		
		
		h2.put(1, "Test"); 
		
		
		
		
		
		
		
		
		
	}

}
