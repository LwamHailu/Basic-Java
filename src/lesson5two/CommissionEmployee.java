package lesson5two;

public class CommissionEmployee extends Employee {
private double grossSales;
private double commissionRtae;
	public CommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double commissionRtae, double grossSales) {
		super(firstName,lastName,socialSecurityNumber);
		this.grossSales=grossSales;
		this.commissionRtae=commissionRtae;
	}
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		if(grossSales>=0.0){
		this.grossSales = grossSales;
	}
		else
		throw new IllegalArgumentException( 
				"Gross sales must be >= 0.0" );
		
		}
	public double getCommissionRtae() {
		return commissionRtae;
	}
	public void setCommissionRtae(double commissionRtae) {
		this.commissionRtae = commissionRtae;
	}
	@Override
	
	public String toString(){
//		return String.format("%s %s %s %2f %2f"+ super.toString()+" "+getCommissionRtae() +" "+getGrossSales());
		return String.format(super.toString()+"Commision: "+this.getCommissionRtae()+" gross "+getGrossSales());
	}
	
	@Override
	public double getPayAmount() {
		return getGrossSales()*getCommissionRtae();
	}
	
	
}
