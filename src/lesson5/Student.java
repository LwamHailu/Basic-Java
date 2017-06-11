package lesson5;

public class Student extends Person {
	 private  double GPA;
	 private  String major;
	 private   int yearOfgraduation;

    
	public Student(String name,String major,int yearOfgraduation,double GPA,String socialsecurity,int age,String gender,String adress,double telephoneNo) {
		super(name,socialsecurity,age,gender, adress, telephoneNo);
		this.GPA=GPA;
		this.major=major;
		this.yearOfgraduation=yearOfgraduation;
		
		
	}
	public String getMajor() {
		return major;
	}
	public double getYearOfgraduation() {
		return yearOfgraduation;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(float gPA) {
		GPA = gPA;
	}
	public void display(){
		System.out.println("\nthe Name is "+getName()+"Age is "+getAge()+" Gender "+getGender()+"\nSocial security "+getSocialsecurity());
		System.out.println("adress "+getAdress()+" telephone  "+getTelephoneNo());
		System.out.println("major of study is "+getMajor()+"year of graduation "+getYearOfgraduation()+"Comulative GPA "+getGPA());
	}

}

