package lesson5two;

import java.util.HashSet;
import java.util.Set;

public class Person1 {
	private String name;
	private int age;
	
	Person1(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	  public boolean equals(Object p){
		  if(!(p instanceof Person1))
			  return false;
		 Person1 p1=(Person1 ) p;
		
		return this.getAge()==p1.getAge();
		
	}
	@Override
	 public int hashCode(){
		
		int hash=17;
		int result=hash*31+this.getAge()*this.getName().hashCode();
		return result;
	}
	

  public static void main(String[] args) {
		Person1 p1=new Person1("lwam",26);
	Person1 p2=new Person1("charles",43);
	Person1 p3= new Person1("lwam",26);
	//Person1 p4=p3;		
    System.out.println(p1.equals(p3));
    System.out.println(p2.equals(p3));
    System.out.println(p1.hashCode());
    System.out.println(p3.hashCode());
    System.out.println(p2.hashCode()); 
  }

}
