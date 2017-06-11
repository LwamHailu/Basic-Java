package lesson5two;

public abstract class Employee implements Payable{
private String firstName;
private String lastName;
private String socialSecurityNumber;
	public Employee(String firstName,String lastName,String socialSecurityNumber) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.socialSecurityNumber=socialSecurityNumber;
	}
 public abstract double getPayAmount();
	public String getfirstName(){
		return firstName;
	}
	public String getlastName(){
		return lastName;
		}
	public String getsocialSecurityNumber(){
		return socialSecurityNumber;
	}
public void setfirstName(String firstName){
	this.firstName=firstName;
	}
public void setlastName(String lastName){
	this.firstName=lastName;
	}
public void setsocialSecurityNumber(String socialSecurityNumber){
	this.socialSecurityNumber=socialSecurityNumber;
	}
public String toString(){
	return String.format("First Name "+getfirstName()+" LastName  "+getlastName()+" SSN "+getsocialSecurityNumber());
};
}
