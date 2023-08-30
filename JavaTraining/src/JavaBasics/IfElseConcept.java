package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 60;
		 a = 50;
		 int c = 40;
		
		if (b>a) {
			
			System.out.println("b is greater than a");
		}
		else 
		{
			System.out.println("a is greater than b"); 
		
		
		}
		//comparison operators 
		// < > <= >= == =!
		
		System.out.println("the real problem with my family is :"+(a*b));
		
		
		if(a>b & a>c)
		{
			System.out.println("the largest number is: "+a);
		
		}else if(b>c) {
			
			System.out.println("the largest number is: "+b);
			
		}
		
		else {
			System.out.println("the largest number is: "+c);
		}
			
		
		
		
	}

}
