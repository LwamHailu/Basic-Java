package exam;

public class Person2 {
	private String name;
	private int age;
public Person2(String name,int age){
	this.name=name;
	this.age=age;
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
public boolean equals(Object o){
	if(o==null)
		return false;
	else if(!(o instanceof Person2)){
		return false;
		}
	Person2 p=(Person2)o;
	
	//Boolean result= this.getIprice()==p.getIprice()&&this.getIname().equals(p.getIname())&&this.getPdate().equals(p.getPdate());
	return this.getName().equals(p.getName())&&this.getAge()==p.getAge();
}
public int hashCode(){
//	int ret = 17;
//	ret = ret*31 + this.getName().hashCode();
	return 12*this.getName().hashCode()*this.getAge();
}
@Override
public String toString() {
	return getName();
}


}
