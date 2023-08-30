package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //1. while loop
		//disadvantage of while loop : infinite loop will be generated if developer didn't put increment or decrement   
		
		
		int i = 1; //initialization
		System.out.println("The initial value of i is: "+i);
		
		while(i<=10) { //condition
			
			System.out.println("The value of i post increment is: "+i);	
		i++; // incremental or decremantal part
			
			
		}
		
		System.out.println("***************");
		
		
		//2. for loop
		
		
		for(int j = 1;j<10;j++) {    //initialization, conditional, incremental part
			
			
			
			System.out.println("Value of j is: "+j);
		}
		
		
		System.out.println("***************");
		
		
    for(int k = 1;k>=1;k--) {    //initialization, conditional, incremental part
			
			
			
			System.out.println("Value of k is: "+k);
		}
		
		
		
		
		
		
	}

}
