package lesson5two;

public class BasePlusCommusionEmployee extends CommissionEmployee {
private double basesalary;
	public BasePlusCommusionEmployee(String firstName,String lastName,String socialSecurityNumber, double grossSales, double commissionRtae , double basesalary) {
		super(firstName,lastName,socialSecurityNumber,commissionRtae, grossSales);
		this.basesalary=basesalary;
	}

	public double getBasesalary() {
		return basesalary;
	}

	public void setBasesalary(double basesalary) {
		this.basesalary = basesalary;
	}

	@Override

	public String toString(){
		return String.format( super.toString()+" Base salary is "+getBasesalary());
	}

	@Override
	public double  getPayAmount()  {
		return getBasesalary()+getCommissionRtae()+getGrossSales();
		
	}

	
	
}
