
public class Ssn {

	public static void main(String[] args) {
		Ssn age=new Ssn();
		print(age.ssnE(6));
		
	}
	
	public int ssnE(int age){
		
		if(age>65)
			return  1;
		else 
			return 0;
	}
	public static void print(int a){
		if(a==1)
			System.out.println("eligible");
		else
			System.out.println("ineligible");
		
		
	}

}
