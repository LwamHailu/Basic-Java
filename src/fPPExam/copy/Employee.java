package fPPExam.copy;

public class Employee implements Payable{
private String name;
private  double salary;
 public Employee(String name,double salary){
	 this.name=name;
	 this.salary=salary;
 }
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void setSalary(double salary) {
	this.salary = salary;
}

	@Override
	public double getSalary() {
		return salary;
		}
	public String  toString() {
		
		return String.format("\nName "+getName()+" Salary "+getSalary());
	}

}
