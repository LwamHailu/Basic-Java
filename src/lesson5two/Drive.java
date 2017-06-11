package lesson5two;

public class Drive {

	public static void main(String[] args) {
		Payable objects[]=new Payable[5];//array
		objects[0]=new Invoice("code1","teacher",7,375.00);
		objects[1]=new HourlyEmployee("lwam","hailu","129-76-45",1234,6);
		objects[2]=new BasePlusCommusionEmployee("lkuki","hailu","1134-76-34",3215,3.5,5000);
		objects[3]=new CommissionEmployee("alon","hailu","1164-12-63",2.5,4000);
		objects[4]=new SalariedEmployee("feven","abarham","2234-23-27",3);

		System.out.println("CommissionEmployee\n"+objects[3].toString());
		System.out.println("Invoice\n"+objects[0].toString());
		System.out.println("HourlyEmployee\n"+objects[1].toString());
		System.out.println("BasePlusCommusionEmployee\n"+objects[2].toString());
		System.out.println("SalariedEmployee\n"+objects[4].toString());
		System.out.println("\nthe Payamount for everyone is");
	   for(Payable o:objects)
			
	 System.out.println("payAmount "+o.getPayAmount()+" ClassName "+o.getClass().getSimpleName());
	
	}

}
