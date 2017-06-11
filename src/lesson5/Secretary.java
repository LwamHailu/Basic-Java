package lesson5;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
	private int overTimeHours;
	
	public Secretary(String name,LocalDate hiredate,double salary,int overTimeHours) {
		super(name,hiredate,salary);
		this.overTimeHours=overTimeHours;
		
	}
	public double getOverTimeHours() {
		return overTimeHours;
	}
	public void setOverTimeHours(int overTimeHours) {
		this.overTimeHours = overTimeHours;
	}
	@Override
	public double computeSalary(){
		return salary+12*overTimeHours;
		
	} 
	

}
