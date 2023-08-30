package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {

		 String x =  "100";
		 
		 System.out.println(x+20 );
		 
		 //data conversion from string to integer 
		
		int i = Integer.parseInt(x);
		
		System.out.println(i+20 );
		
		//Different wrapper classes like Integer,Double,Boolean
		
		
		// String to Duble
		 String y = "12.33";
		 
		 System.out.println(y+10);
		 
		 double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		
		//String to Boolean
		
		String k= "true";
		
		System.out.println();
		
		boolean b = Boolean.parseBoolean(k); 
		
		System.out.println(b);
		
		//Integer to String
		
		int j = 200;
		
		String s = String.valueOf(j);
		
		System.out.println(s+20);
		
		String u = "100A";
		
		int v = Integer.parseInt(u);
		
		System.out.println(u);      //java.lang.NumberFormatException
		
		
		
		
		
	}

}
