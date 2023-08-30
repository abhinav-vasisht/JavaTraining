package OOPConceptPart1;

public class LocalVsGlobalVariables {
	
	//Global variables  -- class variables
	String name = "Tom";
	int age = 33; 
	

	public static void main(String[] args) {
	
		
		int i =10;  // local variable for main method  
		
		System.out.println(i);
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		obj.sum(); 
		

	}
	
	public void sum() {
		
		int i = 15;  // local variable for sum method 
		 int j = 20;
		int age = 35;
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(age);
	}
	
	
	//all non static variables and methods copy is given to the new object created 

}
