package lesson5two;

public   class SalariedEmployee extends Employee {
private double weeklySalary;
	public SalariedEmployee(String firstName,String lastName,String socialSecurityNumber,double weeklySalary) {
		super(firstName,lastName,socialSecurityNumber);
		this.weeklySalary=weeklySalary;
	}

	@Override
	public double getPayAmount() {
		return getWeeklySalary();
		}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	public String toString(){
		return String.format(super.toString()+"Weekly salary "+getWeeklySalary());
	}

	

	
	
}
