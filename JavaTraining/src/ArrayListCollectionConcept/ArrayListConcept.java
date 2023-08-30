package ArrayListCollectionConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		 int a[] = new int[3];   //static array  ---  size is fixed
		
		
	// dynamic array -- ArrayList 
		 
		 //1. it can contain duplicate values
		 //2.  it maintains insertion order of index  
		 //3. Not synchronized - not thread safe - slow compared to other collections
		 //4. It allows random access to fetch any element because it stores the values on the basis of indexes
		 
		 
	//	 ArrayList ar = new ArrayList();   //Non generic  array list object
		 ArrayList<Object> ar = new ArrayList<Object>();  
		
		 
		ar.add(10);   //0
		ar.add(20);  //1
		ar.add(20); //2
		
		System.out.println(ar.size());
		 
		ar.add("test");//3
		ar.add(true);//4 
		ar.add(12.33);//5
		ar.add('a');//6
		
		System.out.println(ar);
		
		System.out.println(ar.size());  // size of the arraylist
		
		System.out.println(ar.get(1)); // to get the value from the index
		
		System.out.println("*****");
		
		
		// to print all the values from arraylist : for loop
		
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		System.out.println("*****");
		
		
		//non generic vs generic
		
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();    //generic array list object
		
		ar1.add(100);
	//	ar1.add("Selenium");
		
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("Selenium");
	//	ar2.add(100);
		
		
		ArrayList<E> ar3 = new ArrayList<E>();

	//	ar3.add(100, null);
	//	ar3.add((E) "Selenium");
	//	ar3.add(12.33, null);
		
		
		TestEmployee e1 = new TestEmployee("Abhinav",33,"QA"); 
		TestEmployee e2 = new TestEmployee("Nidhi",32,"Fashion"); 
		TestEmployee e3 = new TestEmployee("Akanksha",30,"Education"); 
		
		
		ArrayList<TestEmployee> ar4 = new ArrayList<TestEmployee>();
		
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//Iterator to iterate the above arraylist elements
		
		 Iterator<TestEmployee> it =  ar4.iterator();
		 while(it.hasNext()) {
			 
			 TestEmployee emp = it.next();
			 System.out.println(emp.name +" "+ emp.age +" "+ emp.dept);
		//	 System.out.println(emp.age);
		//	 System.out.println(emp.dept);
			 
			 
		 }
		
		 System.out.println("*****");
		 
		 
		 //addAll()
	
		 ArrayList<String> ar5 = new ArrayList<String>();
			
			ar5.add("Selenium");
			ar5.add("Test");
			ar5.add("QTP");
			
			 
			 ArrayList<String> ar6 = new ArrayList<String>();
				
				ar6.add("Java");
				ar6.add("Dev");
				ar6.add("JavaScript");
		
		 ar5.addAll(ar6);
		 
		 for(int j=0; j<ar5.size(); j++) {
			 System.out.println(ar5.get(j)) ;
		 }
		
		 System.out.println("*****");
		  
		 
		 //removeAll()
		 
		 ar5.removeAll(ar6);
		 
		 for(int k=0; k<ar5.size(); k++) {
			 System.out.println(ar5.get(k)) ;
		 }
		 
		 System.out.println("*****");

		 
		 //retainAll()
		 
		 ArrayList<String> ar7 = new ArrayList<String>();
			
			ar7.add("Selenium");
			ar7.add("test");
			ar7.add("QTP");
			
			 
			 ArrayList<String> ar8 = new ArrayList<String>();
				
				ar8.add("Java");
				ar8.add("test");
				ar8.add("JavaScript");
		 
		 ar7.retainAll(ar8);
		 
		 for(int j=0; j<ar7.size(); j++) {
			 System.out.println(ar7.get(j)) ;
		 }
		
		 System.out.println("#######");
		
		 
		 ArrayList<String> ar9 = new ArrayList<String>();
			
			ar9.add("Selenium");
			ar9.add("Test");
			ar9.add("QTP");
			ar9.add("TestNG");
			
			 
			 ArrayList<String> ar10 = new ArrayList<String>();
				
				ar10.add("Java");
				ar10.add("Dev");
				ar10.add("JavaScript");
				
				
//				ar9.addAll(1, ar10);
//				
//				System.out.println(ar9);
//				
//				ar9.clear();
//				
//				System.out.println(ar9);
		 
				 System.out.println("-------");	
				
				ArrayList<String> cloneList = (ArrayList<String>)ar9.clone();
				System.out.println(cloneList);
		 
		System.out.println(ar9.contains("Test"));
		System.out.println(ar9.contains("Dev"));
		
		System.out.println(ar9.indexOf("QTP")>0);
		
		
		 ArrayList<String> List1 = new ArrayList<String>(Arrays.asList("Nitesh","Gopal","Khushi","Mannu","Diksha","Gopal")); 
		
		 System.out.println(List1);
		
	//	System.out.println(List1.lastIndexOf("Gopal"));
		
		int g = List1.lastIndexOf("Gopal");
		
		System.out.println(g);
		
		
		List1.remove(1);
		System.out.println(List1);
		
		List1.remove("Khushi");
		System.out.println(List1);
		
		
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		num.removeIf(nu -> nu%2!=0);
		
		System.out.println(num);
		
		
		
		 ArrayList<String> name = new ArrayList<String>(Arrays.asList("Nitesh","Gopal","Khushi","Mannu","Diksha","Gopal")); 
		
		
		name.retainAll(Collections.singleton("Gopal"));
		
		System.out.println(name);
		
		
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
		
		ArrayList<Integer> sublist = new ArrayList<Integer>(number.subList(4, 10));
		
		System.out.println(sublist);
		
		ArrayList<Integer> number1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
		
		Object arr[] = number1.toArray();
		
		System.out.println(Arrays.toString(arr));
		
		for (Object o: arr) {
			System.out.println(o);
		}
		
				
	}

}
