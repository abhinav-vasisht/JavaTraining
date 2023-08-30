 package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(5);
		obj.sum(2, 4);
			
		
		
	}
	
	public static void main(int p) {
		  
	}
	
	
	public static void main(double p) {
		  
	}
	
	//we can overload main method also 
	
	//One can't create a method inside another method
	
	//Duplicate methods i.e.  same method name with same no. of arguments are not allowed
	
	//Method Overloading --> when method name is same with different arguments and different data types  or input parameters within same class
	
	public void sum() {     // 0 input parameter
		
		System.out.println("SUM Method -- 0 input");
		
	 
	}
	
	
	public void sum(int i ) {    // 1 input parameter  
		
		System.out.println("sum method -- 1 input ");
		System.out.println(i);
		
	}
	
	public void sum(int j, int k )     //2 input params
	{
		
		System.out.println("Sum method -- 2 input");
		System.out.println(j+k);
		
	}

}
