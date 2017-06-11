package lesson5two;

public  class HourlyEmployee extends Employee{
private double wage;
private double hours;
	public HourlyEmployee(String firstName,String lastName,String socialSecurityNumber,double wage,double hours) {
		super(firstName,lastName,socialSecurityNumber);
		this.wage=wage;
		this.hours=hours;
	}
	@Override
	public double getPayAmount() {
	return getWage()+getHours();
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	
	public String toString(){
		return String.format(super.toString()+" HOurs "+getHours() +" Wage "+getWage());
	}
	
	
	

}
