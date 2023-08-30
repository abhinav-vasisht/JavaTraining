package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {

		HSBCBank hs = new HSBCBank();
		
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		
		//dynamic polymorphism
		//child class object can be refereed by parent INterface reference variable
		
		System.out.println("********");
		
		USBank b = new HSBCBank();
		
		
		b.credit();
		b.debit();
		b.transferMoney();
		
		
	//	USBank.min_bal = 200;
		System.out.println(USBank.min_bal);
		
		
		
	}

}
