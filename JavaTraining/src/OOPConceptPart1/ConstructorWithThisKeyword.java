package OOPConceptPart1;

public class ConstructorWithThisKeyword {
	
	
	
	String name1;
	int age1;
	
	
	
	public ConstructorWithThisKeyword(String name, int age) {
		
//		this.name=name;   this keyword is used if the local variable and global/class variables have same naming convention used to identify the same
//		this.age=age;
		name1=name;
		age1=age;
		
		System.out.println(name);
		System.out.println(age);
		
	}
	
	

	public static void main(String[] args) {

		
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom",33);
		
		
		
	}

}
