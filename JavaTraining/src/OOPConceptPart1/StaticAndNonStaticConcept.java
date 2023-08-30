 package OOPConceptPart1;

public class StaticAndNonStaticConcept {

	String name = "Tom";    //non static global variable
	static  int age = 33;    //static global variable
	
	
	public static void main(String[] args) {

		
		sum();
		StaticAndNonStaticConcept.sum();
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		
		StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
		
		System.out.println(obj.name);
		obj.sendMail(); 
		
		obj.sum();     //1 warning will be given --> The static method sum()  from the type StaticAndNonStaticConcept should be accessed in a static way
		System.out.println(obj.age  );
		
	}
	
	public void sendMail() {					//non static method
		
		System.out.println("send mail method");
	}
	
	
	public static void sum() {					//static method
		
		
		System.out.println("sum method ");
	}
	
	
	

}
