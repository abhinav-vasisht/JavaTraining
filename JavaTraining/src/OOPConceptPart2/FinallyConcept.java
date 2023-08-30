package OOPConceptPart2;

public class FinallyConcept {

	public static void main(String[] args) {
		
		//test1();
		//test2();
		division();
		
		

	}
	
	public static void test1() {
		
		try {
			
			System.out.println("Inside test1 method");
			throw new  RuntimeException("test exception");
			
			
			
		}catch(Exception e){
			 
			System.out.println("inside catch block");
			
			
		}
		
		finally {
			
			System.out.println("Inside finally block");
		}
		
		
	}
	
	
	
	public static void test2() {
		
		
		try {
			System.out.println("inside test2 method");
			
		}
		
		finally {
			
			System.out.println("inside finally code in test2 method");
			
		}
	}
	
	
	public static void division() {
		
		int i = 10;
		
		try {
			
			System.out.println("inside try block");
			int k = i/0;
			
			
		}
		catch(NullPointerException e) {
			System.out.println("Inside Catch Block");
			System.out.println("divide by zero error");
			
		//finally is a block	
		}finally {
			
			System.out.println("execute this code even after exception");
		}
		
		
		
	}
	
	
	
	
	
	
	
	

}
