package fPPExam.copy;

public class Manager implements Payable {

	private String name;
	private  double salary;
	private double bonas;
	
	public Manager(String name,double salary ,double bonas){
		this.name=name;
		this.salary=salary;
		this.bonas=bonas;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBonas() {
		return bonas;
	}
	public void setBonas(double bonas) {
		this.bonas = bonas;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double getSalary() {
		
		return  salary+bonas;
	}
public String  toString() {
		
		return String.format("\nName"+getName()+" Salary "+getSalary()+" Bonas "+getBonas());
	}

}
