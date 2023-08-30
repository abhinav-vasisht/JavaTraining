package OOPConceptPart1;

public class TestClassCar {
	
	//class variables  
	
	int mod;
	int wheel; 
	

	public static void main(String[] args) {
	
		
		//new TestClassCar(); -- this is object of TestClassCar class 
		//new keyword/operator is used to create the object 
		//a and b are object reference variables
		
		TestClassCar a = new TestClassCar(); 
		TestClassCar b  = new TestClassCar(); 
		TestClassCar c  = new TestClassCar(); 
		
		a.mod = 2023;
		a.wheel = 18;
		
		b.mod=2021;
		b.wheel=17;
		 
	//	b.mod=2020;
		
		
		c.mod=2018;
		c.wheel=16;
		
		
		System.out.println("***********");
		
		System.out.println("before reference change");
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		a=b;
		b=c;
		c=a;
		
		System.out.println("***********");
		
		
		
		System.out.println("after reference change");
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		a.mod=10;
		System.out.println(a.mod);  //10
		c.mod=20;
		System.out.println(a.mod);   //20 
		
		
		
	}

}
