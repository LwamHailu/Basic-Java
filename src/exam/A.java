package exam;

public class A implements Comparable<A>{
int age=25;
public A(int age){
	this.age=age;
}
public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}


//	@Override
//	public int compareTo(Object o) {
//		
//		return this.age-o.getAge();
//	}

	@Override
	public int compareTo(A o) {
		// TODO Auto-generated method stub
		return this.getAge()-o.getAge();
	}

	
}