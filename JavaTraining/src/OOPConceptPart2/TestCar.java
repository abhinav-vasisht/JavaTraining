package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {

		
		BMW b = new BMW();
		
		//static polymorphism -- compile time polymorphism
		b.start();  
		b.stop(); 
		b.refuel();
		b.theftSafety();
		b.engine(); 
		
		System.out.println("**********");
		
		Car c = new Car();
		
		c.start(); 
		c.stop();
		c.refuel();
		
		System.out.println("**********");
		
		//Top Casting 
		Car c1 = new BMW(); //child car object can referred by parent class reference variable  -- dynamic polymorphism or run-time polymorphism 
		
		c1.start(); 
		c1.stop(); 
		c1.refuel();
		
		//Down Casting
		
		BMW b1 = (BMW)  new Car();   //java.lang.ClassCastException 
		
		
		
		 
	}

}
