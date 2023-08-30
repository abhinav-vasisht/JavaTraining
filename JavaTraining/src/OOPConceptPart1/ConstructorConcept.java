package OOPConceptPart1;

public class ConstructorConcept {
	
	
	
	public ConstructorConcept() {
		System.out.println("Default constructor");
	}
	
	public ConstructorConcept(int i) {
		
		System.out.println("Single Param Constructor");
		System.out.println("The value of i is "+i);
	}
	
	
public ConstructorConcept(int i,int j) {
		
		System.out.println("two Params Constructor");
		System.out.println("The value of i "+i);
		System.out.println("The value of j "+j);
	}

//can we overload a constructor - yes, constructor can be overloaded as well


	public static void main(String[] args) {

		
		ConstructorConcept con = new ConstructorConcept();
		ConstructorConcept con1 = new ConstructorConcept(25);
		ConstructorConcept con2 = new ConstructorConcept(26,27);

		
	}

}
