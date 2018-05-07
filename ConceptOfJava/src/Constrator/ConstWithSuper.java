package Constrator;

public class ConstWithSuper extends SamleCons {
	


	public ConstWithSuper(String Name, int empId ,String Position) {
		super(Name, empId);
		 Position=Position;
		 System.out.println("He Is Working As :" +Position);
	
		
		
	}

	public static void main(String[] args) {
		
		ConstWithSuper consdr= new ConstWithSuper("Allan",30,"manger");
	}

}
