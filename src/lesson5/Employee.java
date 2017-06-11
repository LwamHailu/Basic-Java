package lesson5;



public class Employee extends Person {

	 private   String department;
	 private   String jobtitle;
	 private   int hiredate;
	 
  public Employee(String name,String jobtitle,int hiredate,String department,String socialsecurity,int age,String gender,String adress,double telephoneNo) {
	  super(name,socialsecurity,age,gender,adress,telephoneNo);
	  this.department=department;
	  this.jobtitle=jobtitle;
	  this.hiredate=hiredate;
		
	}
public String getDepartment() {
	return department;
}
public String getJobtitle() {
	return jobtitle;
}
public int getHiredate() {
	return hiredate;
	}
public void display(){
	System.out.println("\nthe Name is "+getName()+"Age is "+getAge()+" Gender "+getGender()+"\nSocial security "+getSocialsecurity());
	System.out.println("adress "+getAdress()+" telephone  "+getTelephoneNo());
	System.out.println("Title"+getJobtitle()+"in the depatmet"+getDepartment()+"Hiredate"+getHiredate());
	
	
}
}
