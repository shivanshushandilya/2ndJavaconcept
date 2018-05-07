package Constrator;

public class HDFCBank extends AbstractConcept {

	public static void main(String[] args) {
		HDFCBank abd= new HDFCBank();
		abd.CreditCardPolicy();
		abd.CurrentAc();
		abd.loan();
		abd.Locker();
		abd.SavingAc();

	}

	@Override
	public String loan() {
	System.out.println("This is Loan");
		return null;
	}

	@Override
	public void CreditCardPolicy() {
		System.out.println("credit policy guide line Hdfc Bank");

	}
	
	
	public void Locker() {
		
		System.out.println("We have Locker Facility ");
		
	}
	

}
