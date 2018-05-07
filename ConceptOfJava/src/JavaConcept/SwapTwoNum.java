package JavaConcept;

public class SwapTwoNum {

	public static void main(String[] args) {
		int a = 30;
		int b = 40;
	
		b=a+b-(a=b);

		System.out.println("swaping the Value Of First Varaible A is: " + a);
		System.out.println("swaping the Value Of First Varaible B is: " + b);
		
	}

}
