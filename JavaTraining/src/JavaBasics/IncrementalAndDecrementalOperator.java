package JavaBasics;

public class IncrementalAndDecrementalOperator {

	public static void main(String[] args) {
		
		
		int i = 1;
		int j = i++;  //post increment   - give value of i(1) to j and then increment i
		
		
		
		System.out.println(i);
		
		System.out.println(j);
		
		
		System.out.println("************** ");
		
		int a = 2;
		int b = ++a;  // pre increment  - increase the value of a and then give value to b
		
		
         System.out.println(a);
		
		System.out.println(b);
		
		System.out.println("************** ");
		
		
		int m = 3;
		int n = m--;   // post decrement 
		
        System.out.println(m);
		
		System.out.println(n);
		
		System.out.println("************** ");
		
		
		int x = 3;
		int y = --x;  // pre decrement
		
		 System.out.println(x);
			
			System.out.println(y);
			
			System.out.println("************** ");
			
			
			
			int r=10;  
			System.out.println(r++);  
			System.out.println(++r); 
			System.out.println(r--);  
			System.out.println(--r);  
			
			System.out.println("************** ");
			
			int c=10;  
			int d=10;  
			System.out.println(c++ + ++c);
			System.out.println(d++ + d++);
			
			System.out.println("************** ");
			
			int e=10;  
			int f=-10;  
			boolean g=true;  
			boolean h=false;  
			System.out.println(~e);
			System.out.println(~f); 
			System.out.println(!g); 
			System.out.println(!h);
			
			
			
			int o=10;  
			int p=5;  
			int min=(o<p)?o:p;  
			System.out.println(min);  
		

	}

} 
