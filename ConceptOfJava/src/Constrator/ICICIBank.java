package Constrator;

public class ICICIBank implements  Bank {
	
	
	public static void main(String[] args) {
		
		Bank bn=new ICICIBank();
		bn.Credit();
		bn.Loan();
		bn.Investment();
		
	}

	@Override
	public void Loan() {
		
		System.out.println("Loan Process in ICICI ");
		
		
	}

	@Override
	public void Credit() {
		
		System.out.println("Credit Critiria in ICICI");
	}

	@Override
	public void Investment() {
		System.out.println("Want To Invest ");
		
	}

}
