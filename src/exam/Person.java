package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Person implements Comparable<Person>{
	private int age;
	private String name;
	private double salary;
	private int weight;
	Person(int age,String name,double salary,int weight){
		this.age=age;
		this.name=name;
		this.salary=salary;
		this.weight=weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
// if(this.getAge()>o.getAge()){
//		return 1;}
// else if(this.getAge()<o.getAge()){
//	 
//	 return -1;
// }
 return -1*(this.getAge()-o.getAge());
 
//return 0;
	}

	

//	@Override
//	public int compareTo(Object o) {
//		Person s=(Person)o;
//		return (this.getAge()-s.getAge());
//	}

	public String toString(){
		return String.format(" "+getAge()+" "+getWeight()+" "+getSalary()+" "+getName());
	}

	public static void main(String[] args) {
//	MySort s =new MySort();	
	MySort2 s2=new MySort2();
Person p1 =new Person(23,"charles",6000,150);
Person p2 =new Person(27,"feven",456,67);
Person p3 =new Person(24,"lwam",3000,45);
ArrayList<Person>list=new ArrayList<Person>();
list.add(p1);
list.add(p2);
list.add(p3);
Collections.sort(list);
//System.out.println(list);
//Collections.sort(list, s);
for(Person a:list){
System.out.println(a);

}
Collections.sort(list, s2);

for(Person b:list){

System.out.println(b.getWeight());
}
	}

}
