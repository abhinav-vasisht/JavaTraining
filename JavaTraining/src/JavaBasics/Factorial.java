package JavaBasics;

public class Factorial {

	public static void main(String[] args) {
	
		int x = 5;
		int f=1;
		int g=1;
		
		
		for(int j=1;j<=x ;j++) {
			
			
			f= f*j;
			
		}
		
		System.out.println(f);
		
		
		
		for (int i=x;i>=1;i--)
		{
			g=g*i;
		}
		System.out.println(f);
		
		
	}

}
