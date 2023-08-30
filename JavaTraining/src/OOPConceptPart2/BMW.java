package OOPConceptPart2;

public class BMW extends Car{   //has-a relationship 
	
	//method overriding - when same method with same name and no of arguments is present in parent as well as child class
	public void start() {      //overridden method 
		
		System.out.println("BMW-----start method");
	}
	
	
	public void theftSafety() {
		
		
		System.out.println("BMW-----theftsafety method ");
		
	}
	 

}
