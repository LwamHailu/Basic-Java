package lesson5;


import java.time.LocalDate;

 public class DeptEmployee {
 private String  name;
 protected double salary;
 private LocalDate hiredate;
 public DeptEmployee(String name,LocalDate hiredate,double salary){
	 this.name=name;
	 this.salary=salary;
	 this.hiredate=hiredate;
	 
 }
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public LocalDate getHiredate() {
	return hiredate;
}
public void setHiredate(LocalDate hiredate) {
	this.hiredate = hiredate;
}
public double computeSalary(){
	return salary;
	
} 
	

}
