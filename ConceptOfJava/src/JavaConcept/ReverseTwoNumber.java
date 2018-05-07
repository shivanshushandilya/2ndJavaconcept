package JavaConcept;

public class ReverseTwoNumber {

	public static void main(String[] args) {
		int num=165433214;
		int rev=0;
		while(num !=0)
		{
			rev=rev*10;
			rev= rev+num%10;
			num=num/10;
		}
		
		System.out.println("Reverse No is :" +rev);

	}

}
