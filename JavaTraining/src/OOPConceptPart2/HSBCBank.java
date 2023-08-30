package OOPConceptPart2;

public class HSBCBank implements USBank,BrazilBank{  // We are achieving multiple Inheritance
	//Is-a relationship
	
	//If a class is implementing any Interface, then it is mandatory to define/override all the methods of that Interface
	
   //overriding from USBank
	public void credit() {
		System.out.println("hsbc---credit");
	}
	
	public void debit() {
		System.out.println("hsbc---debit");
	}
	
	
	public void transferMoney() {
		System.out.println("hsbc---transferMoney");
	}
	
	//separate method of HSBCBank class
	public void educationLoan() {
		
		System.out.println("hsbc---education Loan");
	}
	
	
    public void carLoan() {
		
		System.out.println("hsbc---car Loan");
	}
	

    ////overriding from BrazilBank
     public void mutualFund() {
	
	System.out.println("hsbc---mutual fund");
}

	
	
}
