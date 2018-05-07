package Constrator;

public class SamleCons {

	static String Name;
	int empId;

	public SamleCons(String Name, int empId) {
		this.Name = Name;
		this.empId=empId;
		System.out.println("Name is:"+Name);
		System.out.println("EmpId Is :"+empId);
	}

	public static void main(String[] args) {
		SamleCons cons= new SamleCons("Alam",30);
	

	}

}
