 package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {

		
		//array: to store similar data type values in a array variable 
		
		//1. int array
		
		//lowest bound/index is 0
		//highest bound/index is n-1 if array size is n i.e. a[n]
		//one dimensional array - 1-dim array
		//disadvantages of static array
		//1. size is fixed of static array  -- To overcome this problem we use "Collections" (Dynamic Arrays) like -> ArrayList,LinkedList, HashTable, HashSet,LinkedHashset,HashMap,Linked Hashmap,TreeMap,   etc.
		//2. stores only similar data types -- To overcome this problem we use "Object array"
		
		
		
		
		
		 int i[] = new int[4]; 
		
		i[0]=10; 
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		  System.out.println(i[2]);
		  System.out.println(i[3]);
		  
	//	  System.out.println(i[4]);   //ArrayIndexOutOfBoundsException
		
		
		  System.out.println(i.length );    //size of array
		  
		  
		  //print all the values of the array: always have to use loop 
		  
		  for(int  j=0;j<i.length;j++) {
			  
			  System.out.println(i[j]);
			  
		  }
		  
		  
		  
		  
		  
		 //2. double array
		  
		  
		  
		  double d[]= new double[3];
		  
		  d[0]=12.33;
		  d[1]=13.44;
			d[2]=45.55;	  
			
			
			System.out.println(d[2 ]);
			
			
		//3. char array	
			
			
			char c[]= new char[3];
			
			
			
			c[0]='a';
			 c[1]='2';
			 c[2]='$';
			 
			 
			 System.out.println(c[2]);
			
			
		    
		   
		  //4. boolean array
			 
			 boolean b[]= new boolean[2];
			 
			 b[0]= true;
			 b[1]= false;
			 
			 
			 System.out.println(b[0]);
			 
			 
			 
			 //5. String array
			 
			 String s[]=new String[3];
			 
			 s[0]="Hello";
			 s[1]= "10000";
			 s[2]= "World$$$";
			 
			 System.out.println(s[2]);
			 System.out.println(s.length);
			 
			 
		 
	// 6. Object Array -> Object is a class(O is capital) -- object array is used to store different data type values
			 
			  Object ob[]= new Object[6];
			  
			  ob[0]= "Tom";
			  ob[1]= 25;
			  ob[2] = 12.33;
			  ob[3]= "1/1/1990";
			  ob[4]= 'M';
			  ob[5]= "London ";
			  
			  
		
			  System.out.println(ob[5]);
			  System.out.println(ob.length);
		  
		  
					  
			  for(int  z=0;z<ob.length;z++) {
				  
				  System.out.println(ob[z]);
				  
			  }		  
					  
					  
		  
		  
		  
	}

}
