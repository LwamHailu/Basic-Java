package lesson5;

public class SalariedEmplo extends Employee {
   private double salary;
	
	public SalariedEmplo(String name,double salary,String department,String jobtitle,int hiredate,String socialsecurity,int age,String gender,String adress,double telephoneNo) {
		super(department, jobtitle, hiredate,name,socialsecurity, age,gender,adress,telephoneNo);
		this.salary=salary;
		}
	public double getSalary() {
		return salary;
	}
	public void display(){
		System.out.println("\nthe Name is "+getName()+"Age is "+getAge()+" Gender "+getGender()+"\nSocial security "+getSocialsecurity());
		System.out.println("adress "+getAdress()+" telephone  "+getTelephoneNo());
		System.out.println("Title"+getJobtitle()+"in the depatmet"+getDepartment()+"Hiredate"+getHiredate());
		System.out.println(getSalary());
	}

}
