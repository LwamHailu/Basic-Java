package lesson5;

public class Person {
	 private  String name;
     private  String socialsecurity;
     private  int age;
     private  String gender;
     private  String adress;
     private  double telephoneNo;
       
     public Person(){
    	 
     }
      public Person(String name,String socialsecurity,int age,String gender,String adress,double telephoneNo) {
    	  this.name=name;
    	  this.socialsecurity=socialsecurity;
    	  this.age=age;
    	  this.gender=gender;
    	  this.adress=adress;
    	  this.telephoneNo=telephoneNo;
		}
	
	public String getName() {
		return name;
	}

	public String getSocialsecurity() {
		return socialsecurity;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getAdress() {
		return adress;
	}

	public double getTelephoneNo() {
		return telephoneNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSocialsecurity(String socialsecurity) {
		this.socialsecurity = socialsecurity;
	}
	

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setTelephoneNo(double telephoneNo) {
		this.telephoneNo = telephoneNo;
	}
	public void display(){
		
		System.out.println("the Name is "+getName()+"Age is "+getAge()+" Gender "+getGender()+"\nSocial security "+getSocialsecurity());
		System.out.println("adress "+getAdress()+" telephone  "+getTelephoneNo());
		
	}

}
