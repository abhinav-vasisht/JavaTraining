package OOPConceptPart1;

public class FunctionsInJava {
 
	
	
	//main method --> starting point of execution
	public static void main(String[] args) {
		//function and method both are same thing
		
		
		FunctionsInJava  obj = new FunctionsInJava();
		//1 object is created, obj is the object reference variable of this object referring to this object  
		//after creating the object, copy of all non static objects will be given to this object and to the reference variable of the same object
		//non static methods 
		
		obj.test(); 
		int l = obj.pqr();
		System.out.println(l);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int d1 = obj.division(30, 5);
		System.out.println(d1);
		
		//main method is void -- it never returns a value
	}
	
	//return type - void -- which means nothing to return
	public void  test(){ //no input and no output
		
		System.out.println("test method");
	}
	
	
	
	// return type -->  int
	public int pqr() { //no input and some output
		
		System.out.println("pqr method");
		int a =10;
		int b= 20;
		int c= a+b;
		 
		return c;  
	}
	
	// return type --> String
	public String  qa() { //no input and some output
		
		System.out.println("qa method");
		String s = "Selenium";
		
		return s;
		
		}
	
	
	//return type --> int
	// x,y --> input parameters/arguments
	
	public int  division(int x,int y) {
		System.out.println("division method ");
		 
		int d = x/y;
		
		return d;
		
		
		
	}
	
	
	
	
	
	
	
	
	 

}
