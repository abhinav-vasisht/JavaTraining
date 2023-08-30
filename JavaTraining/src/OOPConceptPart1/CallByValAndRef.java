package OOPConceptPart1;

public class CallByValAndRef {
	
	int p;
	int q;

	

	public static void main(String[] args) {
		
		
		CallByValAndRef obj = new CallByValAndRef();
		
		int x = 10;
		int y = 20;
		
		int d = obj.testSum(x, y);  //call by value or pass by value
		
		System.out.println(d);
		
		
		obj.p=50;
		obj.q=60;
		
		obj.swap(obj);
		
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q );
		 
	}
	
	 
	
	public int testSum(int a, int b) {
		
		a=30;
	 	b=40;
		int c = a+b;
		
		return c;
	}
	
	
	//call by reference 
	public void swap(CallByValAndRef t) {
		
		int temp;
		
        temp = t.p;  // temp = 50
        t.p = t.q;   // t.p = 60
        t.q = temp;   // t.q = 50
		
		
		
	}
	

}
