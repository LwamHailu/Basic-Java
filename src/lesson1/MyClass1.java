package lesson1;



public class MyClass1{
	
	MyClass1(){
		AnotherClass s=new AnotherClass(this);
	}
public static void main(String[] args) { 
	new MyClass1();
}
private void myMethod(){
	System.out.println("java");
}

class AnotherClass{
	AnotherClass(MyClass1 m){
		m.myMethod();
	}
}
}
