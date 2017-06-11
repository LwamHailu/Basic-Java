package exam;

import java.util.ArrayList;
import java.util.Collections;

public class Question{
	public static void main(String []args){
		Question a=new Question();	
   A obj1=new A(12);
	A obj2=new A(10);
	ArrayList<A>list=new ArrayList<A>();
	list.add(obj1);
	list.add(obj2);
	Collections.sort(list);;
	System.out.println(list.toString());
}

	
}


