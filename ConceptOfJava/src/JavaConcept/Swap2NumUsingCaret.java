package JavaConcept;

public class Swap2NumUsingCaret {

	public static void main(String[] args) {
		
		int a=2;
		int b=44;
		a=a^b;
		b= a^b;
		a=a^b;
		
		System.out.println("Swaping value of A is:" +a);
		System.out.println("Swaping value of B is:" +b);

	}

}
