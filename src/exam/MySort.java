package exam;

import java.util.Comparator;

public class MySort implements Comparator<Person> {

	//@Override
	public int compare(Person o1, Person o2) {
if(o1.getSalary()>o2.getSalary())
	return 1;
else if(o1.getSalary()<o2.getSalary())
	return -1;
		return 0;
	}

	//@Override
//	public int compare(Object o1, Person o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	

}
