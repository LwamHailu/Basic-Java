


//import java.sql.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

import exam.Item;
import exam.Person2;

public class Main1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Person2 s=new Person2("lwam",23);
		Person2 s1=new Person2("lwam",27);
		Date d;
//		System.out.println(s1.equals(s));
//		System.out.println(s1.hashCode());
//		System.out.println(s.hashCode());
		//long millis=System.currentTimeMillis();  
		//Date date=new java.util.Date();  
		System.out.println(new SimpleDateFormat("MM/dd/yyyy").format(new Date()));  

	}

}
