package ArrayListCollectionConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayListConcept {

	public static void main(String[] args) {

		
		//1. collection.synchronizedList
		
		List<String> name = Collections.synchronizedList(new ArrayList<String>());
		name.add("Java");
		name.add("Pyhon");
		name.add("Ruby");
		
		// add, remove - we don't need explicit synchronization
		
		// to fetch/traverse the value - we need to use explicit synchronization 
		
		
		 synchronized (name) {
			 
			 Iterator<String> it = name.iterator();
			 
			 while(it.hasNext()) {
				 
				System.out.println(it.next()); 
				
				 
			 }
			 
		 }
		 
		
		 //copyOnWriteArrayList  -- is a class
		 
		 CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		 
		 empList.add("Tom");
		 empList.add("Dick");
		 empList.add("Harry");
		 
		 //we don't need explicit synchronization for any operation - add/remove/traverse
		 
		 
		 Iterator<String> it= empList.iterator();
		 
		 while(it .hasNext()) {
			 
			 System.out.println(it.next());
			 
		 }
		 
		 
		 
		 
		 
		
	}

}
