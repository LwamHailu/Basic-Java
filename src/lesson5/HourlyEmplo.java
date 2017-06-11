package lesson5;

public class HourlyEmplo extends Employee {
	 private double hourlyRate;
	 private double hoursworked;
	 private double unionDues;
	 public HourlyEmplo(String name,double hourlyRate,double hoursworked,double unionDues,String department,String jobtitle,int hiredate,String socialsecurity,int age,String gender,String adress,double telephoneNo) {
		super(department, jobtitle, hiredate,name,socialsecurity, age,gender,adress,telephoneNo);
	
	 this.hourlyRate=hourlyRate;
	 this.hoursworked=hoursworked;
	 this.unionDues=unionDues;
	  }
	  public double getHourlyRate() {
		return hourlyRate;
	}
	public double getHoursworked() {
		return hoursworked;
	}
	public double getUnionDues() {
		return unionDues;
	}
	public void display(){
		System.out.println("\nthe Name is "+getName()+"Age is "+getAge()+" Gender "+getGender()+"\nSocial security "+getSocialsecurity());
		System.out.println("adress "+getAdress()+" telephone  "+getTelephoneNo());
		System.out.println("Title"+getJobtitle()+"in the depatmet"+getDepartment()+"Hiredate"+getHiredate());
		System.out.println(getHiredate()+getHoursworked()+getUnionDues());
	}
	 

}
