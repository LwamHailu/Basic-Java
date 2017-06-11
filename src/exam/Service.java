package exam;

public class Service extends AProduct {
private double hourlyRate;
int hoursWorked;
	public Service(String name,String number,double hourlyRate,int hoursWorked) {
	super(name,number);	
	this.hourlyRate=hourlyRate;
	this.hoursWorked=hoursWorked;
	}
	@Override
	double getPricce() {
		
		return hourlyRate*hoursWorked;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
		
	}
	public String toString(){
		return String.format(getName()+" "+ getNumber()+" "+getPricce()+" "+getHoursWorked());
		
	}

}
